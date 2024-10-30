# Lab Assignment 13

In this lab you will practice working with Vectors.

Same as the previous labs, you need to set up your workspace (class and main() method).

## Let's get started!

First, let's look at the name of our .java file in the `src/` directory and name your class accordingly and remember to make it `public`. Next, **create your main() method inside your class**.

Now let's begin!

### Vectors

Vector is like the dynamic array which can grow or shrink its size. Unlike array, we can store n-number of elements in it as there is no size limit.

The Vector class is found in the *java.util* package, so it needs to be imported.

```java
import java.util.Vector;
```

To create a vector in Java we need to follow the structure below.

**Vector< Type > vector_name = new Vector();**

The **Type** indicates the data type of the vector. For example:

```java
// Declaring an Integer vector
Vector<Integer> vector1 = new Vector<>();

// Declaring a String vector
Vector<String> vector2 = new Vector<>();
```

### Adding Elements to a Vector

To append/add new elements to a vector we can use the `add()` method. By default, all new elements will be added to the back of the vector.

We can specify the index of where we want to add the element by using `add()` as well.

```java
// Adding elements 5 and 7 to vector1.
vector1.add(5);
vector1.add(7);

// We can print out the entire vector to verify.
System.out.println(vector1);

// Add element 3 to index 1.
vector1.add(1, 3);

// Let's see where 3 was placed.
System.out.println(vector1);
```

### Retrieving an Element from a Vector

To retrieve/get an element from a vector we can use the `get()` method by passing the index of the element we want to retrieve.

```java
// Declaring a String vector
Vector<String> animals = new Vector<>();

// Adding elements "Horse" and "Cow"
animals.add("Horse");
animals.add("Cow");

// Retrieving the first element.
String element = animals.get(0);
System.out.println( element );
```

### Removing Elements from a Vector

To remove a single or all elements from a vector we can use the `remove()` method to remove a specific element or the `clear()` method to remove all elements.

```java
// Declaring a String vector
Vector<String> bugs = new Vector<>();
// Adding elements "Ant" and "Beetle"
bugs.add("Ant");
bugs.add("Beetle");
bugs.add("Fly");

// Remove second element.
String element = bugs.remove(1);
System.out.println("Removed: " + element);
// Verify
System.out.pritnln(bugs);

// Remove all elements.
bugs.clear();
// Verify
System.out.println(bugs);
```

To learn more about Vectors in Java you can follow these tutorials https://www.programiz.com/java-programming/vector and https://www.javatpoint.com/java-vector.


## Your Assignment

### Vector Practice

Practice working with vectors by following the steps below.

1. Declare an empty vector array of type String.

2. Add the following elements: "Toyota", "Ford", "Chevy", "Mercedes", "Tesla". Then print the vector.

3. Remove "Chevy" from the vector and print the vector to confirm.

4. Add "Audi" as the second element of the vector and print to confirm.

5. Replace "Mercedes" with "Cadilac" using the `set()` method and print to confirm.

6. Clear the array.

## Submit your assignment

To submit your lab assignment click on the **Source Control** icon (3 circles with 2 lines) on your leftside navbar. Next, click on the **+** symbol next to **Changes** to stage your changes. Lastly, add a commit message (ex: "First commit") and click **Commit** then **Sync Changes**. And you're done!