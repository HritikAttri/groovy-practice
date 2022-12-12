for ( int x = 0; x < 10; x++ ) {
    print x 
}
println ""
for ( int y = 10; y > 0; y-- ) {
    print y
}
println ""

def chars = ["a", "b", "c", "d", "e", "f"]
for ( int a = chars.size(); a >= 0; a-- ) {
    println chars[a];
}

Range r1 = 1..50
// Range but upper bound is exclusive -> Range r1 = 1..<50
println r1.class.name 
println r1.from 
println r1.to 

assert (0..10).contains(0)
assert (0..10).contains(-1) == false 
assert (0..10).contains(10)
assert (0..<10).contains(10) == false 
assert (0..<10).contains(9)

// Advanced Range examples

def strRange = "a".."n"
println strRange

def today = new Date()
def oneWeekFromToday = today + 7 
def dateRange = today..oneWeekFromToday
println dateRange