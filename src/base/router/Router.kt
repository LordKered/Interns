package base.router

import base.router.command.RouterCommand

interface Router {

    fun navigate(command: RouterCommand)

    fun popBackStack(): Boolean

}