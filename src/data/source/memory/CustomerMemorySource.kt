package data.source.memory

import data.entity.Customer
import data.source.CustomerSource

class CustomerMemorySource : CustomerSource {
    override fun getCustomerList(): ArrayList<Customer> {
        TODO("Not yet implemented")
    }

    override fun addCustomer(body: Customer): Int {
        TODO("Not yet implemented")
    }

    override fun getCustomer(id: Int): Customer {
        TODO("Not yet implemented")
    }
}