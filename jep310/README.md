# JEP 310 Lab
[JEP 310: Application Class-Data Sharing](https://openjdk.java.net/jeps/310)
Release: 10 <br>
Component: hotspot/runtime

NOTE: Using something after Java 11 likely will give you different results.

1. Change directory to jep310
~~~
cd jep310
~~~
1. Build jar.
~~~
./mvnw package
~~~
1. Run jar.
~~~
java -jar target/jep310-1.0-SNAPSHOT.jar
~~~
1. Dump system class to classes.jsa.
1. Run with jar with time command.
1. Run jar again with time command disabling shared class-data.
1. Which run had the faster start up time based on the user time?

[Solutions](SOLUTIONS.md)