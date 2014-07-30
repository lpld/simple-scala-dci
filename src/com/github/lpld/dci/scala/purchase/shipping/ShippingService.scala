package com.github.lpld.dci.scala.purchase.shipping

/**
 * @author leopold
 * @since 7/31/14
 */
object ShippingService {
    def shippingToAddress(address: String): Shipping =
        // calculate shipping price somehow
        new Shipping(address, 100)
}
