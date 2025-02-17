class User {
    val profileData: String by lazy {
        println("Loading profile data...")
        "User Profile: John Boeder"
    }
}

fun main() {
    val user = User()
    println("User object created.")
    println(user.profileData) // init
    println(user.profileData) // saved data
}
