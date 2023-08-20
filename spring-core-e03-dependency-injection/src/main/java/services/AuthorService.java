package services;

import jdk.dynalink.linker.LinkerServices;
import repositories.AuthorRepository;

import java.beans.ConstructorProperties;

public class AuthorService {

    // --------- 1. Setter based Dependency Injection ---------- //

//    private AuthorRepository authorRepository;
//    private EmailService emailService;
//    private int numberOfAuthors;

//    public void setAuthorRepository(AuthorRepository authorRepository) {
//        this.authorRepository = authorRepository;
//    }
//
//    public void setEmailService(EmailService emailService) {
//        this.emailService = emailService;
//    }
//
//    public void setNumberOfAuthors(int numberOfAuthors) {
//        this.numberOfAuthors = numberOfAuthors;
//    }

    // ------------ 2. Constructor based Dependency Injection -------- //

//    private final AuthorRepository authorRepository;
//    private final EmailService emailService;
//    private final int numberOfAuthors;
//
//    @ConstructorProperties({"author-repository", "email-service", "num-auths"})
//    public AuthorService(
//            AuthorRepository authorRepository,
//            EmailService emailService,
//            int numberOfAuthors
//    ) {
//        this.authorRepository = authorRepository;
//        this.emailService = emailService;
//        this.numberOfAuthors = numberOfAuthors;
//    }

    private AuthorRepository authorRepository;
    private EmailService emailService;
    private int numberOfAuthors;

    private AuthorService() {}

    private static final AuthorService instance = new AuthorService();

    public static AuthorService getInstance(
            AuthorRepository authorRepository,
            EmailService emailService,
            int numberOfAuthors
    ) {
        instance.authorRepository = authorRepository;
        instance.emailService = emailService;
        instance.numberOfAuthors = numberOfAuthors;
        return instance;
    }

    @Override
    public String toString() {
        return "AuthorService{" +
                "authorRepository=" + authorRepository +
                ", emailService=" + emailService +
                ", numberOfAuthors=" + numberOfAuthors +
                '}';
    }
}
