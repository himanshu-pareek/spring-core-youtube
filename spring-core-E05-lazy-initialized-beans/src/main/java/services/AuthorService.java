package services;

import repositories.AuthorRepository;

public class AuthorService {

    private AuthorRepository repository;

    public AuthorService() {
        System.out.println("AuthorService::<Constructor>");
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
