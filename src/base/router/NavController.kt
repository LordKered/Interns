package base.router

import base.router.command.RouterCommand
import base.scene.SubScene
import kotlin.system.exitProcess

class NavController(private val sceneListener: RouterListener) : Router {

    private val backStack: ArrayDeque<SubScene> = ArrayDeque()

    override fun navigate(command: RouterCommand) {
        when (command) {
            RouterCommand.Exit -> exitProcess(1)
            RouterCommand.Back -> if (!popBackStack()) {
                exitProcess(1)
            }
            is RouterCommand.Direction -> {
                var previousScene: SubScene? = null

                if (backStack.size > 0) {
                    previousScene = backStack.first()
                }

                backStack.add(command.scene)

                sceneListener.onSceneAttach(command.scene)
                sceneListener.onSceneResume(command.scene)

                previousScene?.let {
                    sceneListener.onScenePause(it)
                }
            }
        }
    }

    override fun popBackStack(): Boolean {
        return if (backStack.size == 0) {
            false
        } else {
            val scene = backStack.first()
            backStack.removeFirst()
            sceneListener.onScenePause(scene)
            sceneListener.onSceneDetach(scene)
            if (backStack.size > 0) {
                sceneListener.onSceneAttach(backStack.first())
                true
            } else {
                false
            }
        }
    }
}