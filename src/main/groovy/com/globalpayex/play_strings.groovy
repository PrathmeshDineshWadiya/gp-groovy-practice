package com.globalpayex

def fullName = "prathmesh wadiya"
def msg = 'good morning'
def addition = "Addition is ${4+3}"

def sql = '''
    select username,password
    from users
    where username = 'abc'
'''

println("$fullName\n$msg\n$addition\n$sql")

//indexing
println msg[0]
println msg[3]
println msg[-1]
println msg[-3]

//substring
println fullName[0..8]
println msg[-4..-1]

//iteration
for(def v in msg){
    println v
}

//other operations
println fullName.toUpperCase()
println msg.capitalize()
println msg.startsWith("good")
println msg.endsWith("night")
println fullName.contains('mesh')

def msg1 = 'good morning to all. have a good day ahead'
println msg1.count('good')

def age = '37'
println age.isNumber()
def pi = '3.14'
println pi.isFloat()
def username = "prathmesh17"
println username.isNumber()

println fullName.reverse()

println fullName.size()

def studentData = '     prathmesh,m,21,90    '
println studentData.strip()
println studentData.trim()

def maliciousData = ' '
println maliciousData.isAllWhitespace()

def n1 = 'prathmesh wadiya'
def n2 = 'prathmesh'
def n3 = n2 + ' wadiya'
def n4 = 'prathmesh wadiya'

println n1
println n3

println n1 === n3
println n1 === n4



