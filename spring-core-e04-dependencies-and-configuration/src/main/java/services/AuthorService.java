package services;

import repositories.AuthorRepository;

public class AuthorService {

    private AuthorRepository repository;

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
