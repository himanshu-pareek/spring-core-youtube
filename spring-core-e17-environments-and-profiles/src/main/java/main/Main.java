package main;

import config.ProjectConfig;
import db.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setDefaultProfiles("development");

        System.out.println(context.getEnvironment().getProperty("USER"));
        System.out.println(context.getEnvironment().getProperty("prop"));

        context.register(ProjectConfig.class);
        context.refresh();
        System.out.println(Arrays.toString(context.getEnvironment().getActiveProfiles()));
        System.out.println(context.getBean(DataSource.class));
    }
}
