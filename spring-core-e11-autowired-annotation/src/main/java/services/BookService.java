package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.lang.Nullable;
import repositories.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    private EmailService emailService;

    @Autowired
    public BookService(BookRepository bookRepository, @Nullable EmailService emailService) { // 2
        System.out.println("const 3");
        this.bookRepository = bookRepository;
        this.emailService = emailService;
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookRepository=" + bookRepository +
                ", emailService = " + emailService +
                '}';
    }
}
