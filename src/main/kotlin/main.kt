fun main() {
    val amount = 1_450_000
    val minimalCommission = 3_500
    val commissionPercent = 0.75

    val commission = (amount * commissionPercent / 100).toInt()
    val result = if (commission < minimalCommission) {
        minimalCommission
    } else {
        commission
    }
    println("Commission is $result.")
}