package com.globalpayex

def nos = [5,6,8,2,1,9,4,3,6]

//print all even numbers more than 2 from nos list

println "*****Evens more than 2*****"

nos.each {
    if(it % 2 == 0 && it > 2){
        println it
    }
}
println nos

// from the nos list, separate list of evens and list of odds
def evens=[]
def odds =[]
nos.each {
    if(it % 2 == 0){
        evens << it
    }
    else{
        odds << it
    }
}

println evens
println odds

//create a new list consisting of elements from the nos list  more than 5
//filtering
def l1 = nos.findAll {it > 5}
println l1

//create a new list from the nos list consisting of marks deducted by 1
//mapping
def l2 = nos.collect {it - 1}

println l2

//create a new list
    //filter odd elements more than 3 from nos list
    //square the filtered out odd numbers

def l3 = nos.findAll {it % 2 && it > 3}.collect {it ** 2}
println l3

//Every student has scored above 3 or not from the nos list
/* def l4 = nos.findAll {it > 3}
println(l4.size() == nos.size()) */

println nos.every {it > 3}

def cars = ['audi','bmw','mercedes']

//creates a new list of car names from the car list in a capitalize format
def l4 = cars.collect{it.capitalize()}
println l4

//Spread dot operator
def l5 = cars*.capitalize()
println l5

def l6 = nos*.minus(1)
println l6
