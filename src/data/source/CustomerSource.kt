package data.source

import data.entity.Customer

interface CustomerSource {

    fun getCustomerList(): ArrayList<Customer>

    fun addCustomer(body: Customer): Int

    fun getCustomer(id: Int): Customer

}