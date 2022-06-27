package com.stockbit.presentation.presentation.fragment

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import com.stockbit.common.base.BaseFragment
import com.stockbit.presentation.databinding.FragmentLoginBinding
import com.stockbit.presentation.presentation.viewmodel.LoginViewModel
import org.koin.android.viewmodel.ext.android.viewModel


/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : BaseFragment<FragmentLoginBinding>() {

    private val viewModel: LoginViewModel by viewModel()

    override fun initBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentLoginBinding {
        return FragmentLoginBinding.inflate(inflater, container, false)
    }

    override fun initView() = with(binding){
        observeNavigation(viewModel)
        btnLogin.setOnClickListener { goToMarketFragment() }
    }

    private fun goToMarketFragment() {
        viewModel.navigateToHome()
    }


}