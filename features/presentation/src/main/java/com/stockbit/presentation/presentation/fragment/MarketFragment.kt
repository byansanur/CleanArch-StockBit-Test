package com.stockbit.presentation.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stockbit.common.base.BaseFragment
import com.stockbit.presentation.R
import com.stockbit.presentation.databinding.FragmentMarketBinding


/**
 * A simple [Fragment] subclass.
 */
class MarketFragment : BaseFragment<FragmentMarketBinding>() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_market, container, false)
    }

    override fun initBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentMarketBinding {
        TODO("Not yet implemented")
    }

    override fun initView() {
        TODO("Not yet implemented")
    }


}