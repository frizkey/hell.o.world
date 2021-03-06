package id.web.frizky.spring;

import id.web.frizky.spring.service.HelloWorld;
import id.web.frizky.spring.service.impl.HelloWorldImpl;
import org.apache.log4j.Logger;

/**
 * Created by F.Frizky on 4/11/2016.
 */
public class ContextLookup {
    static final Logger LOG = Logger.getLogger(ContextLookup.class);

    private static ContextLookup instance;

    private HelloWorld helloWorld;

    private ContextLookup() {
        this.helloWorld = new HelloWorldImpl();
    }

    public static ContextLookup buildContext() {
        if (instance == null) {
            LOG.info("CREATING Context Lookup");
            instance = new ContextLookup();
        }
        return instance;
    }

    public HelloWorld getResourceHelloWorld() {
        return helloWorld;
    }
}
