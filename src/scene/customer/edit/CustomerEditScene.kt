package scene.customer.edit

import base.scene.SubScene
import base.scene.command.Command

class CustomerEditScene : SubScene() {
    override val commandList: ArrayList<Command>
        get() = arrayListOf()

    override fun parseCommand(commandID: Int) {
        throw NoSuchElementException()
    }
}