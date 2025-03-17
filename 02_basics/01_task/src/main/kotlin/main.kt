fun main() {
    val amount = 1_000_000;
    val tax = 0.75 / 100;
    var commission = amount * tax;
    if (commission < 35) {
        commission = 35.0;
    }

    println("Комиссия за перевод в $amount рублей в размере: ${commission.toInt()} рублей")
}