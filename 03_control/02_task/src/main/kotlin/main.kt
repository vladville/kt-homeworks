fun main() {
    println(calculateCommission("Mastercard", 20_000, 70_000))
    println(calculateCommission("Visa", 0, 78_000))
    println(calculateCommission("Мир", 0, 78_000))
}

fun calculateCommission(cardType: String, prevTrans: Int = 0, curTrans: Int): Int {
    var additionTax = 20;
    var minCommission = 35;
    val nonCommissionLimit = 75_000;

    if (curTrans > 150_000) return -1
    if (prevTrans + curTrans > 600_000) return -1

    val commissionSize = when (cardType) {
        "Visa" -> 0.0075
        "Mastercard" -> 0.006
        else -> 0.0
    }

    var commissionValue = when (cardType) {
        "Visa" -> if (curTrans * commissionSize < minCommission) minCommission else curTrans * commissionSize
        "Mastercard" -> {
            if (prevTrans > nonCommissionLimit) (curTrans * commissionSize) + additionTax
            else if (curTrans + prevTrans > nonCommissionLimit) ((curTrans + prevTrans - nonCommissionLimit) * commissionSize) + additionTax
            else 0
        }
        "Мир" -> 0
        else -> -1
    }

    return (commissionValue).toInt()
}