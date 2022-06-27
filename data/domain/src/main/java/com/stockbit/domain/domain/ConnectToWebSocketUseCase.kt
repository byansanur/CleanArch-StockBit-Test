package com.stockbit.domain.domain

import com.stockbit.model.dto.request.SubscriptionRequest
import com.stockbit.repository.repository.WebSocketRepository

class ConnectToWebSocketUseCase(private val repo: WebSocketRepository) {
    operator fun invoke(request: SubscriptionRequest) = repo.connectToSocket(request)
}