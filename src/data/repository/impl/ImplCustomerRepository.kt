package data.repository.impl

import data.entity.Customer
import data.repository.CustomerRepository
import data.source.CustomerSource

class ImplCustomerRepository(private val source: CustomerSource) : CustomerRepository {

    override fun getCustomerList() = source.getCustomerList()

    override fun addCustomer(account: Customer) = source.addCustomer(account)

    override fun getCustomer(id: Int) = source.getCustomer(id)

}