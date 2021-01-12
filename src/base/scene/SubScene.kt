package base.scene

import base.router.Router

abstract class SubScene : Scene() {
    var router: Router? = null

    override fun onCreateScene() {
        super.onCreateScene()
        startScannerListen()
    }

    private fun startScannerListen() {
        try {
            val line = readLine() ?: throw NullPointerException()
            parseCommand(line.trim().toInt())
        } catch (e: NoSuchElementException) {
            println("Entered wrong command")
            startScannerListen()
        } catch (e: Exception) {
            println("Something, please enter a correct command or enter 0 and press ENTER")
            startScannerListen()
        }
    }

    protected open fun parseCommand(commandID: Int) {
        throw NoSuchElementException()
    }
}