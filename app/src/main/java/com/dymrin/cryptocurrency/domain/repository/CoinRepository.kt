package com.dymrin.cryptocurrency.domain.repository

import com.dymrin.cryptocurrency.data.remote.dto.CoinDetailDto
import com.dymrin.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}