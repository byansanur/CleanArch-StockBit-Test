package com.stockbit.presentation.presentation.viewmodel

import com.stockbit.common.base.BaseViewModel
import com.stockbit.presentation.presentation.fragment.LoginFragmentDirections

class LoginViewModel : BaseViewModel() {

    fun navigateToHome() {
        navigate(LoginFragmentDirections.actionLoginFragmentToMarketFragment())
    }
}