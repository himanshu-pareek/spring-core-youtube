package repositories;

import org.springframework.stereotype.Repository;
import qualifiers.BookQualifier;
import qualifiers.Level;

@Repository
@BookQualifier(language = "java", level = Level.BEGINNER)
public class JavaBeginnerBookRepository implements BookRepository {

    @Override
    public String toString() {
        return "Java - Beginner";
    }
}
