package com.stockbit.domain.domain

import com.stockbit.repository.repository.WebSocketRepository

class ReceiveResponseUseCase(private val repo: WebSocketRepository) {
    operator fun invoke() = repo.receiveResponse()
}