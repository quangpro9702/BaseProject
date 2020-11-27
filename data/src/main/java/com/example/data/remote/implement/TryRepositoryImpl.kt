package com.example.data.remote.implement

import com.example.data.remote.api.JsonApi
import com.example.domain.model.MainResponse
import com.example.domain.repository.TryRepository
import javax.inject.Inject

class TryRepositoryImpl @Inject constructor(val jsonApi : JsonApi) : TryRepository {
    override suspend fun getTryApi(): MainResponse? {
        return jsonApi.getImageList("","",1).body()
    }
}