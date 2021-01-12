package scene

import base.scene.Scene
import base.scene.SceneManager
import base.scene.command.Command
import scene.bank.BankScene

class RootScene : Scene() {

    override val commandList = arrayListOf<Command>(RootCommand())

    private val sceneManager: SceneManager

    init {
        onCreateScene()
        sceneManager = SceneManager(BankScene())
    }
}