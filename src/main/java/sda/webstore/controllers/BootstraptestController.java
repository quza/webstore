package sda.webstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootstraptestController {

    @RequestMapping(value = "/bootstrap", method = RequestMethod.GET)
    public String home() {
        return "bootstraptest";
    }

    @ResponseBody
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String Greeting() {
        return "Message From SpringBoot Service - Hello World!";
    }
}