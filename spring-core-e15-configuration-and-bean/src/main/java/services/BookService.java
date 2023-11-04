package services;

import repositories.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookRepository=" + bookRepository +
                '}';
    }
}
