package scene.account.contribution

import base.scene.SubScene
import base.scene.command.Command
import scene.list.ListScene

class AccountContributionScene : SubScene() {
    override val commandList: ArrayList<Command>
        get() = arrayListOf()

    override fun parseCommand(commandID: Int) {
        throw NoSuchElementException()
    }
}