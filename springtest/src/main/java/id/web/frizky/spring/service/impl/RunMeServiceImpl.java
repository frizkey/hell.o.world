package id.web.frizky.spring.service.impl;

import org.apache.log4j.Logger;


/**
 * Created by f.frizky on 2/9/2017.
 */
public class RunMeServiceImpl {
    private final RequiredServiceImpl requiredService;
    Logger logger = Logger.getLogger(RunMeServiceImpl.class);

    public RunMeServiceImpl() {
        requiredService = new RequiredServiceImpl();
    }

    public void runMe() {
        logger.info(requiredService.getString());
    }
}
