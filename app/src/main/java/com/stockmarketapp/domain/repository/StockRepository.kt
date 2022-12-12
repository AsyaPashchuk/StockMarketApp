package com.stockmarketapp.domain.repository

import com.stockmarketapp.domain.model.CompanyInfo
import com.stockmarketapp.domain.model.CompanyListing
import com.stockmarketapp.domain.model.IntradayInfo
import com.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListing(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}