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


## How to start scala REPL(command-line shell)
_REPL => Read-Evaluate-Print-Loop_

**Ctrl+Shift+D**

OR

Right-click on your Scala object and select **Scala REPL**


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
