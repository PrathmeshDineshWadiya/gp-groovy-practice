package com.globalpayex

def computeGrade(m){
    if(m>100 || m<0){
        "I"
    }else if (m>=70){
        "A"
    }else if (m>=60){
        "B"
    }
    else if (m>=40){
        "C"
    }
    else{
        "F"
    }
}

def calculateGrade(marks){
    switch(marks) {
        case 70..100: "A"
            break
        case 60..69: "B"
            break
        case 40..59: "C"
            break
        case 0..39: "F"
            break
        default: "I"
    }

}

def m = 61
println("For Marks $m, Grade is ${calculateGrade m}")