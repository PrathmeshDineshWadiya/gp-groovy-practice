package com.globalpayex

//Tuple datatype
//Represents heterogeneous data
//ordered
//immutable

def t1 = Tuple.tuple("prathmesh",64,'m',90)

//access
println t1.v1
println t1.v2
println t1.v3
println t1.v4

//iterate
for(def v in t1){
    println v
}


//modify
//t1.v1 = "Jane" //cannot modify

//t1.push("India")



