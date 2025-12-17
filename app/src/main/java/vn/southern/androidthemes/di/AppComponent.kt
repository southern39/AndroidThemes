/**
 * Author: southern
 * Date: 17/12/25
 */

package vn.southern.androidthemes.di

import dagger.BindsInstance
import dagger.Component
import vn.southern.androidthemes.MainApplication
import vn.southern.core.di.BaseViewModelModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        BaseViewModelModule::class
    ]
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: MainApplication): Builder

        fun build(): AppComponent
    }
}