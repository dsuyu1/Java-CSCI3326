# Lab Assignment 01

In this lab you will practice writing Java code to output a simple **Hello World!** message.

Similar to C++, we have to set up our work are before we can write our output command.

## Let's get started!

First let's look at the name of our .java file in the `src/` directory. Java is an object-oriented programming (OOP) language that requires us to create a class in order to run code, so let's create a class! In Java our main class must have the same name as our .java file, so let's make a class with the same name as our file and let's make it `public`.

```java
public class Hello {

}
```

Unlike C++, we don't need to add a semicolon (;) at the end of our class declaration.

Next, let's create a `main()` method inside our Hello class and let's make it `public`!

```java
	public static void main(String[] args) {

	}
```

You'll notice this main() method is different from the main() method you used in C++. Some key words that may stand out are `static` and `String[] args`. `String[] args` is simply a parameter for a string array we are passing into our method, it can be replaced by `String[] oogabooga` (not good practice though). The `static` keyword will be discussed later.

Last step!

Finally, lets add our output command to print out **Hello World!**. We can do this using either `print()` or `println()`.

```java
		// cout << "Hello World!";
		System.out.print("Hello World!");
```

or

```java
		// cout << "Hello World!" << endl;
		System.out.println("Hello World!");
```

Now let's run our code! You should get a **Hello World!** message on your terminal.

## Submit your assignment

To submit your lab assignment click on the **Source Control** icon (3 circles with 2 lines) on your leftside navbar. Next, click on the **+** symbol next to **Changes** to stage your changes. Lastly, add a commit message (ex: "First commit") and click **Commit** then **Sync Changes**. And you're done!