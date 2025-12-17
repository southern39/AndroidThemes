/**
 * Author: southern
 * Date: 17/12/25
 */

package vn.southern.core.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import javax.inject.Inject

abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel<*>>(
    private val bindingInflater: (LayoutInflater) -> VB
) : Fragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    protected abstract val viewModel: VM

    private var _binding: VB? = null
    open val binding: VB
        get() = _binding as VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = bindingInflater.invoke(inflater)
        _binding?.let {
            return it.root
        } ?: throw IllegalArgumentException("Binding variable is null")
    }
}