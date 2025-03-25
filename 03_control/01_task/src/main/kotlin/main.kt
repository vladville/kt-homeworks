fun main() {
    println(agoToText(20))
    println(agoToText(3200))
    println(agoToText(7200))
    println(agoToText(43250))
    println(agoToText(86400))
    println(agoToText(175000))
    println(agoToText(275000))
}

fun agoToText(seconds: Int): String {
    return when {
        seconds in 0..60 -> "был(а) только что"
        seconds in 61..3599 -> "был(а) " + (seconds / 60) + " " + minutesToText(seconds / 60) + " назад"
        seconds in 3600..86399 -> "был(а) " + (seconds / 3600) + " " + hoursToText(seconds / 3600) + " назад"
        seconds in 86400..172799 -> "был(а) вчера"
        seconds in 172800..259199 -> "был(а) позавчера"
        seconds > 259200 -> "был(а) давно"
        else -> "Неверное значение"
    }
}

fun minutesToText(timeMinute: Int): String {
    return when (timeMinute) {
        1, 21, 31, 41, 51 -> "минуту"
        in 2..4, 22, 32, 42, 52 -> "минуты"
        in 5..9, in 11..14, 25, 35, 45, 55 -> "минут"
        else -> "минут"
    }
}

fun hoursToText(timeHour: Int): String {
    return when (timeHour) {
        1, 21 -> "час"
        in 2..4, in 22..24 -> "часа"
        in 5..20 -> "часов"
        else -> "час"
    }
}