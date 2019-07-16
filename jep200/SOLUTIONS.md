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
javac -p lib -d target/classes src/main/java/module-info.java src/main/java/net/javajudd/jep200/Main.java
```

5. Run module.
```
java -p lib:target/classes -m net.javajudd.jeptwohundred/net.javajudd.jep200.Main HelloWorld
```

6. Jar module.
```
mkdir -p target/lib
jar -cvfe target/lib/my.jar net.javajudd.jep200.Main -C target/classes .
```

7. Link modules.
```
jlink -p lib/:target/lib:$JAVA_HOME/jmods --add-modules net.javajudd.jeptwohundred --strip-debug --compress=2 --output target/images
```

7. Convert library jar to a module.
```
jdeps --generate-module-info target/work lib/commons-lang3-3.9.jar
mkdir -p target/out
cp lib/commons-lang3-3.9.jar target/out/org.apache.commons.lang3.jar
mkdir target/clclasses
cd target/clclasses
jar xf ../../lib/commons-lang3-3.9.jar
cd ../work/org.apache.commons.lang3/
javac -p org.apache.commons.lang3 -d ../../clclasses/ module-info.java
jar uf ../../out/org.apache.commons.lang3.jar -C ../../clclasses module-info.class
cd ../../..
```

8. Link modules.
```
jlink -p target/lib:target/out:$JAVA_HOME/jmods --add-modules net.javajudd.jeptwohundred --strip-debug --compress=2 --output target/images
```

9. Run application.
```
target/images/bin/java net.javajudd.jep200.Main HelloWorld
``` 

10. Look at what was generated.
```
ls target/images
target/images/bin/java --list-modules
```

11. Determine disk space.
```
du -hs target/images
du -hs $JAVA_HOME
```