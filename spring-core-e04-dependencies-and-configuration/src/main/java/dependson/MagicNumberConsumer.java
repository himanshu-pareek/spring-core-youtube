package dependson;

public class MagicNumberConsumer {
    MagicNumberConsumer() {
        if (MyContext.myMagicNumber == 0) {
            throw new RuntimeException("Magic number is zero :(");
        }
        System.out.println("Magic number is " + MyContext.myMagicNumber);
    }
}
