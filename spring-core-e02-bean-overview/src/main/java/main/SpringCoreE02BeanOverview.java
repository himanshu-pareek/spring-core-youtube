package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.AuthorService;

public class SpringCoreE02BeanOverview {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");

        /*
        // 1. Access the bean by type
        AuthorService service = context.getBean(AuthorService.class);

        // 2. Access the bean using id and type
        AuthorService service1 = context.getBean("authorService", AuthorService.class);

        // 3. Using name(s) of the bean
        var s2 = context.getBean("authorService2", AuthorService.class);
        var s4 = context.getBean("authorService4", AuthorService.class);

        // 4. Using alias
        var s5 = context.getBean("authorService5", AuthorService.class);

        System.out.println(service);
        System.out.println(service1);
        System.out.println(s2);
        System.out.println(s4);
        System.out.println(s5);
        */

//        var service = context.getBean(AuthorService.class);
//        System.out.println(service);

        var service = context.getBean(AuthorService.class);
        System.out.println(service);

    }
}
