package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import qualifiers.BookQualifier;
import qualifiers.Level;
import repositories.BookRepository;

@Service
@Scope("thread")
public class BookService {

    @Autowired
    @BookQualifier(language = "java", level = Level.BEGINNER)
    private BookRepository bookRepository;

//    @Override
//    public String toString() {
//        return "BookService{" +
//                "bookRepository = " + bookRepository +
//                '}';
//    }
}
