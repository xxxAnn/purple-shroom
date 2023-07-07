package berry

import utils.Pair

class User(text: Array<String>) : Berry() {

    override val berryName = "User"
    override fun toPairs(): List<Pair<String, String>> {
        return listOf(
            Pair("ID", id.toString()),
            Pair("Inventory", inventory.toString()),
            Pair("Balance", balance.toString()),
            Pair("Position", position.toString()),
            Pair("Energy", energy.toString())
        )
    }

    val id = text[0].toLong()
    val inventory = this.parseInventory(text[1])
    val balance = text[2].toInt()
    val position = this.parsePosition(text[3])
    val energy = text[4].toInt()

}
