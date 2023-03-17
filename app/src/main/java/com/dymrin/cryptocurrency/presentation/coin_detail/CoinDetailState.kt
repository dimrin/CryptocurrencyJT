package com.dymrin.cryptocurrency.presentation.coin_detail

import com.dymrin.cryptocurrency.domain.model.Coin
import com.dymrin.cryptocurrency.domain.model.CoinDetail

data class CoinDetailState(val isLoading: Boolean = false, val coin: CoinDetail? = null, val error: String = "")
