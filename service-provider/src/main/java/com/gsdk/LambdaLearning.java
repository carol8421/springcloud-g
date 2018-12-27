package com.gsdk;

@FunctionalInterface
interface Print<T> {
    public void print(T x);
}

public class LambdaLearning {
    public static String PrintString(String s, Print<String> print) {
        print.print(s);
        return s;
    }
    public static String PrintSample() {
        return PrintString("Lamda calling looks cool", (x) -> System.out.println(x));
    }
}
