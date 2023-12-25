package customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public void greet(
            String email,
            String name
    ) {
        String subject = "Welcome " + name;
        String body = "Hi " + name + ",\nWelcome to JavaRush!";
    }
}
