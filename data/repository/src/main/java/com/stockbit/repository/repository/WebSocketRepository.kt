package com.stockbit.repository.repository

import com.stockbit.model.dto.request.SubscriptionRequest
import com.stockbit.model.dto.response.TickerResponse
import kotlinx.coroutines.flow.Flow

interface WebSocketRepository {
    fun connectToSocket(request: SubscriptionRequest)
    fun receiveResponse(): Flow<TickerResponse>
}