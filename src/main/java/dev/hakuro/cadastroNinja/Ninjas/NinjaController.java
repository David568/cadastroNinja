package dev.hakuro.cadastroNinja.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/saudacao")
    public String saudacao(){
        return "Hello World Spring";
    }
}
