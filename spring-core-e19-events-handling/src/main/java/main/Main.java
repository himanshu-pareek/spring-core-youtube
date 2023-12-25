package main;

import config.ProjectConfig;
import customer.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CustomerService customerService = context.getBean(CustomerService.class);
        customerService.greet("abc@email.com", "John Doe");
        context.stop();
        context.start();
    }
}
