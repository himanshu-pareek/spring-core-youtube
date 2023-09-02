package services;

import repositories.AuthorRepository;

import java.beans.ConstructorProperties;

public class AuthorService {

    private AuthorRepository repository;

    public AuthorService() {}

    @ConstructorProperties({"repo"})
    public AuthorService(AuthorRepository authorRepository) {
        this.repository = authorRepository;
    }

    public void setRepository(AuthorRepository repository) {
        this.repository = repository;
    }

    @Override
    public String toString() {
        return "AuthorService{" +
                "repository=" + repository +
                '}';
    }
}
