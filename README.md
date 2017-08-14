---
layout: post
title: Cryptocurrencies
---

# Table of Contents
  * [Chapter 1 - Course Links](#chapter-1)
  * [Chapter 2 - Setup Developer Environment](#chapter-2)

## Chapter 1 - Course Links<a id="chapter-1"></a>

### Links to Code
* Cryptocurrency Course
  * Course Videos https://www.coursera.org/learn/cryptocurrency/programming/KOo3V/
  * Final Textbook - http://bitcoinbook.cs.princeton.edu/
  * Free Draft Textbook - https://d28rh4a8wq0iu5.cloudfront.net/bitcointech/readings/princeton_bitcoin_book.pdf

* Java Courses
  * https://www.udemy.com/java-tutorial/
  * https://www.udacity.com/course/java-programming-basics--ud282

## Chapter 2 - Setup Developer Environment<a id="chapter-2"></a>

* Download and Install
    * [Java Development Kit (JDK)](http://www.oracle.com/technetwork/java/javase/downloads/index.html) (version 8+)
        * Java SE Runtime Environment (JRE)
            * Includes Java Compiler `javac` (translate Java to bytecode for the JVM)
            * Includes JVM (translate bytecode into machine code to run Java code on different OSs)

        * Test the installation
            * Show version installed
                ```
                java -version
                ```
            * Compile and Run from Command Line (generate .class file)
                ```
                javac HelloWorld/HelloWorld.java
                cd ./HelloWorld; java HelloWorld; cd ..
                ```

    * [IntelliJ IDE](https://www.jetbrains.com/idea/download/#)
        * Create New Java Project in IntelliJ
            * File > New > Project > Java > Command Line
        * Import Existing Java Project into IntelliJ
            * File > New > Project from Existing Sources
        * Setup Java
            * Menu > IntelliJ IDEA > Preferences (CMD+,)
                * > Build, Execution, Deployment > Compiler > Java Compiler
                    * Javac
            * Menu > File > Project Structure
                * > Project Settings > Project > Project SDK
                    * 1.8 java JDK (i.e. /Library/Java/JavaVirtualMachines/jdk1.8.0_112.jdk/Contents/Home)
        * Setup Run/Debug Config
            * Run > Edit Configuration > + > Application
                * > Main Class (i.e. select HelloWorld.java file)