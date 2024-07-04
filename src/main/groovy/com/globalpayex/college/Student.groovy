package com.globalpayex.college

//Groovy Bean
class Student {
    //class variable
    static Integer count = 0

    //instance variables
    String name
    Character gender
    Integer roll
    Integer marks


    //constructors
    Student(){
        Student.count++
    }
    //default
    /* Student(Map map){
        super()
        this.name = map['name']
        this.gender = map['gender']
        this.roll = map['roll']
        this.marks = map['marks']
    } */

    //instance method
    String getDetails(){
        //this --> current object
        def details = "Roll-No: $this.roll\nName: $this.name\nGender: $this.gender\nMarks: $this.marks"
    }

    Character calculateGrade(marks){
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

    void setRoll(Integer roll) {
        if(roll > 0) {
            this.roll = roll
        }
    }

    void setGender(Character gender) {
        if(gender == 'm' || gender =='f') {
            this.gender = gender
        }
    }

    Character getGender() {
        return gender?.toUpperCase()
    }

    static Student create(Map std)
    {
        new Student(std)
    }
}

