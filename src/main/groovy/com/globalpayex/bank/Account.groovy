package com.globalpayex.bank

class Account {
    Long accNo
    String accType
    Double accBalance
    List contactNo = []

    Account(Map map){
        super()
        this.accNo = map['accNo']
        this.accType = map['accType']
        this.accBalance = map['accBalance']
        this.contactNo = map['contactNo']
    }

    Double withdraw(double amount){
        def b = this.accBalance - amount
        if(b >= 5000) {
            this.accBalance -= amount
        }
    }

    Double deposit(double amount){
        if(amount > 0) {
            this.accBalance += amount
        }
    }

    String getDetails(){
        //this --> current object
        def details = "Account-No: $this.accNo\nAccount-Type: $this.accType\nAccount-Balance: $this.accBalance\nContact-No: $this.contactNo"
    }

    Double minus(Double amount){
        this.withdraw(amount)
    }

    Double plus(Double amount){
        this.deposit(amount)
    }

    Account leftShift(Long cno){
        this.contactNo << cno
        this
    }

}
