fun main() {
    var ps = PurpleShroom()
    ps.startConnection("//", 80)

    val user = ps.getUser(331431342438875137)

    println(user)

    ps.stopConnection()
}