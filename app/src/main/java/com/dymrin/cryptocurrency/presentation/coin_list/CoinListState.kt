package com.dymrin.cryptocurrency.presentation.coin_list

import com.dymrin.cryptocurrency.domain.model.Coin

data class CoinListState(val isLoading: Boolean = false, val coins: List<Coin> = emptyList(), val error: String = "")
