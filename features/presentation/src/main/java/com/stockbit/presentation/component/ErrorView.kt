package com.stockbit.presentation.component

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.stockbit.common.utils.ErrorState
import com.stockbit.presentation.R
import com.stockbit.presentation.databinding.ViewErrorStateBinding

class ErrorView @JvmOverloads constructor(
    ctx: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): ConstraintLayout(ctx, attrs, defStyleAttr) {

    private val binding = ViewErrorStateBinding.inflate(LayoutInflater.from(ctx), this, false)

    lateinit var retryListener: () -> Unit

    init {
        ctx.obtainStyledAttributes(attrs, R.styleable.ErrorView, defStyleAttr, 0).apply {
            try {
                binding.btnRetry.setOnClickListener { if (::retryListener.isInitialized) retryListener.invoke() }
                initialize()
            } finally {
                recycle()
            }
        }
    }

    private fun initialize() {
        binding.tvMessage.text = resources.getString(R.string.error_something_wrong)
    }

    fun setError(
        error: ErrorState,
        message: String
    ) = with(binding) {
        ivError.setImageResource(
            when (error) {
                ErrorState.ERROR -> R.drawable.ic_round_error_24
                ErrorState.EMPTY -> R.drawable.ic_baseline_panorama_fish_eye_24
                ErrorState.NO_INTERNET -> R.drawable.ic_round_signal_cellular_connected_no_internet_4_bar_24
            }
        )
        tvDescription.text = message
    }

}