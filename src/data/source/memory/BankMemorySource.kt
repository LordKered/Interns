package data.source.memory

import data.entity.account.BankAccount
import data.entity.transaction.Transaction
import data.source.BankAccountSource

class BankMemorySource : BankAccountSource {
    override fun getAccountList(): ArrayList<BankAccount> {
        TODO("Not yet implemented")
    }

    override fun addAccount(body: BankAccount): Int {
        TODO("Not yet implemented")
    }

    override fun getAccount(id: Int): BankAccount {
        TODO("Not yet implemented")
    }

    override fun getAccountHistory(id: Int): List<Transaction> {
        TODO("Not yet implemented")
    }

    override fun makeTransaction(transaction: Transaction): Int {
        TODO("Not yet implemented")
    }
}