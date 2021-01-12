package base.router.command

import base.scene.SubScene

sealed class RouterCommand {
    object Back : RouterCommand()

    object Exit : RouterCommand()

    data class Direction(val scene: SubScene) : RouterCommand()
}
