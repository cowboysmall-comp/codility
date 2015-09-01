codility
========

Become a better programmer. Develop your coding skills with our lessons. Take part in our challenges.



building / running / running tests
----------------------------------

As a variety of different languages have been used in this project (so far Python and Java, but Scala, 
C++, Ruby, Groovy, and more to come) a number of ways to build and run the code have been provided:



### Python

To run code execute the following:

    python src/demos/equi.py

and to run all tests execute the following:

    python setup.py test



### Java

There are two options provided for running Java code: Maven and Gradle. For example, when using Maven to 
compile and run tests execute the following:

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


