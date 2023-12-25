package email;

import org.springframework.context.ApplicationEvent;

public class EmailSentEvent extends ApplicationEvent {
    public EmailSentEvent(
            Object source,
            String to,
            String subject
    ) {
        super(source);
    }
}
