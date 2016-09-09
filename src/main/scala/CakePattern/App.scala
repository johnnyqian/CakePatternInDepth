package CakePattern

import javax.persistence.Persistence

/*
* Cake pattern in depth, http://www.cakesolutions.net/teamblogs/2011/12/19/cake-pattern-in-depth
* */

object App {
  def main(args: Array[String]) {
    val userServiceComponent = new DefaultUserServiceComponent with UserRepositoryJPAComponent {
      val em = Persistence.createEntityManagerFactory("cake.pattern").createEntityManager()
    }
    val userService = userServiceComponent.userService
    userService.findAll
  }
}
