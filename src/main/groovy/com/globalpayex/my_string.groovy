package com.globalpayex

String.metaClass.csvify = {
    // delagate <---> this
    delegate.replaceAll " ",","
}

List.metaClass.evens = {
    delegate.findAll{it % 2 ==0}
}

List.metaClass.odds = {
    delegate.findAll{it % 2}
}

/* List.metaClass.sortDescending = {
    delegate.collect().sort { o1,o2 -> o2.compareTo(o1)}
} */

/*
List.metaClass.sortDescending = {
    delegate.sort (false) {o1,o2 -> o2.compareTo(o1)}
} */

List.metaClass.sortDescending = {
    delegate.sort (false) {o1,o2 -> o2 <=> o1} //Spaceship operator
}



def data = "prathmesh m 64 90"
//str --> prathmesh,m,64,90
println data.csvify()

def nos = [5,6,8,2,1,9,4,3,6]
println nos.evens()
println nos.odds()

nos.sort()
println(nos)

println nos.sortDescending()
println nos

