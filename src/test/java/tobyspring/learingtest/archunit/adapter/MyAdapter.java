package tobyspring.learingtest.archunit.adapter;

import tobyspring.learingtest.archunit.application.MyService;

public class MyAdapter {
    MyService myService;
    
    void run() {
        myService = new MyService();
        System.out.println("myService = " + myService);
    }
}
