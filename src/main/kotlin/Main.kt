import java.time.LocalDate
import kotlin.coroutines.*
fun main() {                                // A function that can be suspended and resumed later
    val start = System.currentTimeMillis()
    coroutineScope{                                // Create a scope for starting coroutines
        for (i in 1..20) {
            launch {                                // Start 10 concurrent tasks
                delay(3000L - i * 300)              // Pause their execution
                log(start, "Countdown: $i")
            }
        }
    }
    // Execution continues when all coroutines in the scope have finished
    log(start, "Liftoff!")
}

fun coroutineScope(function: () -> Unit) {

}

fun delay(l: Long) {

}

fun launch(function: () -> Unit) {

}

fun log(start: Long, msg: String) {
    println("$msg " +
            "(on ${Thread.currentThread().name}) " +
            "after ${(System.currentTimeMillis() - start)/5000F}s")






        val heute = LocalDate.now()
        val urlaubswoche = LocalDate.of(2023, 3, 6) // angenommen, Urlaubswoche beginnt am 6. März 2023

        if (heute.plusDays(2) >= urlaubswoche) {
            println("Wir haben Urlaubswoche!")
            // Hier kannst du den Code einfügen, der ausgeführt wird, wenn Urlaubswoche ist
        } else {
            println("Heute müssen die Aufgaben gelöscht werden.")
            // Hier kannst du den Code einfügen, der ausgeführt wird, wenn heute keine Urlaubswoche ist
        }
    }

