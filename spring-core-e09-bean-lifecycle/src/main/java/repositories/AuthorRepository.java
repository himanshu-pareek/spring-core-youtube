package repositories;

/*
    1 - Using InitializingBean / DisposableBean interfaces ( Tight coupling with Spring Framework )
    2 - Using init-method / destroy-method attributes ( Loose coupling with Spring Framework )
    3 - Using default-init-method and default-destroy-method attributes on beans tag
 */

// 1 - Using InitializingBean / DisposableBean interfaces ( Tight coupling with Spring Framework )
// import org.springframework.beans.factory.InitializingBean;
// import org.springframework.beans.factory.DisposableBean;

public class AuthorRepository /* (1) implements InitializingBean implements DisposableBean */ {
//    1 - Using InitializingBean / DisposableBean interfaces ( Tight coupling with Spring Framework )
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Establishing database connection...");
//    }
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Closing database connection...");
//    }


    // 2 - Using init-method / destroy-method attributes ( Loose coupling with Spring Framework )
    public void init() {
        System.out.println("Establishing database connection in init method...");
    }
    public void destroy() {
        System.out.println("Closing database connection in destroy method...");
    }

    // 3 - Using default-init-method and default-destroy-method attributes on beans tag
    public void myInit() {
        System.out.println("Establishing database connection in init method...");
    }
    public void myDestroy() {
        System.out.println("Closing database connection in destroy method...");
    }

}
