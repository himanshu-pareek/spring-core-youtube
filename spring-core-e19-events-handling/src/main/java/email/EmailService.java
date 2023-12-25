package email;

import events.SendEmailEvent;
import org.springframework.context.ApplicationEvent;
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
    @Order(20)
    public EmailSentEvent onApplicationEvent(SendEmailEvent event) {
        // Send email to event.emailAddress
        return new EmailSentEvent(
                this,
                event.getEmailAddress(),
                event.getSubject()
        );
    }
}
