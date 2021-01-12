package scene.list

import base.scene.SubScene

abstract class ListScene : SubScene() {

    protected abstract fun sortByAscending()

    protected abstract fun sortByDescending()

}