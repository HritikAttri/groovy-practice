/* 
Topics covered with docs:

Imports : http://groovy-lang.org/structure.html#_default_imports
Keywords : http://groovy-lang.org/syntax.html#_keywords
Comments : http://groovy-lang.org/syntax.html#_single_line_comment
Assertions : http://groovy-lang.org/semantics.html#_power_assertion
Scripts : http://groovy-lang.org/structure.html#_script_class
Classes : http://groovy-lang.org/objectorientation.html#_class

* If a Groovy file doesn't contain a class, it is a script. So, Groovy can also behave as a scripting language.
* "groovyc FirstGroovyScript.groovy" will create .class intermediate files for all classes written in the groovy script.
* All classes and methods in Groovy by default are public. All properties in classes will have their getters & setters automatically
  generated internally.
* Groovy compiler will interpret a file as either a script or a class definition. In the case its a script (like the file 2nd g script),
  then the file name cannot match the name of the class definition.

*/

// 1. Imports
// import groovy.xml.MarkupBuilder
import groovy.xml.*

def xml = new MarkupBuilder()

// 2. Assertions (Power Assertion)
def x = 5 - 4
assert x == 1
// assert x == 2

// 3. Class
class AngryBird { }

class Developer {
    String first
    String last 
    def languages = []

    void work() {
        println "$first $last knows languages $languages"
    }
}

Developer d1 = new Developer()
d1.first = "Hritik"
// Calling setter
d1.setLast("Attri")
// Operator overloading (left shift)
d1.languages << "Groovy"
d1.languages << "Python"
d1.languages << "C#"
d1.work()