/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.profile;

import com.eren.radiomode.web.controller.edit_profile.EditProfileGeneralController;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.junit.RadioModeJUnitTest;
import com.eren.radiomode.service.EditProfileService;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author work
 */
public class EditProfileGeneralControllerTest extends RadioModeJUnitTest {

    User user;

    public EditProfileGeneralControllerTest(String testName) {
        super(testName);
    }

    /**
     * Test of getEditProfileService method, of class EditProfileGeneralController.
     */
    public void DISABLED_testGetEditProfileService() {
        System.out.println("getEditProfileService");
        EditProfileGeneralController instance = new EditProfileGeneralController();
        EditProfileService expResult = null;
        //EditProfileService result = instance.getEditProfileService();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditProfileService method, of class EditProfileGeneralController.
     */
    public void DISABLED_testSetEditProfileService() {
        System.out.println("setEditProfileService");
        EditProfileService editProfileService = null;
        EditProfileGeneralController instance = new EditProfileGeneralController();
        //instance.setEditProfileService(editProfileService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadGeneralPage method, of class EditProfileGeneralController.
     */
    public void DISABLED_testLoadGeneralPage() {
        System.out.println("loadGeneralPage");
        Model model = (Model) new ModelMap();
        EditProfileGeneralController instance = (EditProfileGeneralController) applicationContext.getBean("editProfileGeneralController");
        String expResult = "";
        //String result = instance.loadGeneralPage(model);
        //user = (User) model.get("user");
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of editGeneralPage method, of class EditProfileGeneralController.
     */
    public void DISABLED_testEditGeneralPage() {
        System.out.println("editGeneralPage");
        ModelMap model = new ModelMap();
        String day = "5";
        String month = "8";
        String year = "1982";
        //User user = null;
        BindingResult bindingResult = null;
        SessionStatus status = null;
        EditProfileGeneralController instance = (EditProfileGeneralController) applicationContext.getBean("editProfileGeneralController");
        String expResult = "";
        //String result = instance.editGeneralPage(model, day, month, year, user, bindingResult, status);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testRestExample() {
        //String uri = "http://localhost:8084/account/{acountid}";
        //String uri = "http://localhost:8084/mvc-ajax-1.0.0-SNAPSHOT/account/{id}";
        String uri = "http://localhost:8084/mvc-ajax-1.0.0-SNAPSHOT/account/test?id=1";

        RestTemplate template = new RestTemplate();
        String result = template.getForObject(uri, String.class);
        System.out.println(result);
    }
}
