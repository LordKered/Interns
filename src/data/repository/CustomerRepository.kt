package data.repository

import data.entity.Customer

interface CustomerRepository {

    fun getCustomerList(): ArrayList<Customer>

    fun addCustomer(account: Customer): Int

    fun getCustomer(id: Int): Customer

}