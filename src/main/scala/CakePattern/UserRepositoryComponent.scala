package CakePattern

/**
  * Created by Johnny on 2016/9/9.
  */
trait UserRepositoryComponent {
  def userLocator : UserLocator
  def userUpdater : UserUpdater
  trait UserLocator {
    def findAll: java.util.List[User]
  }
  trait UserUpdater {
    def save(user: User)
  }
}
