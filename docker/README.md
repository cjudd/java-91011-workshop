# Docker Support
Improved Docker Support<br>
Release: 10 <br>

1. Launch Docker container with 512 memory and limited CPUs.

```
docker run -it --rm -m=512M -c=512 -v "$PWD":/usr/src/myapp -w /usr/src/myapp openjdk:11 bash
```

2. Run Docker file.

```
java Docker.java
```

3. Run Docker file again disabling continer support.
```
java -XX:-UseContainerSupport Docker.java
```

[Solutions](SOLUTIONS.md)
