package scopes;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;

public class SimpleThreadScope implements Scope {

    // Map<String(name of bean), Object(instance of bean)> beans
    private final ThreadLocal<Map<String, Object>> mapThreadLocal = ThreadLocal.withInitial(HashMap::new);

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        System.out.println("Bean name = " + name);
        Map<String, Object> beans = mapThreadLocal.get();
        Object obj = beans.get(name);
        if (obj == null) {
            obj = objectFactory.getObject();
            beans.put(name, obj);
        }
        return obj;
    }

    @Override
    public Object remove(String name) {
        System.out.println("Name = " + name);
        Map<String, Object> beans = mapThreadLocal.get();
        Object obj = beans.get(name);
        beans.remove(name);
        return obj;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
