package events;

import org.springframework.context.ApplicationEvent;

public class SendEmailEvent extends ApplicationEvent {
  private final String email;
  private final String subject;
  private final String body;
  public SendEmailEvent(Object source, String email, String subject, String body) {
    super(source);
    this.email = email;
    this.subject = subject;
    this.body = body;
  }

  public String getSubject() {
    return subject;
  }

  public String getBody() {
    return body;
  }

  public String getEmail() {
    return email;
  }
}
