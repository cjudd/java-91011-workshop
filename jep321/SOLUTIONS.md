# JEP 321 Lab Solutions


```
import java.net.*;
import java.net.http.*;
import java.net.http.HttpClient.*;
import java.net.http.HttpResponse.*;
import java.time.*;

public class GoogleBooks2 {

    public static void main(String[] args) throws Exception {
        //LAB - JEP321: Add code to use the GoogleBooks api at https://developers.google.com/books/ to list Java book titles
        HttpClient client = HttpClient.newBuilder()
                .version(Version.HTTP_1_1)
                .followRedirects(Redirect.NORMAL)
                .connectTimeout(Duration.ofSeconds(20))
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.googleapis.com/books/v1/volumes?q=java"))
                .timeout(Duration.ofMinutes(1))
                .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }

}

```