package id.web.frizky.spring;

import id.web.frizky.spring.service.HelloWorld;
import id.web.frizky.spring.service.HelloWorldSingleton;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by F.Frizky on 4/11/2016.
 */
public class HelloMain {

    public static void main(String[] args) {
        ContextLookup singletonContext = ContextLookup.buildContext();
        HelloWorld resourceHelloWorld = singletonContext.getResourceHelloWorld();
        System.out.println("");
        System.out.println("FROM SINGLETON");
        resourceHelloWorld.helloWorld();

        ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("application-context.xml");
        HelloWorld helloWorldBean = springContext.getBean(HelloWorld.class);
        System.out.println("");
        System.out.println("FROM SPRING");
        helloWorldBean.helloWorld();
        System.out.println(helloWorldBean.getCounter());

        HelloWorldSingleton helloWorldSingleton = springContext.getBean(HelloWorldSingleton.class);
        System.out.println("");
        System.out.println("FROM SPRING");
        helloWorldSingleton.helloWorld();
        helloWorldSingleton = springContext.getBean(HelloWorldSingleton.class);
        helloWorldSingleton.helloWorld();
    }

}
