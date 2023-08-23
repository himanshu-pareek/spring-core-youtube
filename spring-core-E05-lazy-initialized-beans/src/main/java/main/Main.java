package main;

import controllers.AuthorController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repositories.AuthorRepository;
import services.AuthorService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("-------- Application context initialized ------------");
        AuthorRepository repository = applicationContext.getBean(AuthorRepository.class);
        System.out.println(repository);
        AuthorService service = applicationContext.getBean(AuthorService.class);
        System.out.println(service);
        AuthorController controller = applicationContext.getBean(AuthorController.class);
        System.out.println(controller);
    }
}
