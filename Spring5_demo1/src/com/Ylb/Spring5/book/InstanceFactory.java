package com.Ylb.Spring5.book;

public class InstanceFactory {
    public static Foo foo = new Foo();

    public Foo getFooInstance() {
        return foo;
    }
}
