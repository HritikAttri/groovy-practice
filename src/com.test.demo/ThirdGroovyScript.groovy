/*
* Control Structure: http://groovy-lang.org/semantics.html#_control_structures
* Truthy & Falsy -> Empty string, null evaluate to false.
* Closures in Groovy allow us to use shorthand expressions in things like for loops

* Annotations -> Use @ symbol to denote to compiler that this piece of code is an controller (assuming @Controller annot). An annotation
  can change behavior of piece of code. Eg: Override ToString() method for our class by using a
  Transformation.
* @Immutable annotation will make our class final, and all properties inside it final & private,
  therefore making them immutable.
*/

// If else statement
def x = 10
if ( x < 10 ) {
    println "x is less than 10"
} else if ( x == 10 ) {
    println "x is equal to 10"
} else {
    println "x is greater than 10"
}
println "==================================="
println "==================================="
println "==================================="

// Switch statement
def someNumber = 10
switch(someNumber) {
    case 1:
        println "Number is 1"
        break
    default: 
        println "We hit the default case"
}

// While loop
i = 1
while (i <= x) {
    println i 
    i++;
}
println "==================================="
println "==================================="
println "==================================="

// for loop
def list = [1, 2, 3, 4, 5]
for ( num in list ) {
    println num ** 2
}
println "==================================="
println "==================================="
println "==================================="

// Closure
def list2 = [2, 4, 6, 8, 10]
list2.each { println it }

// Annotations
import groovy.transform.Immutable as Immutable 

@groovy.transform.Immutable 
class Customer {
    // first name, last name, age, since, favItems
    String firstName, lastName 
    int age 
    Date since 
    Collection favItems 
}