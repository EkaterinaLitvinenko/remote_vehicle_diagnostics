package sk.fiit.rvd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VdvApp

fun main(args: Array<String>) {
    runApplication<VdvApp>(*args)
}