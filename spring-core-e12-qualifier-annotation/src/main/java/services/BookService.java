package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import qualifiers.Algorithm;
import qualifiers.BookQualifier;
import qualifiers.Language;
import qualifiers.Level;
import repositories.BookRepository;

public class BookService {
    @Autowired
    @BookQualifier(language = "java", level = Level.BEGINNER)
    private BookRepository javaBeginnerRepository;

    @Autowired
    @BookQualifier(language = "python", level = Level.EXPERT)
    private BookRepository pythonExpertRepository;

    @Override
    public String toString() {
        return "BookService{" +
                "javaBeginnerRepository=" + javaBeginnerRepository +
                ", pythonExpertRepository=" + pythonExpertRepository +
                '}';
    }
}
