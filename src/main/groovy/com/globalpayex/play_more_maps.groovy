package com.globalpayex

def students = [1:Tuple.tuple("john",'m',94),
                2:Tuple.tuple("viraj",'m',80),
                3:Tuple.tuple("alice",'f',60),
                4:Tuple.tuple("henry",'m',55),
                5:Tuple.tuple("jerry",'f',66)
]

//print the name and roll no of all the male students from the students map
/* students.each {
    if(it.value.v2 == 'm'){
        println "Name: $it.value.v1\nRoll-No: $it.key"
    }
} */

students.each {roll,studentTuple ->
    if(studentTuple.v2 == 'm'){
        println "Name: $studentTuple.v1\nRoll-No: $roll"
    }
}

//create a new map consisting of only the male students from students map
def m1 = students.findAll{it.value.v2 == 'm'}
println m1

def m2 = students.findAll{rollNo, studentTuple -> studentTuple.v2 == 'm'}
println m2


def m3 = students.collect {rollNo, studentTuple ->
    [rollNo,Tuple.tuple(studentTuple.v1.capitalize(),studentTuple.v2,studentTuple.v3)]
}
println m3

def m4 = students.collectEntries {rollNo, studentTuple ->
    [rollNo, Tuple.tuple(studentTuple.v1.capitalize(),studentTuple.v2,studentTuple.v3)]}
println m4

//count by gender from students map
def m5 = students.countBy {it.value.v2}
println m5

def m6 = students.values().countBy {it.v2}
println m6

def m7 = students.countBy {rollNo, studentTuple -> studentTuple.v2}
println m7

//group by gender from student map
def m8 = students.groupBy {it.value.v2}
println m8