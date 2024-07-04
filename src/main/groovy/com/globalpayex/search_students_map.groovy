package com.globalpayex

//Search Student

Scanner s = new Scanner(System.in)
println("Please enter roll-no to search : ")
def rn = s.nextInt()

def students = [1:Tuple.tuple("John",'m',94),
                2:Tuple.tuple("Viraj",'m',80),
                3:Tuple.tuple("Alice",'f',60),
                4:Tuple.tuple("Henry",'m',55),
                5:Tuple.tuple("Jerry",'f',66)
]

//students[rn] ? println("Name: $foundStudent.v1\nGender: $foundStudent.v2\nMarks: $foundStudent.v3") : println("Student not found!")

def foundStudent = students[rn]

if(foundStudent){
    println "Name: $foundStudent.v1\nGender: $foundStudent.v2\nMarks: $foundStudent.v3"
} else{
    println "Student not found!"
}
println students

