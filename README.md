# Advanced-Java-6thSemester-Repository

This repository contains code examples and summaries from a series of Java lectures. The code is organized into separate folders, each corresponding to a specific lecture topic.

## Chapters:

### Chapter 01: Exception Handling Basics

* **Definition of Exceptions**: Events that disrupt the normal flow of a program.
* **Types of Exceptions**:
  * **Checked Exceptions**: Handled at compile-time (e.g., `IOException`).
  * **Unchecked Exceptions**: Handled at runtime (e.g., `NullPointerException`).
* **Exception Hierarchy**: `Throwable`, `Exception`, `RuntimeException`.
* **Exception Handling Mechanism**: `Try-Catch` and `Finally` blocks.
* **Common Exceptions**: `ArithmeticException`, `NullPointerException`, `ArrayIndexOutOfBoundsException`.
* **Handling Multiple Exceptions**: Using multiple `catch` blocks.

### Chapter 02: Advanced Exception Handling

* **Throwing Exceptions**: Using the `throw` keyword.
* **Propagating Exceptions**: Using the `throws` clause.
* **Creating Custom Exceptions**: Extending the `Exception` class.
* **Chained Exceptions**: Wrapping one exception inside another.
* **Best Practices**: Using exceptions for unexpected errors, logging, and resource management.

### Chapter 03: Working with Files and Streams

* **Definition of Files and Streams**: Data collections and data transfer sequences.
* **Types of Files**: Text and Binary.
* **Types of Streams**: Input, Output, and Buffered.
* **File Operations**: Create, Read, Write, Delete.
* **Main Java Classes**: `File`, `FileWriter`, `FileReader`, `BufferedWriter`, `BufferedReader`, `FileInputStream`, `FileOutputStream`, `DataInputStream`, `DataOutputStream`, `ObjectInputStream`, `ObjectOutputStream`.
* **Key Methods**: `exists()`, `length()`, `getAbsolutePath()`, `write()`, `read()`, `readLine()`, `writeInt()`, `writeDouble()`, `writeObject()`, `readObject()`.

### Chapter 04: NIO and Stream API

* **NIO Introduction**: Differences between `java.io` and `java.nio`.
* **Key NIO Classes**: `Paths`, `Path`, `Files`.
* **Paths Class**: Creating `Path` objects with `Paths.get()`.
* **Path Interface**: Representing file paths with methods like `getFileName()`, `getRoot()`, `getParent()`.
* **Files Class**: Utility methods like `exists()`, `copy()`, `move()`, `delete()`, `readAllBytes()`, `write()`, `isDirectory()`.
* **Writing and Reading Files**: Using `Files.writeString()` and `Files.readString()`.
* **Try-with-Resources**: Automatic resource management.
* **Streams API with Files**: Using `Files.lines(Path)` for stream operations.Repository Structure.

## Chapter 05: Java Collections Framework

The Java Collections Framework is like a toolbox that helps you organize and manage groups of objects in a consistent way. It provides different types of collections depending on what you need:

* **Collection** is the root interface.
* **List** keeps things in order and lets you have duplicates.
* **Set** makes sure everything is unique-no duplicates allowed.
* **Queue** works like a line, where elements are processed in the order they arrive.
* **Map** stores key-value pairs, which is super handy for lookups.

Some popular implementations include:

* **ArrayList** : Think of it as a resizable array that remembers the order you add things in. Great for quick access but not the best if you’re constantly adding or removing items in the middle.
* **HashSet** : Perfect when you want to make sure you have unique items, and you don’t care about the order.
* **HashMap** : The go-to for storing pairs of data, like a phonebook. It’s fast and efficient.
* **LinkedList** : A flexible list that’s great for adding or removing items frequently, especially at the ends.
* **TreeSet** : Keeps everything sorted automatically, which is useful if you want your data ordered.
* **LinkedHashMap** : Like a HashMap but remembers the order things were added or accessed - great for cache implementations.
* **PriorityQueue** : Always gives you the highest or lowest priority item first, like a to-do list sorted by importance.

There are also handy utility methods to sort, shuffle, or make collections thread-safe. Plus, with the Streams API, you can process collections in a functional and elegant way, filtering and transforming data easily.

To walk through collections safely, Java provides iterators that let you move through elements one by one, and even modify them if needed.

---

## Chapter 06: Lambda Expressions and Method References

Lambda expressions are a neat way to write small chunks of code - like little functions - without all the usual boilerplate. They’re perfect when you need to implement interfaces that have just one method, known as functional interfaces.

Instead of writing a full class or anonymous inner class, you can write concise code that’s easier to read and maintain. For example, you can pass behavior around as data, making your programs more flexible and expressive.

Method references are a shorthand way to refer to existing methods, making your lambda expressions even cleaner.

These features fit perfectly with collections and streams, letting you filter, map, and process data in a clear and concise style.

---

## Chapter 07: Generics and Type Safety

Generics let you write code that works with any data type, but with the safety of compile-time checks. Imagine writing a box class that can hold any type of object, but once you specify the type, the compiler helps ensure you don’t accidentally put the wrong kind of object inside.

This makes your code reusable and safer, catching errors early before they cause problems at runtime.

You can also restrict generics to certain types (bounded types) or use wildcards to allow some flexibility while still keeping things safe.

Generics are everywhere in Java, especially in collections, helping you avoid messy casts and runtime errors.

---

## Chapter 08: Multithreading and Concurrency

Multithreading lets your program do multiple things at the same time, which is great for performance and responsiveness.

You can create threads by extending a Thread class or implementing Runnable. Threads go through different states - from being created, ready to run, running, waiting, and finally done.

Because multiple threads can access shared data, Java provides synchronization tools to avoid conflicts and keep data consistent.

Threads can also communicate with each other using special methods to wait and notify.

Java offers advanced utilities like thread pools, futures, and semaphores to help manage complex concurrent tasks more easily.

To write good multithreaded programs, it’s best to minimize shared data, use thread-safe collections, and rely on these higher-level tools to avoid tricky bugs.
