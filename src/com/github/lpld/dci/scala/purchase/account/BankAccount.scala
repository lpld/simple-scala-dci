package com.github.lpld.dci.scala.purchase.account

/**
 * @author leopold
 * @since 7/31/14
 */
class BankAccount(
                     id: String,
                     var amount: BigDecimal) {

    def increase(value : BigDecimal) = amount += value

    def decrease(value: BigDecimal) = {
        if (amount - value >= 0) {
            amount -= value
        } else {
            throw new RuntimeException
        }
    }
}
