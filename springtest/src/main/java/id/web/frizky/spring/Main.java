package id.web.frizky.spring;

import id.web.frizky.spring.service.impl.RunMeServiceImpl;

/**
 * Created by f.frizky on 2/9/2017.
 */
public class Main {
    public static void main(String[] args) {
        RunMeServiceImpl runMeService = new RunMeServiceImpl();
        runMeService.runMe();
    }
}
