package email;

import events.SendEmailEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

  @EventListener
  @Order(10)
  public void sendEmail2(SendEmailEvent event) {
    System.out.println("Another send email method");
  }

  @EventListener
  @Order(5)
  public void sendEmail(SendEmailEvent event) {
    System.out.println("Sending email to " + event.getEmail());
  }

  @EventListener({ContextRefreshedEvent.class, ContextStartedEvent.class})
  public void foo(ApplicationEvent event) {
    System.out.println(event);
  }
}
