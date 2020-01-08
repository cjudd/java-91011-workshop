# Upgrade Lab

Either you can try to update your existing application or try this simple application.

1. Clone project.
```
https://github.com/cjudd/wordyninjablog.git
```

2. Run mysql container.
```
docker run --name wordyninja_db \
    -e MYSQL_ROOT_PASSWORD=root+1 \
    -e MYSQL_DATABASE=wordyninjablog \
    -e MYSQL_USER=wordyninja \
    -e MYSQL_PASSWORD=wordyninja+1 \
    -p 3306:3306 \
    -d mysql:latest
```

3. Using Java 8, run application. It should run fine.
```
./gradlew bootRun
```

4. Upgrade application and run with Java 11.