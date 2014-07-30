package com.github.lpld.dci.scala.purchase.account

/**
 * @author leopold
 * @since 7/31/14
 */
trait Source { this: BankAccount =>
    // actually a transaction needed here
    def transferTo(dest: Destination, amount: BigDecimal) {
        this.decrease(amount)
        dest.increase(amount)
    }
}
