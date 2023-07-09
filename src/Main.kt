fun main() {
    var ps = PurpleShroom()
    ps.startConnection("127.0.0.1", 8080)

    val user = ps.getUser(331431342438875137)

    println(user)

    ps.stopConnection()
}