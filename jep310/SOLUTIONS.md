# JEP 310 Lab Solutions

1. Dump system class to classes.jsa.
~~~
java -Xshare:dump
~~~
1. Look for classes.jsa.
~~~
ls -al ${JAVA_HOME}/lib/server
~~~
1. Run with jar with time command.
~~~
time java -jar target/jep310-1.0-SNAPSHOT.jar
~~~
1. Run jar again with time command disabling shared class-data.
~~~
time java -Xshare:off -jar target/jep310-1.0-SNAPSHOT.jar
~~~
1. Which run had the faster start up time based on the user time?<br>
Default run because it uses the share class data file.
