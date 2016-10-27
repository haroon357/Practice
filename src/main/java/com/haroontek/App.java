package com.haroontek;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App
{
    private Integer a = 10;
    private static String b = "Haroon";
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.testLambdas();
    }

    private void testLambdas()
    {
        Predicate<String> haroon = s->s.contains("haroon");
        Predicate<String> hm = haroon.and(s->s.contains("hamza"));
        System.out.println(hm.test("haroonhamza"));
    }
}
