package trotech

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

/**
 * Сервис для работы с TODO_LIST
 */
@SpringBootApplication
@EntityScan
class Main

fun main(args: Array<String>) {
    runApplication<Main>(*args)
}