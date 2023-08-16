package services;

public class AuthorService {

    private static AuthorService authorService = new AuthorService();

    private AuthorService () {

    }

    public static AuthorService createInstance() {
        return authorService;
    }

}
