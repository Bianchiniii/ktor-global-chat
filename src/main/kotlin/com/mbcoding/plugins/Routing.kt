package com.mbcoding.plugins

import com.mbcoding.room.RoomController
import com.mbcoding.routes.chatSocket
import com.mbcoding.routes.getAllMessage
import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.mp.KoinPlatformTools

fun Application.configureRouting() {
    val roomController by lazy { KoinPlatformTools.defaultContext().get().get<RoomController>() }
    install(Routing) {
        chatSocket(roomController)
        getAllMessage(roomController)
    }
}
