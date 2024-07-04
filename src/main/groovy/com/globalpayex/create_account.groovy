package com.globalpayex

import com.globalpayex.bank.Account

def a1 = new Account(accNo: 101,accType: 'SAVINGS',accBalance: 10000,contactNo: [8169019209])
println a1.getDetails()
a1.withdraw(5000)
println a1.getDetails()
a1.deposit(2000)
println a1.getDetails()


def vbm = a1 - 1000 //internally it calls minus(1000)
println vbm

def vbp = a1 + 1000 //internally it calls plus(1000)
println vbp

a1 << 9890363516
println a1.contactNo

def a2 = new Account(accNo: 102,accType: 'CURRENT',accBalance: 20000,contactNo: [8169018706])
a2 << 9890363516 << 8169019209
println a2.contactNo