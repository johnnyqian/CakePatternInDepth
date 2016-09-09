package CakePattern

import javax.persistence._

/**
  * Created by Johnny on 2016/9/9.
  */
trait UserRepositoryJPAComponent extends UserRepositoryComponent {
  val em: EntityManager
  def userLocator = new UserLocatorJPA(em)
  def userUpdater = new UserUpdaterJPA(em)

  class UserLocatorJPA(val em: EntityManager) extends UserLocator {
    def findAll = em.createQuery("from User", classOf[User]).getResultList
  }
  class UserUpdaterJPA(val em: EntityManager) extends UserUpdater {
    def save(user: User) { em.persist(user) }
  }
}
