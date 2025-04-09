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
* **Streams API with Files**: Using `Files.lines(Path)` for stream operations.Repository Structure
