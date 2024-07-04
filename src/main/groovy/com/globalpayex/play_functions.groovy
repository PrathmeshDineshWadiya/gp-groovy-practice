package com.globalpayex

def operations(a,b){
    //computes the addition
    def addition = {
        def r1 = a + b
        r1 + 10
    }
    //computes the multiplication
    def multiplication = {
        def r2 = a * b
        r2 + 10
    }
    println addition()
    println multiplication()
}

operations 5, 6

def nos = [5,6,8,2,1,9,4,3,6]

def forEach(list,fn){
    for(def element in list){
        fn(element)
    }
}

println "*****Evens*****"
def fn = {element ->
    if(element % 2 == 0){
        println element
    }
}
forEach(nos,fn)

println "*****Odd more than 3*****"
//print only odd numbers more than 3
/* forEach(nos,{element ->
    if(element % 2 && element > 3){
        println element
    }
}) */

/* forEach(nos,{
    if(it % 2 && it > 3){
        println it
    }
}) */

forEach(nos) {
    if(it % 2 && it > 3){
        println it
    }
}
