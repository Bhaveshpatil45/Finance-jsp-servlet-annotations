package com.finance.annotations;

import org.apache.catalina.startup.Tomcat;

public class PersonalFinanceApplication {
    public static void main(String[] args) {
        try {
            Tomcat tomcat = new Tomcat();
            tomcat.setPort(8080);
            tomcat.setBaseDir(".");
            tomcat.addWebapp("/", new java.io.File("src/main/webapp").getAbsolutePath());
            tomcat.start();
            System.out.println("Personal Finance Application is running at http://localhost:8080/");
            tomcat.getServer().await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
