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
    fun calculateCommissionMir() {
        val cardType = "Мир"
        val prevTrans = 0
        val curTrans = 100_000

        val result = calculateCommission(cardType, prevTrans, curTrans)

        assertEquals(500, result)
    }

    @Test
    fun calculateCommissionVisa() {
        val cardType = "Visa"
        val prevTrans = 0
        val curTrans = 80_000

        val result = calculateCommission(cardType, prevTrans, curTrans)

        assertEquals(600, result)
    }
}