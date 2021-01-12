package data.source

import data.entity.account.BankAccount
import data.entity.transaction.Transaction

interface BankAccountSource {

    fun getAccountList(): ArrayList<BankAccount>

    fun addAccount(body: BankAccount): Int

    fun getAccount(id: Int): BankAccount

    fun getAccountHistory(id: Int): List<Transaction>

    fun makeTransaction(transaction: Transaction): Int
}