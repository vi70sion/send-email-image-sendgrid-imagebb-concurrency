package org.example.utility;

public class Constants {
    public final static String URL = "jdbc:mysql://localhost:3306/work_queue";
    public final static String USERNAME = "root";
    public final static String PASSWORD = "*";
    public final static String SENDGRIDAPIKEY = "*";
    public final static String IMAGEBBAPIKEY = "*";

    private Constants() {
        throw new AssertionError("Cannot instantiate the Constants class");
    }

}
