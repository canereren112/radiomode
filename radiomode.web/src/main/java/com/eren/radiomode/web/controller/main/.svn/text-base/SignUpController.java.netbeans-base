/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.controller.main;

import com.eren.radiomode.service.parent.ServiceFactory;
import com.eren.radiomode.service.util.Constants;
import com.eren.radiomode.web.json.Parameter;
import com.eren.radiomode.web.view.JsonView;

import com.eren.radiomode.web.util.UtilImpl;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * SignUp Denetleyicisi
 * @author work
 */
@Controller
public class SignUpController {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    public SignUpController() {
    }

    /**
     * hedef formu yonlendirir
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/signup2.do")
    public String loadForm() {
        return "fragments/signup_panel";
    }

    /**
     * signup formunu calistitir
     * @param userName kullanici adi
     * @param email eposta
     * @param password sifre
     * @param password2 sifre2
     * @param reCaptchaChallenge girilen reCpatcha kodu
     * @param reCaptchaResponse reCpathca cevap kodu
     * @return ModelAndView nesnesi
     */
    @RequestMapping(method = RequestMethod.POST, value = "/signup2.do")
    public String signUp(@RequestParam("userName") String userName, @RequestParam("email") String email,
            @RequestParam("password") String password, @RequestParam("password2") String password2 //        @RequestParam("recaptcha_challenge_field") String reCaptchaChallenge,
            //        @RequestParam("recaptcha_response_field") String reCaptchaResponse
            ) {
        email = email.trim().toLowerCase();
        userName = userName.trim().toLowerCase();
        password = password.trim().toLowerCase();
        password2 = password2.trim().toLowerCase();
        //reCaptchaChallenge = reCaptchaChallenge.trim().toLowerCase();
        //reCaptchaResponse = reCaptchaResponse.trim().toLowerCase();

        System.out.print("username:" + userName + " password" + password);
        if (password.equals(password2)) {
            //TODO reCaptcha tekrar acilacak
            /*
            if (!UtilImpl.checkReCaptchaCode(reCaptchaChallenge, reCaptchaResponse)) {
            view = new ModelAndView("fragments/signup_panel");
            return view;
            }
             */
            String activationNumber = UtilImpl.generateActivationNumber(userName);
            serviceFactory.getSignUpService().signupUser(email, userName, password, activationNumber);
            serviceFactory.getSignUpService().sendActivationEmail(email, userName, password, activationNumber);
            return "signup2";
        } else {
            return "main/signup_panel";
        }
    }

    /**
     * kullanici adini kontrol eder
     * @param userName kullanici adi
     * @return ModelAndView nesnesi
     */
    @RequestMapping("/checkUserName.do")
    public ModelAndView checkUserName(@RequestParam("userName") String userName) {
        userName = userName.trim().toLowerCase();
        ModelAndView view = new ModelAndView(JsonView.instance);
        String userNameCheck = serviceFactory.getSignUpService().checkUserName(userName);
        System.out.print("userNameCheck:" + userNameCheck + " for " + userName);
        Parameter param = new Parameter();
        param.setName(userNameCheck);
        view.addObject(JsonView.JSON_ROOT, param);
        return view;
    }

    /**
     * eposta adresini kontrol eder
     * @param email eposta
     * @return ModelAndView nesnesi
     */
    @RequestMapping("/checkEmail.do")
    public ModelAndView checkEmail(@RequestParam("email") String email) {
        email = email.trim().toLowerCase();
        ModelAndView view = new ModelAndView(JsonView.instance);
        String emailCheck = serviceFactory.getSignUpService().checkEmail(email);
        System.out.print("userNameCheck:" + emailCheck + " for " + email);
        Parameter param = new Parameter();
        param.setName(emailCheck);
        view.addObject(JsonView.JSON_ROOT, param);
        return view;
    }

    //TODO Uyeligi aktive eden metod yazilacak
    /**
     * kullaniciyi aktive eder
     * @param userid aktivasyon no
     * @return ModelAndView nesnesi
     */
    @RequestMapping("/signup/activate.do")
    public ModelAndView activateUser(@RequestParam("userid") String userid, HttpSession session) {
        userid = userid.trim().toLowerCase();
        String userName = serviceFactory.getSignUpService().activateUser(userid);
        ModelAndView view = new ModelAndView(new RedirectView("main"));
        return view;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public ModelAndView loginUser(@RequestParam("username") String userName, @RequestParam("password") String password, HttpSession session) {
        if (serviceFactory.getSignUpService().loginUser(userName, password)) {
            session.setAttribute(Constants.SESSION_USERNAME, userName);
            ModelAndView view = new ModelAndView(new RedirectView("main"));
            return view;
        }
        ModelAndView view = new ModelAndView("main");
        return view;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/logout")
    public ModelAndView logoutUser(HttpSession session) {
        session.removeAttribute(Constants.SESSION_USERNAME);
        ModelAndView view = new ModelAndView(new RedirectView("main"));
        return view;
    }
}
