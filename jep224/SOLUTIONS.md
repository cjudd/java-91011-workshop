# JEP 224 Lab Solutions


1. Generate and view JavaDoc.
```
./mvnw javadoc:javadoc
open target/site/apidocs/index.html
```
or
```
./mvnw javadoc:javadoc
start target/site/apidocs/index.html
```
2. Search for People and Person.
3. Add index of searchme to PersonServiceImpl.
```
/**
 * Implementation of the PeopleService interface.
 * {@index searchme}
 */
```
4. Generate and view JavaDoc.
5. Search for searchme.
