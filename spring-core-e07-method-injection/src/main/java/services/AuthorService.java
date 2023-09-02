package services;

import repositories.AuthorRepository;

public class AuthorService {
    // 1. Lookup method injection
    // 2. Arbitrary method replacement
    public void printRepository() {
        // Get a new AuthorRepository and print it
        AuthorRepository repository = this.createAuthorRepository();
        System.out.println(repository);
    }

    public AuthorRepository createAuthorRepository() {
        return null;
    }
}
