/**
 * Author: southern
 * Date: 17/12/25
 */

package vn.southern.core.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel<T : BaseView> : ViewModel() {
    protected var view: T? = null
        private set

    fun setView(view: T) {
        this.view = view
    }
}