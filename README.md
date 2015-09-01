Codility
========

Become a better programmer. Develop your coding skills with our lessons. Take part in our challenges.



Running Code
------------

As a variety of different languages have been used in this project (so far Python and Java, but Scala, 
C++, Ruby, Groovy, and more to come) a number of ways to build and run the code have been provided:



### Python

To run code execute the following:

    python src/demos/equi.py

and to run all tests execute the following:

    python setup.py test



### Java

There are three options for running Java code: SDK, Maven, and Gradle. For example, I would not advise it, 
but if you wanted to use __javac__ to compile the code you should execute the following:

    javac -d ./target/classes ./src/demos/Equi.java

and if you wanted to use __java__ to run an individual class you should execute the following:

    java -cp ./target/classes demos.Equi

when using Maven to compile and run tests execute the following:

    mvn test

and to run an individual class execute the following:

    mvn exec:java -Dexec.mainClass="demos.Equi"

which assumes code has been compiled. For Gradle you can either use __gradle__ if installed:

    gradle test

or use the provided __gradle wrapper__:

    ./gradlew test

and to run an individual class:

    gradle run -DmainClass=demos.Equi

or:

    ./gradlew run -DmainClass=demos.Equi


