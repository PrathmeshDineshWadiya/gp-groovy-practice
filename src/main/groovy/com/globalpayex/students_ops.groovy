package com.globalpayex

def students = [
        Tuple.tuple("John",'m',85),
        Tuple.tuple("Viraj",'m',90),
        Tuple.tuple("Alice",'f',70),
        Tuple.tuple("Henry",'m',62),
        Tuple.tuple("Jerry",'f',92)
]

println students

//create a new list of tuple consisting of only name and marks of all male students
def l1 = students
        .findAll {it.v2 == 'm'}
        .collect{Tuple.tuple(it.v1,it.v3)}
println l1
