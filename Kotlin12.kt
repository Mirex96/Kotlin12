// 12. Написать условное выражение (повторить с if и when), которое проверяет равны ли два числа и возвращает строку ("Less" / "Greater").
// Результат работы записать в переменную и перевернуть
//(if)
fun main() {
    val number1 = 10
    val number2 = 11

    println(check(number1, number2))
    val result = "Greater".reversed()
    println(result)

}

fun check(number1: Int, number2: Int): Any {
    return if (number1 == number2) {
        "Less"
    } else {
        "Greater"
    }

}

//(when)
fun main() {
    val number1 = 10
    val number2 = 11

    println(check(number1, number2))
    val result = "Greater"
    println(result.reversed())

}

fun check(number1: Int, number2: Int) {
    when {
        number1 == number2 -> {
            println("Less")
        }
        else -> {
            println("Greater")
        }
    }
}