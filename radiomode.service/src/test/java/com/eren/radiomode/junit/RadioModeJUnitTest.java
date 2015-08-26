package com.eren.radiomode.junit;

import com.eren.radiomode.service.util.Constants;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;


/*
 * RadioModeJUnitTest.java
 * JUnit based test
 *
 * Created on September 29, 2007, 1:43 PM
 */
/**
 *
 * @author root
 */
public class RadioModeJUnitTest extends AbstractDependencyInjectionSpringContextTests {

    public RadioModeJUnitTest(String testName) {
        super(testName);
    }

    protected void onSetUp() throws Exception {
        System.out.println("================Starting SmsGroups Tests======================");
        //InitialContext ctx = new InitialContext();
        //Class.forName("com.mysql.jdbc.Driver");
    }

    protected String[] getConfigLocations() {
        return Constants.CONFIG_FILES;
    }
}
