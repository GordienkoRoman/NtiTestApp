package ntitestru

import io.ktor.server.application.*
import ntitestru.plugins.*

fun main(args: Array<String>) {
    io.ktor.server.cio.EngineMain.main(args)
}

fun Application.module() {
    configureSockets()
    configureSerialization()
    configureRouting()
}
