package scene.customer

import base.scene.SubScene
import base.scene.command.Command

class CustomerScene : SubScene() {
    override val commandList: ArrayList<Command>
        get() = arrayListOf()

    override fun parseCommand(commandID: Int) {
        throw NoSuchElementException()
    }
}