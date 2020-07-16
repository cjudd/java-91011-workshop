# JEP 224 Lab Solutions

1. Run jar logging classes loaded to a log file.
```
java -Xlog:class+load:file=classes.log -jar target/jep158-1.0-SNAPSHOT.jar
```
1. View log file.
~~~
more classes.log
~~~
1. Notice how much time was spent before the classes were done loading.
1. Notice you can classes were loaded form a shared object file, module or jar file.