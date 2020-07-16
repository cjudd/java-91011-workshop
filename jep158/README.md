# JEP 158 Lab
[JEP 158: Unified JVM Logging](https://openjdk.java.net/jeps/158) & [JEP 225: JavaDoc Search](https://openjdk.java.net/jeps/225)<br>
Release: 9 <br>
Component: hotspot/svc

1. Change directory to jemp158
~~~
cd jep158
~~~
1. Build jar.
~~~
./mvnw package
~~~
1. Run jar.
~~~
java -jar target/jep158-1.0-SNAPSHOT.jar
~~~
1. Run jar again this time logging the classes loaded to a class.log file.

[Solutions](SOLUTIONS.md)