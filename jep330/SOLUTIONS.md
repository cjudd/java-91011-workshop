# JEP 330 Lab Solutions


1. Example of running jcurl with a website containing a valid certificate. 
```
java jcurl.java  https://www.google.com
```

Example of running jcurl with a website containing an invalid certificate.

```
java jcurl.java  https://www.cpclerk.co.summit.oh.us
```

2. Make jcurler executable.

- Add shebang as the first line of the file.

NOTE: Use which or equivalent to determine java path.

```java
#!/usr/bin/java --source 11 
//LAB - JEP330: add shebang to make the file executable

import java.net.*;
import java.net.http.*;
import java.net.http.HttpClient.*;
import java.net.http.HttpResponse.*;
import java.time.*;

class jcurler {
  public static void main(String[] args) throws Exception {

    HttpClient client = HttpClient.newBuilder()
        .version(Version.HTTP_1_1)
        .followRedirects(Redirect.NORMAL)
        .connectTimeout(Duration.ofSeconds(20))
        .build();

    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(args[0]))
        .timeout(Duration.ofMinutes(1))
        .build();

    HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
    System.out.println(response.statusCode());
    System.out.println(response.body());
  }

}
```

- Change permission on file.

```
chmod 744 jcurler
```

- Execute script.
```
./jcurler http://www.google.com
```
