package com.github.lpld.dci.scala.purchase.shipping

import com.github.lpld.dci.scala.purchase.HasPrice

/**
 * @author leopold
 * @since 7/31/14
 */
class Shipping(address: String, _price: BigDecimal) extends HasPrice {
    override var price: BigDecimal = _price
}
