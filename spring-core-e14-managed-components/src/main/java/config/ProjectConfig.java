package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;

@Configuration
@ComponentScan(
        basePackages = {"repositories", "services", "repositories2"},
        nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
public class ProjectConfig {
}
