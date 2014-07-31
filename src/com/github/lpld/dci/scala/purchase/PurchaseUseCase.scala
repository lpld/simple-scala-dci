package com.github.lpld.dci.scala.purchase

import com.github.lpld.dci.scala.purchase.account.{BankAccount, Destination, Source}
import com.github.lpld.dci.scala.purchase.discount.Discountable
import com.github.lpld.dci.scala.purchase.items.ShopItem
import com.github.lpld.dci.scala.purchase.shipping.ShippingService

/**
 * @author leopold
 * @since 7/31/14
 */
object PurchaseUseCase {
    def main(args: Array[String]) {
        // input
        val shopItem = new ShopItem("TV", 3000) with Discountable
        val address = "To grandpa's village"
        val discountId = 234
        val userAccount = new BankAccount("1234567890", 4000) with Source

        val shopAccount = new BankAccount("0987654321", 4000) with Destination

        //
        println("Item price: " + shopItem.price)
        println("User account: " + userAccount.amount)
        println("Shop account: " + shopAccount.amount)

        println(" ---- buying ----")

        // calculate the price of shipment
        val shipping = ShippingService.shippingTo(address)
        println("Shipping account: " + shipping.price)

        // apply discount
        shopItem.applyDiscount(discountId)
        println("Item price (after applying the discount): " + shopItem.price)

        val total = shopItem.price + shipping.price
        println("Total order price: " + total)

        println("---- transfer money ----")
        // transfer money
        userAccount.transferTo(shopAccount, total)
        println("---- purchase successful ----")

        println("User account: " + userAccount.amount)
        println("Shop account: " + shopAccount.amount)




    }
}
