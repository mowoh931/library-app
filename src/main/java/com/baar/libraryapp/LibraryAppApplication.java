package com.baar.libraryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryAppApplication {
    private static String SERVER_PORT;

    public static void main(String[] args) {
        SpringApplication.run(LibraryAppApplication.class, args);
        System.out.println("hello world!");

        SERVER_PORT = System.getenv("server_port");
        System.out.println(SERVER_PORT);
        System.out.println(System.getenv("application_name"));
        //Reverse a String
        String x = "hello";
        StringBuilder builder = new StringBuilder();
        StringBuilder y = builder.append(x);
        y.reverse();
        System.out.println(y);


        StringBuffer buffer = new StringBuffer(x);
        String reversedString = buffer.reverse().toString();
    }

}
