package services;

import repositories.BookRepository;

public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookRepository=" + bookRepository +
                '}';
    }
}
