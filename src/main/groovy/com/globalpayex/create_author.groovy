package com.globalpayex

import com.globalpayex.college.Author
import com.globalpayex.college.Book
import com.globalpayex.college.Contact

import javax.swing.Icon

/* def authors = [
        new Author(name:'prathmesh',gender: 'm',ratings: 5,
            contact: new Contact(email: 'prathmesh.wadiya17@gmail.com', mobile: 8169019209,websiteUrl: 'https://slowathon.com')),
        new Author(name:'daisy',gender: 'f',ratings: 4,
                contact: new Contact(email: 'daisy.shah@gmail.com', mobile: 9890363516,websiteUrl: 'https://daisy.com'))
]
        def book = new Book(title: 'Book-1',price: 900,pages: 1000, authors: authors)

println book */

def ogb = new ObjectGraphBuilder(classNameResolver: 'com.globalpayex.college')

def b = ogb.book(title: 'Book-1',price: 900,pages: 1000) {
    author(name: 'prathmesh', gender: 'm', ratings: 5) {
        contact(email: 'prathmesh.wadiya17@gmail.com', mobile: 8169019209, websiteUrl: 'https://slowathon.com')
    }
    author(name: 'daisy', gender: 'f', ratings: 4) {
        contact(email: 'daisy.shah@gmail.com', mobile: 9890363516, websiteUrl: 'https://daisy.com')
    }
}

println b