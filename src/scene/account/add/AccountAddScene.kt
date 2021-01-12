package scene.account.add

import base.scene.SubScene
import base.scene.command.Command

class AccountAddScene : SubScene() {
    override val commandList: ArrayList<Command>
        get() = arrayListOf()

    override fun parseCommand(commandID: Int) {
        throw NoSuchElementException()
    }
}