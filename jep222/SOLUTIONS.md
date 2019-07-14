# JEP 222 Lab Solutions


1. Open JShell. 
```
jshell
```

2. Execute commands:
```
/help
var i = 2 + 3
/var
int sum(int a, int b) {
   return a + b;
}
var s = sum(4, 8)
/open jep222/Person.java
/type
var p = new Person().withName("Chris")
System.out.println(p);
/env --class-path jep222/lib/commons-lang3-3.9.jar
import org.apache.commons.lang3.builder.ToStringBuilder
/import
ToStringBuilder.reflectionToString(p)
/exit 
``` 
