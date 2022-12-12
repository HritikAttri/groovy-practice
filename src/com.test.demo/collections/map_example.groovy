def map = [:]
println map 
println map.getClass().getName()

def personMap = [ "first":"Hritik", "last":"Attri", "email":"hritikattri10@gmail.com" ]

// Indexing maps
println personMap.first + " " + personMap.last 

// Adding a new key-value pair to the map
personMap["Age"] = 22
personMap.Gender = "Male"

println personMap

def emailKey = "EmailAddress"
def twitterUser = [username: "hritik10", (emailKey): "hritikattri10@gmail.com"]
println twitterUser

// Methods on maps
println personMap.size()
println personMap.sort()

// Looping through maps
// for (person in personMap) {
//     println person
// }
for ( key in personMap.keySet() ) {
    println "${key}:${personMap[key]}"
}