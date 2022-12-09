package com.stockmarketapp.domain.repository

import com.stockmarketapp.domain.model.CompanyListing
import com.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockMarketRepository {

    suspend fun getCompanyListing(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}