package com.github.lpld.dci.scala.purchase.discount

import com.github.lpld.dci.scala.purchase.HasPrice

/**
 * @author leopold
 * @since 7/31/14
 */
trait Discountable { this: HasPrice =>
    def applyDiscount(discountCode: Long) {
        // setting new price
        price = DiscountService.priceWithDiscount(price, discountCode)
    }
}
