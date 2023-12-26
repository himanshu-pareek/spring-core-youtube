package customer;

import events.SendEmailEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }



    public void greet(
            String email,
            String name
    ) {
        String subject = "Welcome " + name;
        String body = "Hi " + name + ",\nWelcome to JavaRush!";

        this.publisher.publishEvent(
            new SendEmailEvent(
                this,
                email,
                subject,
                body
            )
        );

        System.out.println("Email sent");
    }
}
