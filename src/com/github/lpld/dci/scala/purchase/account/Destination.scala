package com.github.lpld.dci.scala.purchase.account

/**
 * @author leopold
 * @since 7/31/14
 */
trait Destination { this: BankAccount =>
    def increase(value : BigDecimal)
}
