package scene.customer.select

import base.scene.SubScene
import base.scene.command.Command

class CustomerSelectionScene : SubScene() {
    override val commandList: ArrayList<Command>
        get() = arrayListOf()

    override fun parseCommand(commandID: Int) {
        throw NoSuchElementException()
    }
}