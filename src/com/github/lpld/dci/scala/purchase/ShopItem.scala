package com.github.lpld.dci.scala.purchase

/**
 * @author leopold
 * @since 7/31/14
 */
class ShopItem(name: String, _price: BigDecimal) extends HasPrice {
    override var price: BigDecimal = _price
}
