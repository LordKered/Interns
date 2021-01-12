package scene.account.balance

import base.scene.SubScene
import base.scene.command.Command

class AccountBalanceScene : SubScene() {
    override val commandList: ArrayList<Command>
        get() = arrayListOf()

    override fun parseCommand(commandID: Int) {
        throw NoSuchElementException()
    }
}