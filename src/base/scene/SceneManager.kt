package base.scene

import base.router.NavController
import base.router.Router
import base.router.RouterListener
import base.router.RouterProvider
import base.router.command.RouterCommand

class SceneManager(subScene: SubScene) : RouterProvider, RouterListener {

    override val router: Router by lazy { NavController(this) }

    init {
        navigate(subScene)
    }

    override fun onSceneAttach(scene: SubScene) {
        scene.router = router
        scene.onCreateScene()
    }

    override fun onSceneDetach(scene: SubScene) {
    }

    override fun onSceneResume(scene: SubScene) {
    }

    override fun onScenePause(scene: SubScene) {
    }

    private fun navigate(subScene: SubScene) {
        router.navigate(RouterCommand.Direction(subScene))
    }

}