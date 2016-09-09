package CakePattern

/**
  * Created by Johnny on 2016/9/9.
  */
trait DefaultUserServiceComponent extends UserServiceComponent {
  this: UserRepositoryComponent =>

  def userService = new DefaultUserService

  class DefaultUserService extends UserService {
    def findAll = userLocator.findAll

    def save(user: User) {
      userUpdater.save(user: User)
    }
  }
}