# scala in intellij

## Installation
1. Make sure you have the Java 8 JDK (also known as 1.8)

    i. On Linux: Run javac -version on the command line and make sure you see javac 1.8.___
    
    ii. On Windows: Check if java is listed in <b>Control Panel</b> --> <b>Programs and Features</b>
  
    If you don’t have version 1.8 or higher, install the JDK

2. Next, download and install IntelliJ Community Edition(https://www.jetbrains.com/idea/download/#section=windows)

3. Then, after starting up IntelliJ, you can download and install the Scala plugin by following the instructions on 
    how to install IntelliJ plugins (search for “Scala” in the plugins menu.) - https://www.jetbrains.com/help/idea/managing-plugins.html
    
4. Now add Scala Libraries. Go to File/Project Structure/Globl Libraries --> (+ icon on top) --> Scala SDK --> Download (Or Browse if you already have Scala SDK)

5. Next you have to remove some SDK files(If the build won't start and it shows error like below then multiple SDKs are pesent; we have to remove some...).
    Select everything( in the standard library section) that starts with ...\common\... and remove them

<i> Error:scalac: Multiple 'scala-library*.jar' files (scala-library.jar, scala-library.jar, scala-library.jar) in Scala compiler classpath in Scala SDK scala-sdk-2.11.12</i>

6. Then remove all files that ends with ".src.jar" and remove them

7. Repeat steps #5 and #6 for "Compiler classpath" section.


## Creating the Project

1. Open up IntelliJ and click File => New => Project

2. On the left panel, select Scala. On the right panel, select IDEA.

3. Name the project HelloWorld

4. Assuming this is your first time creating a Scala project with IntelliJ, you’ll need to install a Scala SDK. To the right of the Scala SDK field, click the Create button.

5. Select the highest version number (e.g. 2.13.6) and click Download. This might take a few minutes but subsequent projects can use the same SDK.

6. Once the SDK is created and you're back to the “New Project” window click Finish.

## Writing code

1. On the Project pane on the left, right-click src and select New => Scala class. If you don’t see Scala class, right-click on HelloWorld and click on Add Framework Support..., 
select Scala and proceed. If you see Error: library is not specified, you can either click download button, or select the library path manually. If you only see Scala Worksheet 
try expanding the src folder and its main subfolder, and right-click on the scala folder.

2. Name the class Hello and change the Kind to object.

3. Change the code in the class to the following:

```
object Hello extends App {
  println("Hello, World!")
}
```

### Running it

1. Right click on Hello in your code and select Run ‘Hello’.
You’re done!

## Apostrophes and double quotes don't show up on inteliJ?
press Left Alt+Shift.

## How to start scala REPL(command-line shell)
_REPL => Read-Evaluate-Print-Loop_

**Ctrl+Shift+D**

OR

Right-click on your Scala object and select **Scala REPL**

```
## Useful intelliJ shortcuts
Find the search string in the project listing all files => **Ctrl + Shift + F**
Show usages => **Ctrl + Alt + F7**
Find usage in a file => **Ctrl + F7**
Highlight Usages in a file => **Ctrl + Shift + F7** (Use F3 or Shift+F3 to navigate through highlight usages and Escape to remove highlighting)
Find Usages => **Alt + F7**
Navigate | Last edit location => **Ctrl + Shift + Backspace**
To see declaration of the current method => **Alt + Q**

Use **Code | Reformat Code** to reformat code according to File | Settings | Code Style
Use **Code | Optimize Imports** to remove redundant/unused imports
```

# MEthod call
```
object calculateResult {
      def funSub(x:Int, y:Int) : Int =
   {
       var diff = 0
       diff = x - y
       return diff
   }
   
   def main(args: Array[String]) {

      // Function call
      println("Difference of the value is: " + funSub(8,6));
   }
}
```

# Method declaration and definition
```
def 'method_name' ('parameters':'return_type_parameters') : ('return_type_of_method') = {
    'method_body'
     return 'value'
}
```

# Scala | Trait App
App is a trait which is utilized to rapidly change objects into feasible programs, which is carried out by applying DelayedInit function and the objects inheriting the trait App uses this function to execute the entire body of the program as a section of an inherited main method.
**Note:**

trait App extends _DelayedInit_
The Linear Super-types here are: _DelayedInit, AnyRef, Any_
The value members are:
_val executionStart: Long
def main(args: Array[String]): Unit_

e.g. The above example can be modified as below(main is not needed now):

```
object calculateResult extends App {
      def funSub(x:Int, y:Int) : Int =
   {
       var diff = 0
       diff = x - y
       return diff
   }
   
   println("Difference of the value is: " + funSub(8,6));
 }
```

## Difference between var and val in scala
**val makes a variable immutable** - like final in Java
var makes a variable mutable.

```
// Scala program to illustrate sequence
object MainObject
{
    // Main Method
    def main(args:Array[String])
    {
        // Initializing sequence
        var seq:Seq[Int] = Seq(1, 2, 3, 4, 5, 6)
         
        // Printing Sequence
        seq.foreach((element:Int) => print(element+","))
         
        // Using Some Predefined Methods
        println("\nis Empty: "+ seq.isEmpty)
        println("\nEnds with (5,6): "+ seq.endsWith(Seq(5,6)))
        println("\nLength of sequence: "+ seq.length)
        println("\ncontains 3: "+ seq.contains(3))
        println("\nlast index of 4 : "+ seq.lastIndexOf(4))
        println("\nReversed sequence: "+ seq.reverse)
        println("\nElements Access Using Index")
        println(seq(0))
        println(seq(1))
    }
}

## Output
1,2,3,4,5,6,
is Empty: false

Ends with (5,6): true

Length of sequence: 6

contains 3: true

last index of 4 : 3

Reversed sequence: List(6, 5, 4, 3, 2, 1)
1
2
```

## File I/O

```
Import scala.io.Source
Source.fromFile("C://Users//arpianan//Desktop//Demo3.txt").mkStrings    // One line at a Time
Source.fromFile("C://Users//arpianan//Desktop//Demo3.txt").getLines()    // non-empty iterator
Source.fromFile("C://Users//arpianan//Desktop//Demo3.txt").getLines().foreach{x =>println(x)}
Console.readline                                                        //used to read the File from the console only.
Source.fromFile("C://Users//arpianan//Desktop//Demo3.txt").getLines.take(1).foreach(println)    //  take() function take the line element we want to read it from that read file.
Source.fromFile("C://Users//arpianan//Desktop//Demo3.txt").getLines.take(2).foreach(println)    //  prints line 2 of the file
Source.fromFile("C://Users//arpianan//Desktop//Demo3.txt").getLines.slice(0,2).foreach(println) // This takes up the two lines and gives the result for operation.

Source.fromFile(“Path of File”).getLines.toList                         // File to List

Scala> val b = Source.fromFile("C://Users//arpianan//Desktop//Demo3.txt")
b: scala.io.BufferedSource = non-empty iterator
```
So this buffered source has to be closed once the operations are done over them. So we use the .close method to perform the same.

## List
Lists are immutable whereas arrays are mutable in Scala.
Lists represents a linked list whereas arrays are flat.
In a Scala list, each element must be of the same type.

**Syntax:**
```
val variable_name: List[type] = List(item1, item2, item3)
or
val variable_name = List(item1, item2, item3)


// Scala program to print immutable lists
import scala.collection.immutable._

object GFG
{
	def main(args:Array[String])
	{
		// Creating and initializing immutable lists
		val mylist1: List[String] = List("Geeks", "GFG", "GeeksforGeeks", "Geek123")
		val mylist2 = List("C", "C#", "Java", "Scala", "PHP", "Ruby")
        
		println("List 1:")
		println(mylist1)
        
		println("\nList 2:")
		for(mylist<-mylist2)
		{
		    println(mylist)
		}
	}
}
```

## Iterating over JSONObject
```
jsonObject = new JSONObject(contents.trim());
Iterator<String> keys = jsonObject.keys();
while(keys.hasNext()) {
    String key = keys.next();
    if (jsonObject.get(key) instanceof JSONObject) {
          // do something with jsonObject here      
    }
}
```

## Check if mystring exists in a list of strings
strings.contains(myString)

## break and continue
### break
```
import util.control.Breaks._

breakable {
  for (i <- 1 to 10) {
    println(i)
    if (i > 4) break  // break out of the for loop
  }
}
# Output: 1 2 3 4 5
```

### continue
```
import util.control.Breaks._

object BreakTests extends App {    
    for (i <- 1 to 10) {
        breakable {
            if (i % 2 == 0) break
            println(i)
        }
    }
}
# Output: 1,3,5,7,9
```

## Iterators
```
val it=Iterator(2,4,3,7,9)
while(it.hasNext){
  println(it.next())
}
```

### Accessing keys and values on JSONObject. e.g. myjsonobj = {"id":12345, "date":453454545, "user":{"name":"sam", "email":xyz@email.com}}
```
val keys = myjsonobj.keys()
while(keys.hasNext){
  val key = keys.next()
  println(key)
}
```
#### Accessing values
```
val keys = myjsonobj.keys()
while(keys.hasNext){
  val key = keys.next().toString
  val value = myjsonobj.get(key)
  println(value)
}
```

### Other operations
Here, we used ita and itb, itc and itd to perform four different operations because iterator can be traversed only once.

```
object Demo {
   def main(args: Array[String]) {
      val ita = Iterator(20,40,2,50,69, 90)
      val itb = Iterator(20,40,2,50,69, 90)
      
      println("Maximum valued element " + ita.max )
      println("Minimum valued element " + itb.min )
      
      println("Value of itc.size : " + itc.size )
      println("Value of itd.length : " + itd.length )
   }
}
```

### Check datatype of a varialbe whether it's a JSONObject, String or List
val myVar = "hello"

myVar.isInstanceOf[JSONObject]		=> False

myvar.isInstanceOf[String]		=> True

## How to check if a string is actually a number without attempting to convert it first, in Scala
```
// this is the class that provides the isNumber method when called on java.lang.String
class ExtendedString(s:String) {
	def isNumber: Boolean = s.matches("[+-]?\\d+.?\\d+")	
}

// and this is the companion object that provides the implicit conversion
object ExtendedString {
	implicit def String2ExtendedString(s:String) = new ExtendedString(s)
}

import ExtendedString._
object IsNumber extends App {
	println("Implicit 1: " + "123".isNumber)
	println("Implicit 2:" + "123a".isNumber)
	println("Implicit 3:" + "123.55".isNumber)

	val l = List("1", "3", "awdf", "123")
	println("Elements in list: "  + l.forall(_.isNumber))
}
```

## isDigit
```
  scala> "abc123" exists (_.isDigit)
  res1: Boolean = true
```

## How to add elements to a List in Scala (List, ListBuffer)
This is actually a trick question, because you can't add elements to a Scala List; it's an immutable data structure, like a Java String.

### Solution

To work with a List, the general approach is to prepend items to the list with the :: method while assigning the results to a new List:

```
scala> val x = List(2)
x: List[Int] = List(2)

scala> val y = 1 :: x
y: List[Int] = List(1, 2)

scala> val z = 0 :: y
z: List[Int] = List(0, 1, 2)
```

Rather than continually reassigning the result of this operation to a new variable, you can declare your variable as a var, and reassign the result to it:
```
scala> var x = List(2)
x: List[Int] = List(2)

scala> x = 1 :: x
x: List[Int] = List(1, 2)

scala> x = 0 :: x
x: List[Int] = List(0, 1, 2)
```

As these examples illustrate, the :: method is right-associative; lists are constructed from right to left.
Any Scala method that ends with a : character is evaluated from right to left. This means that the method is invoked on the right operand. You can see how this works by analyzing the following code, where both methods print the number 42:

```
object RightAssociativeExample extends App {
    val f1 = new Printer
    f1 >> 42
    42 >>: f1
}

class Printer {
    def >>(i: Int) { println(s"$i") }
    def >>:(i: Int) { println(s"$i") }
}

The two methods can also be invoked like this:

f1.>>(42)
f1.>>:(42)
```

Though using :: is very common, there are additional methods that let you prepend or append single elements to a List:
```
scala> val x = List(1)
x: List[Int] = List(1)

scala> val y = 0 +: x
y: List[Int] = List(0, 1)

scala> val y = x :+ 2
y: List[Int] = List(1, 2)
```

### Use a ListBuffer when you want a "List" you can modify
If you want to use a Scala sequence that has many characteristics of a List and is also mutable — i.e., you can add and remove elements in it - the correct approach is to use the Scala ListBuffer class instead, like this:

```
import scala.collection.mutable.ListBuffer

var fruits = new ListBuffer[String]()
fruits += "Apple"
fruits += "Banana"
fruits += "Orange"

val fruitsList = fruits.toList	//Then convert it to a List if/when you need to...
```

**Note:** Depending on your needs, it may be better to use an ArrayBuffer rather than a ListBuffer.
