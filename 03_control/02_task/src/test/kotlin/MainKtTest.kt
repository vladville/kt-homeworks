import junit.framework.TestCase.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun calculateCommissionMC() {
        val cardType = "Mastercard"
        val prevTrans = 0
        val curTrans = 78_000

        val result = calculateCommission(cardType, prevTrans, curTrans)

        assertEquals(38, result)
    }

    @Test
    fun calculateCommissionMCZero() {
        val cardType = "Mastercard"
        val prevTrans = 2000
        val curTrans = 70_000

        val result = calculateCommission(cardType, prevTrans, curTrans)

        assertEquals(0, result)
    }

    @Test
    fun calculateCommissionMir() {
        val cardType = "Мир"
        val prevTrans = 0
        val curTrans = 100_000

        val result = calculateCommission(cardType, prevTrans, curTrans)

        assertEquals(0, result)
    }

    @Test
    fun calculateCommissionVisa() {
        val cardType = "Visa"
        val prevTrans = 0
        val curTrans = 80_000

        val result = calculateCommission(cardType, prevTrans, curTrans)

        assertEquals(600, result)
    }

    @Test
    fun calculateCommissionOther() {
        val cardType = "Corona"
        val prevTrans = 0
        val curTrans = 80_000

        val result = calculateCommission(cardType, prevTrans, curTrans)

        assertEquals(-1, result)
    }

    @Test
    fun calculateCommissionBigCurTrans() {
        val cardType = "Mastercard"
        val prevTrans = 0
        val curTrans = 180_000

        val result = calculateCommission(cardType, prevTrans, curTrans)

        assertEquals(-1, result)
    }

    @Test
    fun calculateCommissionReachLimit() {
        val cardType = "Mastercard"
        val prevTrans = 480_000
        val curTrans = 180_000

        val result = calculateCommission(cardType, prevTrans, curTrans)

        assertEquals(-1, result)
    }

    @Test
    fun calculateCommissionWithPrevTrans() {
        val cardType = "Mastercard"
        val prevTrans = 76_000
        val curTrans = 20_000

        val result = calculateCommission(cardType, prevTrans, curTrans)

        assertEquals(140, result)
    }

    @Test
    fun calculateCommissionVisaMinCommission() {
        val cardType = "Visa"
        val prevTrans = 0
        val curTrans = 100

        val result = calculateCommission(cardType, prevTrans, curTrans)

        assertEquals(35, result)
    }
}