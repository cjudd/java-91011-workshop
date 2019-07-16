package net.javajudd.jep200;

import static org.apache.commons.lang3.StringUtils.*;

public class Main {
    public static void main(String[] args) {
        var message = center(upperCase(args[0]), 50, '*');
        System.out.println(message);
    }
}
