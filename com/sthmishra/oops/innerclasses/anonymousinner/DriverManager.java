package com.sthmishra.oops.innerclasses.anonymousinner;

public class DriverManager{

    public static Connection getConnection() {
        Connection conn = new Connection() {
            @Override
            public void create() {
                System.out.println("Anonymous inner cass method");
            }
        };

        return conn;
    }

}
