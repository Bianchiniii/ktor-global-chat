package com.mbcoding.data

import com.mbcoding.data.model.Message

interface MessageDataSource {

    suspend fun getAllMessages(): List<Message>
    
    suspend fun insertMessage(message: Message)
}