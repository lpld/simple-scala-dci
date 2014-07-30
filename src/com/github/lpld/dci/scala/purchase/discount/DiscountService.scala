package com.github.lpld.dci.scala.purchase.discount

/**
 * @author leopold
 * @since 7/31/14
 */
object DiscountService {
    def priceWithDiscount(originalPrice: BigDecimal, discountId: Long): BigDecimal =
        // 10% discount everytime
        originalPrice - originalPrice * 0.1

}
