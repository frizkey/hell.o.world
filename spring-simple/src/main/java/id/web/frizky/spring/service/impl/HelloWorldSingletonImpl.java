package id.web.frizky.spring.service.impl;

import id.web.frizky.spring.service.HelloWorld;
import id.web.frizky.spring.service.HelloWorldSingleton;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by f.frizky on 2/8/2017.
 */
@Component
@Scope("singleton")
public class HelloWorldSingletonImpl implements HelloWorldSingleton {
    Logger LOGGER = Logger.getLogger(HelloWorldSingletonImpl.class);

    @Autowired
    private HelloWorld helloWorld;

    private int counter;

    @Override
    public void helloWorld() {
        counter++;
        helloWorld.helloWorld();
    }

    @Override
    public int getCounter() {
        return counter;
    }
}
