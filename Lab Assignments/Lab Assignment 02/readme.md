# Lab Assignment 02

In this lab you will practice writing Java code to **declare variables** and **output different data types**.

Same as Lab Assignment 01, you need to set up your workspace (class and main() method).

## Let's get started!

First, let's look at the name of our .java file in the `src/` directory and name our class accordingly and remember to make it `public`.

```java
public class MixMatch {

	// Your main() method goes here.
}
```

Next, **create your main() method inside the MixMatch class**. It should be the same as in Lab Assignment 01. Try writing the main() method without looking at your notes. Writing your main class and method should come to you as natural as in C++.

Now let the fun begin!

### Declaring variables & arithmetic operations

Exactly the same as C++. Only strings start with a capital 'S'.

&emsp;**data_type identifier = literal_value**;

or

&emsp;**data_type identifier**;

Remember the rules for variable identifiers: 
* Don't start with numbers.
* Don't include spaces.
* Don't include special characters, except `_`.
* Don't use reserved keywords like `class`, `return`, or `void`.
* Don't start with a capital letter, those are reserved for class identifiers.

For more information about variables in Java visit: https://www.w3schools.com/java/java_variables.asp and https://www.w3schools.com/java/java_data_types.asp 

### Outputting different data types

Java's `print()` and `println()` method are caple of outputting all data types: String, int, double, boolean, etc.

But, what if you want to output multiple data types in the same print method?

Simply seperate them with the addition/concatination operator `+`.

But how does this work with mixed data types? Java uses automatic type conversion to String on all non-String data types. To invoke this automatic type conversion <ins>you must include a String somewhere inside the parenthesis of your print method</ins>.

```java
System.out.print("must have a string" + 5 + true + 7.2);
// or
System.out.println("must have a string" + 5 + true + 7.2);
```

Easy peasy!

## Your Assignment

### Mix & Match Data Types

**Declare and initialize 8 variables** of type `String`, `char`, `short`, `int`, `long`, `float`, `double`, and `boolean`. 

Next, output the stored literal value for each variable **along with a brief description of the data type**. Use a single print method for each variable.

**Example:**
```java
int varInt = 7;
System.out.println(varInt + " <- Integer, stores whole numbers from -2,147,483,648 to 2,147,483,647");
```
Lastly, practice outputting **multiple variables with a single print method**.

## Submit your assignment

To submit your lab assignment click on the **Source Control** icon (3 circles with 2 lines) on your leftside navbar. Next, click on the **+** symbol next to **Changes** to stage your changes. Lastly, add a commit message (ex: "First commit") and click **Commit** then **Sync Changes**. And you're done!