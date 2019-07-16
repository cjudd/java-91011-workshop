# Setup

1. If you haven't done so already either install JDK 11 from https://adoptopenjdk.net/ or another source or pull Docker container.

```
docker pull openjdk:11
```

2. Clone workshop repository.
```
git clone https://github.com/cjudd/java-91011-workshop.git
cd java-91011-workshop 
```

To run the workshop repository using docker run the following command.

```
docker run -it --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp -p 8080:8080  openjdk:11 bash
```
