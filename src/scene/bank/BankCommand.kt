package scene.bank

import base.scene.command.Command

sealed class BankCommand(id: Int, text: String) : Command(id, text) {
    object AddClient : BankCommand(1, "Add a client")
    object ShowAllClient : BankCommand(2, "Show a clients")
    object SelectClient : BankCommand(3, "Select a client")
    object Exit : BankCommand(0, "Exit")

    companion object {
        fun toList(): ArrayList<Command> = arrayListOf(AddClient, ShowAllClient, SelectClient, Exit)
    }
}