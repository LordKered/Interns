package scene.customer.list

import base.scene.command.Command
import scene.list.ListScene

class CustomerListScene : ListScene() {
    override val commandList: ArrayList<Command>
        get() = arrayListOf()

    override fun sortByAscending() {
        TODO("Not yet implemented")
    }

    override fun sortByDescending() {
        TODO("Not yet implemented")
    }

    override fun parseCommand(commandID: Int) {
        throw NoSuchElementException()
    }
}