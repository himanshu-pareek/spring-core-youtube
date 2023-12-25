package author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class AuthorService {

    private MessageSource messageSource;

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void printAuthoredBooks(
            Author author,
            int numberOfBooks,
            Locale locale
    ) {
        String message = messageSource.getMessage(
                "authored.count",
                new Object[]{author.getFirstName(), numberOfBooks},
                locale
        );
        System.out.println(message);
    }
}
