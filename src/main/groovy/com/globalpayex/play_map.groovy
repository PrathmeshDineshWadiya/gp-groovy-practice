package com.globalpayex

//Map
//Entry : Key and Value
//Key should be unique, indexing happens ny key
//Mutable

def em = [:]

//def emap = ['E001':'Rahul','E002':'Vikram']

def emap = [E001:'Rahul',E002:'Vikram'] //For one word string we can exclude the quotes only applicable for the key

//add a new entry
emap['E003'] = "Rohit"
println(emap)

//update an entry
emap['E003'] = "Jill"
println emap

//remove an entry
emap.remove('E003')
println emap

//other functions
println emap.size()
println emap.keySet()
println emap.values()


//iteration
for(def entry in emap){
//    println entry
    println "Emp-Id: $entry.key\nEmp-Name: $entry.value"
}

//membership
println 'E003' in emap
println 'E001' in emap


