fun main() {
    println(calculateCommission("Mastercard", 0, 78_000))
    println(calculateCommission("Visa", 0, 78_000))
}

fun calculateCommission(cardType: String, prevTrans: Int = 0, curTrans: Int): Int {
    var additionTax = 20;
    var minCommision = 35;
    val nonCommissionLimit = 75_000;

    val commissionSize = when (cardType) {
        "Visa" -> 0.0075
        "Mastercard" -> 0.006
        else -> 0.0
    }

    var commissionValue = when (cardType) {
        "Visa" -> if (curTrans * commissionSize < minCommision) minCommision else curTrans * commissionSize
        "Mastercard" -> if (curTrans > nonCommissionLimit) ((curTrans - nonCommissionLimit) * commissionSize) + additionTax else 0
        else -> -1
    }

    if (curTrans > 150_000) commissionValue = -1
    if (prevTrans + curTrans > 600_000) commissionValue = -1

    return (commissionValue).toInt()
}