package com.globalpayex

//List

def cars = ["audi","i20","bmw"]
def el =[]

//indexing
println cars[0]
println cars[-1]

//modify
cars[-2]='mercedes'

println cars

//sublist
def marks = [10,5,6,8,3,12]
println marks[-4..-1]
println marks[0..4]

//membership
println 'mercedes' in cars
println 'i20' in cars

//iteration
for(def c in cars){
    println c.toUpperCase()
}

//add element
cars << "jaguar"
println cars
cars << "i10" << "i20"
println cars

//remove from the list
cars.removeLast()
println cars
cars.removeLast()
println cars

//add element at the start of the list
cars.push('range rover')
println cars
cars.pop()
println cars

//Set Theory
def n1 = [1,3,5]
def n2 = [3,5,9]

println n1 - n2
println n2 - n1
println n1.intersect(n2)
println n1 + n2
println((n1 + n2).unique())

//statistics
println marks.max()
println marks.min()
println marks.average()

def marksDivisions = [
        [5,6,10],
        [6,7,10,2],
        [6,9,1]
]
println marksDivisions
println marksDivisions[0]
println marksDivisions[0].average()

println marksDivisions.flatten().average()


//Maximum marks

//Complex method
/* def studentsData = [
        ["John",'m',85],
        ["Viraj",'m',90],
        ["Alice",'f',70],
        ["Henry",'m',62],
        ["Jerry",'f',92]
]
def maximum = studentsData[0][2]
def name = studentsData[0][0]
name.toString()
def gender = studentsData[0][1]
gender.toString()
for(def v in studentsData){
    if(v[2]>maximum){
        name = v[0]
        gender = v[1]
        maximum = v[2]
    }
} */


def students = [
        Tuple.tuple("John",'m',85),
        Tuple.tuple("Viraj",'m',90),
        Tuple.tuple("Alice",'f',70),
        Tuple.tuple("Henry",'m',62),
        Tuple.tuple("Jerry",'f',92)
]

def maxTuple = students[0]

for(def student in students){
    if(student.v3 > maxTuple.v3){
        maxTuple = student
    }
}

println("Name: $maxTuple.v1\nGender: $maxTuple.v2\nMarks: $maxTuple.v3")


//Search Student

Scanner s = new Scanner(System.in)
println("Please enter roll-no to search : ")
def rn = s.nextInt()
def foundStudent
for(def student in students){
    if(student.v3 == rn){
        foundStudent = student
        break
    }
}

if(foundStudent){
    println "Name: $foundStudent.v1\nGender: $foundStudent.v2\nMarks: $foundStudent.v3"
} else{
    println "Student not found!"
}

def names = ['mehul','john','rahul','shubham']
println names*.toUpperCase()

//safe object navigation (?.)
names.each {println it?.toUpperCase()}
