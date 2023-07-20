# KotlinBasics

- Java and Kotlin work side by side as they turn into same Java ByteCode when compiled

Types of FontCases
- PascalCase
- camelCase
- snake_case


ShortCuts
- Crtl + Shift + P --> shows var/val type
- Crtl + Q --> description of Function
- Ctrl + D --> copy and paste block of code
- Shift + F6 --> select and change everywhere in doc

Kotlin Basics

- Print Statement 
   - println()
   - print()
- Function
   - fun main(){...}
   - fun hello(){...}
   - passing parameter in a function
   - when passed a parameter in a function it is passed as value
   - function with return value
   - function can return array
   - unit is the data type that returns nothing
   - single expression functions
   - function overloading - when two functions have same name so compiler chooses accordingly
   - default arguments - specify type explicitly e.g fun func(reps: Int = 1){}
   - named arguments - e.g func(reps = 5)
   - optional parameters
   - pass array as a parameter using spread operator
- Variables
  - var is used when variable value can be changed
  - val is used for constant values
  - const val 
  - global variables - must initialize
- Data Types
  - Byte - 8 bit
  - Short - 16 bit
  - Int - 32 bit
  - Long - 64 bit
  - Float - 32 bit
  - Double - 64 bit
  - Unit - represents nothing
- Operators
- Kotlin Repel for testing
  - Tools -> Kotlin -> KotlinRepel
- Comments
  - End of Line Comment
  - Multiple Line Comment
- Arrays
  - val used when only data elements inside an array can be changed
  - var used when entire array can be replaced
  - 1D array
  - 2D array
  - can mix data types within arrays
- Array Functions
  - array.indices --> gives list of all indices
  - array[index].length --> length of array
  - array.last() --> last element of array
- String Functions
  - string.trim() --> removes extra white spaces
  - string.isBlank() --> tells if the string is empty
- Loops
  - For Loop
  - While Loop
  - Do While Loop
  - break statement
  - continue statement
- IF statement
- WHEN statement
- OOP Concepts
  - instantiation
  - passing argument in class
  - constructor
  - init block
  - this keyword



ARRAY LIST VS MUTABLE LIST
In Kotlin, MutableList and ArrayList are both data structures that allow you to store collections of elements, but they have some differences in terms of features and capabilities:

Mutability:

MutableList: As the name suggests, a MutableList is mutable, meaning you can add, remove, or modify elements in the list after it's created. You can use functions like add, remove, clear, etc., to modify the contents of a MutableList.
ArrayList: ArrayList is a specific implementation of a MutableList. It provides the same mutability features as a MutableList, allowing you to change its contents after creation.

Interfaces:

MutableList: It is an interface in Kotlin, and it provides the common set of operations for a mutable list.
ArrayList: As mentioned earlier, ArrayList is an implementation of the MutableList interface. It inherits all the mutable list operations from the MutableList interface and provides the underlying data structure to store elements dynamically.

Underlying Data Structure:

MutableList: Being an interface, it does not define the underlying data structure used to store the elements. The actual implementation of a MutableList can be an ArrayList, LinkedList, or any other custom implementation.
ArrayList: This is a class that specifically implements a dynamic array to store elements. It allows for fast access and modification of elements using index-based operations.

Performance:

In general, ArrayList tends to perform well for most use cases since it provides constant time complexity for adding and accessing elements by index. However, it might not be the best choice if you frequently insert or remove elements from the middle of the list because it requires shifting elements to accommodate the changes.
Other implementations of MutableList, like LinkedList, might perform better for insertions and deletions in the middle of the list but could have slower access times.

To summarize, MutableList is an interface representing a mutable list in Kotlin, while ArrayList is a specific implementation of that interface that uses an array as the underlying data structure. When using a MutableList, you have the flexibility to switch between different implementations based on your specific use case and performance requirements. If you know that you specifically need an array-based dynamic list, using ArrayList is a practical choice.


AB

