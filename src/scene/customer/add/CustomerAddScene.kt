package scene.customer.add

import base.scene.SubScene
import base.scene.command.Command

class CustomerAddScene : SubScene() {
    override val commandList: ArrayList<Command>
        get() = arrayListOf()

    override fun parseCommand(commandID: Int) {
        throw NoSuchElementException()
    }
}