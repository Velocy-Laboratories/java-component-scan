package org.velocy;

import lombok.Getter;
import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;

@Getter
public class ComponentScan {
    private final String basePackage;
    private final Reflections reflections;

    private ComponentScan(String basePackage) {
        this.basePackage = basePackage;
        this.reflections = new Reflections(this.basePackage);
    }

    /**
     * Get all classes annotated with the given annotation
     *
     * @param annotation the annotation to search for
     * @return a set of classes annotated with the given annotation
     */
    public Set<Class<?>> getAnnotatedClasses(Class<? extends Annotation> annotation) {
        return this.getReflections().getTypesAnnotatedWith(annotation);
    }

    /**
     * Get all fields annotated with the given annotation
     *
     * @param annotation the annotation to search for
     * @return a set of fields annotated with the given annotation
     */
    public Set<Field> getAnnotatedFields(Class<? extends Annotation> annotation) {
        return this.getReflections().getFieldsAnnotatedWith(annotation);
    }

    /**
     * Get all methods annotated with the given annotation
     *
     * @param annotation the annotation to search for
     * @return a set of methods annotated with the given annotation
     */
    public Set<Method> getAnnotatedMethods(Class<? extends Annotation> annotation) {
        return this.getReflections().getMethodsAnnotatedWith(annotation);
    }

    /**
     * Create a new instance of ComponentScan with the base package
     *
     * @param basePackage the base package to scan for components
     * @return a new instance of ComponentScan
     */
    public static ComponentScan of(String basePackage) {
        return new ComponentScan(basePackage);
    }
}
