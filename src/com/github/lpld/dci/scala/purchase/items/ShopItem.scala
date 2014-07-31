package com.github.lpld.dci.scala.purchase.items

import com.github.lpld.dci.scala.purchase.HasPrice

/**
 * @author leopold
 * @since 7/31/14
 */
class ShopItem(
                  name: String,
                  var price: BigDecimal) extends HasPrice {
}
