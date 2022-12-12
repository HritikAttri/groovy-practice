List nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
println nums
println nums.class.name 

// Indexing & slicing
println nums[0]
println nums[-1]
println nums[0..3]

// Add item
nums.push(50)
nums.putAt(0, 77)
println nums 

// Remove item
nums.pop()
nums.removeAt(0)
println nums 

// Iterating lists
// for ( int i < 0; i < nums.size(); i++ ) {
//     print nums[i]
// }

for ( int x in nums ) {
    print x
}