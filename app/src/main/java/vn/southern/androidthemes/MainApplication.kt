/**
 * Author: southern
 * Date: 17/12/25
 */

package vn.southern.androidthemes

import android.app.Application
import vn.southern.androidthemes.di.AppComponent
import vn.southern.androidthemes.di.DaggerAppComponent

class MainApplication: Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .application(this)
            .build()
    }
    override fun onCreate() {
        super.onCreate()
    }
}