package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String home(){
         System.out.println("Home page requested!!");
         return "welcom Spring Home~~";
    }


    @GetMapping("/about")
    @ResponseBody
    public String home2(){
        System.out.println("Welcome SeYeon");
        return "안녕하세요";
    }

    public void contact(){
        System.out.println("contact");
    }

}
