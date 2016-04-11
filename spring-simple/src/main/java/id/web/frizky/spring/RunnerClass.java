package id.web.frizky.spring;

/**
 * Created by F.Frizky on 4/11/2016.
 */
public class RunnerClass {

    private HelloWorld helloWorld;

    public RunnerClass() {
        this.helloWorld = new HelloWorld();
    }

    public void run() {
        helloWorld.helloWorld();
    }
}
