package com.stockbit.domain.di

import com.stockbit.domain.domain.ConnectToWebSocketUseCase
import com.stockbit.domain.domain.GetHistoryDataToday
import com.stockbit.domain.domain.GetTopTotalVolumeFullUseCase
import com.stockbit.domain.domain.ReceiveResponseUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { GetTopTotalVolumeFullUseCase(get()) }
    factory { ConnectToWebSocketUseCase(get()) }
    factory { ReceiveResponseUseCase(get()) }
    factory { GetHistoryDataToday(get()) }
}