package services;

import repositories.AuthorRepository;

public class AuthorService {

    private AuthorRepository repository;


    // 1 & 2. Autowire by name and type
    public void setRepository(AuthorRepository repository) {
        this.repository = repository;
    }

    // 3. Autowire by constructor
//    public AuthorService(AuthorRepository repository) {
//        this.repository = repository;
//    }

    @Override
    public String toString() {
        return "AuthorService{" +
                "repository=" + repository +
                '}';
    }
}
