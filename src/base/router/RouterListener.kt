package base.router

import base.scene.SubScene

interface RouterListener {
    fun onSceneAttach(scene: SubScene)

    fun onSceneDetach(scene: SubScene)

    fun onSceneResume(scene: SubScene)

    fun onScenePause(scene: SubScene)
}