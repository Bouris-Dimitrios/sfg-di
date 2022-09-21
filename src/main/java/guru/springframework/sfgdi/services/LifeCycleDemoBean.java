package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
        ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("# I'm in the LifecycleBean Constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("# The LifeCYcleBean has its Properties Set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("# The Lifecycle bean has been destroyed");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("#My bean name is " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("#Bean factory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("#Aplication Context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("# The Post Construct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("# The predestroy annotated method has been called");
    }

    public void beforeInit() {
        System.out.println("# The before Init function has been called");
    }

    public void afterInit() {
        System.out.println("# The after Init function has been called");
    }
}
