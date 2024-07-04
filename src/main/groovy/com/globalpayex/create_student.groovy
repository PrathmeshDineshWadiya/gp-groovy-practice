package com.globalpayex

import com.globalpayex.college.Student

println Student.count
def s1 = new Student(name: 'prathmesh',marks: 92,gender: 'm',roll:1)
def s2= new Student(name: 'dolly',marks: 85,gender: 'f',roll:2)
def s3 = new Student(name: 'jane',marks: 70,gender: 'm',roll:3)
println Student.count

println s1.getDetails()
println s2.getDetails()
println s3.getDetails()

println s1.calculateGrade(90)
println s2.calculateGrade(60)
println s3.calculateGrade(35)

def s4 = Student.create(name: 'peter',marks: 63,gender: 'm',roll:4)
//def s4 = Student.create(name: 'peter',marks: 63,gender: 'x',roll:-4)

println s4.getDetails()

s4.roll = -67 //Encapsulation --> Internally Groovy calls setRoll(67) setter method
println s4.getDetails()
println s4.roll

s4.gender = 'o'
println s4.getDetails()
println s4.gender //internally calls getGender()

def s5 = new Student()
println s5.gender