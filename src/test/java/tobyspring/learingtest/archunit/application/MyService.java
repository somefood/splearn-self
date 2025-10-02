package tobyspring.learingtest.archunit.application;

import tobyspring.learingtest.archunit.adapter.MyAdapter;

public class MyService {
    MyService2 myService2;
    
    void run() {
        myService2 = new MyService2();
        System.out.println("myService2 = " + myService2);
    }
}
