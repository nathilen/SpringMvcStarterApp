package com.mehmaa.blog;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(HttpServletRequest request, Locale locale, Model model) {

        String local = locale.toString();

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        String contextPath = request.getContextPath();
        String userHttpMethodCall = request.getMethod();

        logger.debug("User Local is : " + local);
        logger.debug("Server time is: " + formattedDate);
        logger.debug("Context path is: " + contextPath);
        logger.debug("User HTTP Method Call: " + userHttpMethodCall);

        model.addAttribute("contextPath", contextPath);
        model.addAttribute("userLocal", local);
        model.addAttribute("serverTime", formattedDate);
        model.addAttribute("httpCall", userHttpMethodCall);

        return "home";
    }
}
