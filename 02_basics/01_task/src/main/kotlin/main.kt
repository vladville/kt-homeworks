fun main() {
    val amount = 1000;
    val tax = 0.75 / 100;
    val commission = amount * tax;
    println("Комиссия за перевод в $amount рублей в размере: $commission");
}