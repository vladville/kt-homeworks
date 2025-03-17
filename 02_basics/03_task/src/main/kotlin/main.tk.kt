import kotlin.math.roundToInt

fun main() {
    val isRegular = true;
    var amount = 15_000;

    if (amount > 10000) {
        amount = (amount * 0.95).roundToInt(); //-5% скидка
    } else if (amount > 1000) {
        amount-=100; //-100 рублей скидка
    }

    println("Итоговую стоимость покупки: $amount");

    if (isRegular) {
        amount = (amount * 0.99).roundToInt(); //-1% скидка, если постоянный
        println("Спасибо, что вы с нами (-1%): $amount");
    }
}