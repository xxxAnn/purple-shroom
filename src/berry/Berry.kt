package berry

import utils.Pair
import utils.Parser

open abstract class Berry {

    abstract val berryName: String;

    private val parser = Parser()

    fun parseInventory(text: String): List<Pair<Int, Int>> = parser.parseInventory(text)
    fun parsePosition(text: String): Pair<Int, Int> = parser.parsePosition(text)
    abstract fun toPairs(): List<Pair<String, String>>;

    override fun toString(): String {
        val pairText = toPairs().joinToString(", ") {
            "${it.first()}: ${it.second()}"
        }
        return "$berryName(${pairText})"
    }
}