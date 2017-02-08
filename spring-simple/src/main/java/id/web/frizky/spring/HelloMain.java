package id.web.frizky.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by F.Frizky on 4/11/2016.
 */
public class HelloMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-context.xml");

        ContextLookup runner = ContextLookup.buildContext();
        HelloWorld resourceHelloWorld = runner.getResourceHelloWorld();
        resourceHelloWorld.helloWorld();


    }

}
