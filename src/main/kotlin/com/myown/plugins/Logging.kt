package com.myown.plugins

import io.ktor.server.application.*
import io.ktor.server.plugins.callloging.*

fun Application.configureLogging() {
    install(CallLogging)
}