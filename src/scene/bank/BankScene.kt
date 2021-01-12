package scene.bank

import base.router.command.RouterCommand
import base.scene.SubScene
import base.scene.command.Command
import scene.customer.add.CustomerAddScene
import scene.customer.list.CustomerListScene
import scene.customer.select.CustomerSelectionScene
import java.util.*
import kotlin.NoSuchElementException

class BankScene : SubScene(), BankNavigation {

    override val commandList: ArrayList<Command> = BankCommand.toList()

    override fun parseCommand(commandID: Int) {
        when (commandList.firstOrNull { it.id == commandID } as BankCommand?) {
            BankCommand.AddClient -> showAddClient()
            BankCommand.ShowAllClient -> showAllClients()
            BankCommand.SelectClient -> selectClient()
            BankCommand.Exit -> exit()
            else -> throw NoSuchElementException()
        }
    }

    override fun showAddClient() {
        router?.navigate(RouterCommand.Direction(CustomerAddScene()))
    }

    override fun showAllClients() {
        router?.navigate(RouterCommand.Direction(CustomerListScene()))
    }

    override fun selectClient() {
        router?.navigate(RouterCommand.Direction(CustomerSelectionScene()))
    }

    override fun exit() {
        router?.navigate(RouterCommand.Exit)
    }

}