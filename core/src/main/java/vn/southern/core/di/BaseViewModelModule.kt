/**
 * Author: southern
 * Date: 17/12/25
 */

package vn.southern.core.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import vn.southern.core.di.factory.ViewModelFactory

@Module
abstract class BaseViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}