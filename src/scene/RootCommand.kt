package scene

import base.scene.command.Command

class RootCommand : Command(-1, "Welcome to the Bank") {

    override fun toString(): String {
        return text
    }
}