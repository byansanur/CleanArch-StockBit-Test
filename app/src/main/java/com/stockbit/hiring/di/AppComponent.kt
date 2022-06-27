package com.stockbit.hiring.di

import com.stockbit.domain.di.domainModule
import com.stockbit.local.di.localModule
import com.stockbit.presentation.di.presentationModule
import com.stockbit.remote.di.remoteModule
import com.stockbit.repository.di.repositoryModule

val appComponent= listOf(
    remoteModule,
    repositoryModule,
    localModule,
    domainModule,
    presentationModule
)