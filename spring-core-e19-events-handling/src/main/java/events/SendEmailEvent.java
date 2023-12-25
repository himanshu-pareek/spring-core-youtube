package events;

import org.springframework.context.ApplicationEvent;

public class SendEmailEvent extends ApplicationEvent {

    private final String emailAddress;
    private final String subject;
    private final String body;

    public SendEmailEvent(Object source, String emailAddress, String subject, String body) {
        super(source);
        this.emailAddress = emailAddress;
        this.subject = subject;

        this.body = body;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
}