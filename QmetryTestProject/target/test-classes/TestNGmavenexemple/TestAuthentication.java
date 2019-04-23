package TestNGmavenexemple;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestAuthentication {

    @Test (groups = { "Sniff", "Regression" })
    public void validAuthenticationTest(){
    	
//    	System.setProperty("environment", "aymen");
    	System.out.println(" Sniff + Regression" + System.getProperty("environment"));
    	System.out.println(" testparam" + System.getProperty("testparam"));
    }

    @Test (groups = { "Regression" })
    public void failedAuthenticationTest(){
        System.out.println("Regression-");
    }

    @Test (groups = { "Sniff"})
    public void newUserAuthenticationTest(){
        System.out.println("Sniff-");
    }
}