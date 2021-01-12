package data.repository

import data.entity.account.BankAccount
import data.entity.transaction.Transaction

interface BankAccountRepository {

    fun getAccountList(): ArrayList<BankAccount>

    fun addAccount(account: BankAccount): Int

    fun getAccount(id: Int): BankAccount

    fun getAccountHistory(id: Int): List<Transaction>

    fun makeTransaction(transaction: Transaction): Int

}