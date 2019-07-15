package net.javajudd.jep286;

import org.aopalliance.intercept.MethodInterceptor;
import org.junit.Test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class VarTests {

    @Test
    public void testPrimativeInitialization() {
        var i = 1;
        assertThat(i).isEqualTo(1);
        assertThat(i).isInstanceOf(Integer.class);
    }

    @Test
    public void testExplicitPrimativeInitialization() {
        int i = 1;
        assertThat(i).isEqualTo(1);
        assertThat(i).isInstanceOf(Integer.class);
    }

    @Test
    public void testStringInitialization() {
        var s = "Hello World";
        assertThat(s).isInstanceOf(String.class);
    }

    @Test
    public void testExplicitStringInitialization() {
        String s = "Hello World";
        assertThat(s).isInstanceOf(String.class);
    }

    @Test
    public void testArrayListInitialization() {
        var list = new ArrayList<String>();
        assertThat(list).isInstanceOf(ArrayList.class);
    }

    @Test
    public void testListOfInitialization() {
        var list = List.of(1, 2.0, "3");
        assertThat(list).hasSize(3);
    }

    @Test
    public void testExplicitListInitialization() {
        List<? extends Serializable> list = List.of(1, 2.0, "3");
        assertThat(list).hasSize(3);
    }

    @Test
    public void testVarIsNotKeyword() {
        var var = "Hello World";
        assertThat(var).isEqualTo("Hello World");
    }

    @Test
    public void testPolyExpressions() {
        // invalid
        // var ints = {0, 1, 2};
        // var appendSpace = a -> a + " ";
        // var compareString = String::compareTo;
    }
    @Test
    public void testPolyExpressionExplicitly() {
        int[] ints = {0, 1, 2};
        MethodInterceptor methodInterceptor = a -> a + " ";
        Comparator<String> stringComparator = String::compareTo;
    }

}
