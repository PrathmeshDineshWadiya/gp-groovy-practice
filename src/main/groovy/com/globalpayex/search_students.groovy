package com.globalpayex


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




