package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public void home(){
         System.out.println("Home page requested!!");
    }


    @GetMapping("/seyeon")
    public void home2(){
        System.out.println("Welcome SeYeon");
        this.contact();
    }

    public void contact(){
        System.out.println("contact");
    }

}
