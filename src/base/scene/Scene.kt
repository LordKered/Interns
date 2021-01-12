package base.scene

import base.scene.command.Command

abstract class Scene {
    protected abstract val commandList: ArrayList<Command>

    open fun onCreateScene() {
        commandList.forEach { command ->
            println(message = command.toString())
        }
    }

}