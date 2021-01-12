package scene.account.withdrwaing

import base.scene.SubScene
import base.scene.command.Command

class AccountWithdrawingScene : SubScene() {
    override val commandList: ArrayList<Command>
        get() = arrayListOf()

    override fun parseCommand(commandID: Int) {
        throw NoSuchElementException()
    }
}