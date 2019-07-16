# JEP 222 Lab Solutions


1. Compile src/main/java/net/javajudd/jep200/Main.java.
```
javac -cp lib/commons-lang3-3.9.jar -d target/classes src/main/java/net/javajudd/jep200/Main.java
```

2. Run net.javajudd.jep200.Main passing a String as an argument.
```
java -cp lib/commons-lang3-3.9.jar:target/classes net.javajudd.jep200.Main HelloWorld
```

3. Make project into a module.

Create module-info.java in src/main/java
```
module net.javajudd.jeptwohundred {

    requires org.apache.commons.lang3;

    exports net.javajudd.jep200;
}
```

4. Compile module.

```
javac -p lib -d out src/main/java/module-info.java src/main/java/net/javajudd/jep200/Main.java
```

5. Run module.
```
java -p lib:out -m net.javajudd.jeptwohundred/net.javajudd.jep200.Main HelloWorld
```
