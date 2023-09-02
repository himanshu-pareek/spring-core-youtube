package repositories;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.Method;

public class ReplacementCreateAuthorRepository implements ApplicationContextAware, MethodReplacer {
    private ApplicationContext context;

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("ReplacementCreateAuthorRepository::reimplement");
        return context.getBean(AuthorRepository.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
