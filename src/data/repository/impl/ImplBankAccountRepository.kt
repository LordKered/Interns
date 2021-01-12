package data.repository.impl

import data.entity.account.BankAccount
import data.entity.transaction.Transaction
import data.repository.BankAccountRepository
import data.source.BankAccountSource

class ImplBankAccountRepository(private val source: BankAccountSource) : BankAccountRepository {

    override fun getAccountList() = source.getAccountList()

    override fun addAccount(account: BankAccount) = source.addAccount(account)

    override fun getAccount(id: Int) = source.getAccount(id)

    override fun getAccountHistory(id: Int): List<Transaction> = source.getAccountHistory(id)

    override fun makeTransaction(transaction: Transaction) = source.makeTransaction(transaction)

}