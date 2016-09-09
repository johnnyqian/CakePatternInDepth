package CakePattern

/**
  * Created by Johnny on 2016/9/9.
  */
trait UserServiceComponent {
  def userService: UserService

  trait UserService {
    def findAll: java.util.List[User]
    def save(user: User)
  }
}
