package services;

public class ServiceLocator {

    private final AuthorService authorService = new AuthorService();

    public AuthorService getAuthorService() {
        System.out.println(authorService);
        return authorService;
    }

}
