package sai.security.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/check")
    public String securityCheck(){
        return "Secuirty check is working perfectly";
    }
}
