package CakePattern

import java.util
import javax.persistence.{TypedQuery, EntityManager}

import org.specs2.mutable.Specification
import org.specs2.mock.Mockito

/**
  * Created by Johnny on 2016/9/9.
  */
class CakeTestSpecification extends Specification with Mockito  {
  trait MockEntitManager {
    val em = mock[EntityManager]

    def expect(f: (EntityManager) => Any) {
      f(em)
    }
  }

  "findAll should use the EntityManager's typed queries" in {
    val query = mock[TypedQuery[User]]
    val users: java.util.List[User] = new util.ArrayList[User]()

    val userService = new DefaultUserServiceComponent
      with UserRepositoryJPAComponent
      with MockEntitManager
    userService.expect { em =>
      em.createQuery("from User", classOf[User]) returns query
      query.getResultList returns users
    }

    userService.userService.findAll must_== users
  }
}
