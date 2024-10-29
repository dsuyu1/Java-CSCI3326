# Lab Assignment 14

In this lab you will practice working with functions.

Unlike previous labs, your class has already been created for you. 

## Let's get started!

Create your new functions **outside the main() method, but inside your class**.

Now let's begin!

### Functions

Functions in Java have a similar syntax as functions in C++, except Java requires you to include the `static` keyword at the beginning. We will discuss why later.

A function is a block of code which only runs when it is called. You can also send and receive data to and from a method.

In Java, **functions must be declared inside a class**. Functions declared inside of a class are called **Methods**.

For more information about methods in Java visit: https://www.w3schools.com/java/java_methods.asp or https://www.programiz.com/java-programming/methods

### Parameters

Parameters are **variables declared inside the method's** `( )` and are used to receive and store data sent to the method.

**Example:**

```java
static void main(String[] args) {
	// Sending data in method call.
	myFunction( 2, 3.21f, "abc" );
}
// Parameters will receive:  2    ,    3.21f    ,     "abc"
static void my_function( int param1, float param2, String param3 ) { /**/ }
```

For more information on parameters in Java visit: https://www.w3schools.com/java/java_methods_param.asp

### Returning Values

In order to send data from a method you have to specify what value will be returned in its prefix. 

**Non-value returning methods** have prefix `void`. 

**Value-returning methods** have the prefix of the values type: `int`, `float`, `String`, etc. and require the `return` keyword somewhere inside its `{ }`. 

```java
// Returning a String value
static String my_str_function() { return "abc"; }
// Returning an Integer value
static int my_int_function() { return 0; }
```

For more information on returning values in Java visit: https://www.w3schools.com/java/java_methods_return.asp

## Your Assignment

### Simple Math

Create three **Integer returning methods** `sum()`, `max()`, and `min()`. All methods will **receive an Integer array** in their parameter.

The `sum()` method should return the addition of all the values in the array.

The `max()` method should return the largest value within the array.

The `min()` method should return the smallest value within the array.

**Test Your Code:**

Unlike previous labs, this lab includes test cases. Run the following commands in your terminal to test your code:

```
./build.sh
./test.sh
```

## Submit your assignment

To submit your lab assignment click on the **Source Control** icon (3 circles with 2 lines) on your leftside navbar. Next, click on the **+** symbol next to **Changes** to stage your changes. Lastly, add a commit message (ex: "First commit") and click **Commit** then **Sync Changes**. And you're done!