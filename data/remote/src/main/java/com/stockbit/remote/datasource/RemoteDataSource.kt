package com.stockbit.remote.datasource

import com.stockbit.model.dto.request.SubscriptionRequest
import com.stockbit.remote.service.RemoteService
import com.stockbit.remote.service.WebSocketService
import com.stockbit.remote.utils.getResult

class RemoteDataSource(
    private val remoteService: RemoteService,
    private val socketService: WebSocketService
) {
    suspend fun getTopTotalVolFull(limit: Int, page: Int, currency: String) =
        getResult { remoteService.getTopTotalFull(limit, page, currency) }

    suspend fun getHistoryDataToday(fsym: String, tsym: String, limit: Int) =
        getResult { remoteService.getHistoryDataToday(fsym, tsym, limit) }

    fun connectToWebSocket(request: SubscriptionRequest) = socketService.connectToWebSocket(request)

    fun receiveResponse() = socketService.receiveResponse()
}