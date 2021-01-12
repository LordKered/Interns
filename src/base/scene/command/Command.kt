package base.scene.command

abstract class Command(val id: Int, val text: String) {
    override fun toString(): String {
        return "$id. $text"
    }
}
