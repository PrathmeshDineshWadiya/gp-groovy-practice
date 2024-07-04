package com.globalpayex

def perimeter(Map dimensions){ 2 * (dimensions['length'] + dimensions['breadth']) }

def area(Map dimensions){ dimensions['length'] * dimensions['breadth'] }

def statistics(length,breadth){
    def p = perimeter(length:length,breadth:breadth)
    def a = area(length:length,breadth:breadth)
    Tuple.tuple(p,a)
}


println perimeter(length:4,breadth:3)
println area(breadth:4,length:3)

def t = statistics(5,4)
println( "Perimeter is ${t.v1}")
println( "Area is ${t.v2}")

