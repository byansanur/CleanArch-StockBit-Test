package com.stockbit.repository.di

import com.stockbit.repository.AppDispatchers
import com.stockbit.repository.ExampleRepository
import com.stockbit.repository.ExampleRepositoryImpl
import com.stockbit.repository.repository.CryptoRepository
import com.stockbit.repository.repository.WebSocketRepository
import com.stockbit.repository.repository.WebSocketRepositoryImpl
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

val repositoryModule = module {
    factory { AppDispatchers(Dispatchers.Main, Dispatchers.IO) }
    factory { ExampleRepositoryImpl(get(), get()) as ExampleRepository }

    factory { CryptoRepository(get(), get()) }
    factory<WebSocketRepository> { WebSocketRepositoryImpl(get()) }
}