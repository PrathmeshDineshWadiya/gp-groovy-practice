package com.globalpayex.college

class Author {
    String name
    Integer ratings
    Character gender
    Contact contact

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", ratings=" + ratings +
                ", gender=" + gender +
                '}';
    }
}


