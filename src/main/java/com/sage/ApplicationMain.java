package com.sage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.List;

// The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan with their default attributes
// Added CommandLineRunner to basic generated app
@SpringBootApplication
public class ApplicationMain implements CommandLineRunner {

    @Autowired
    private NodeConfiguration prodConfig;

    @Autowired
    private UserConfiguration userConfig;


    public static void main(String[] args) {

        SpringApplication.run(ApplicationMain.class, args);
    }

    // This is for CommandLineRunner
    @Override
    public void run(String... args)  {

        List<Node> nodes = prodConfig.getProduction();
        List<User> users = userConfig.getProductionusers();

        for (Node node : nodes ) {
            System.out.println(node.getName() + " " + node.getHost());
        }

        for (User user : users ) {
            System.out.println(user.getUsername() + " " + user.getPassword());
        }
    }
}
