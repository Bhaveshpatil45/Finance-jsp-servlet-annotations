package com.finance.annotations;

import org.apache.catalina.startup.Tomcat;

public class PersonalFinanceApplication {
    public static void main(String[] args) {
        try {
            // Initialize Tomcat
            Tomcat tomcat = new Tomcat();
            tomcat.setPort(8080);

            // Set the base directory
            tomcat.setBaseDir(".");

            // Add a web application to Tomcat
            tomcat.addWebapp("/", new java.io.File("src/main/webapp").getAbsolutePath());

            // Start Tomcat
            tomcat.start();
            System.out.println("Personal Finance Application is running at http://localhost:8080/");
            tomcat.getServer().await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
