package com.github.martinlau.springBoot.specialCharacter.application.web;

import com.github.martinlau.springBoot.specialCharacter.service.\u00CBLibrarySpecialCharacterService;
import com.github.martinlau.springBoot.specialCharacter.application.service.\u00CBLocalSpecialCharacterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/specialCharacter")
public class SpecialCharacterController {

    @RequestMapping("/library")
    @ResponseBody
    public String greetLibrary() {
        return new \u00CBLibrarySpecialCharacterService().greet();
    }


    @RequestMapping("/local")
    @ResponseBody
    public String greetLocal() {
        return new \u00CBLocalSpecialCharacterService().greet();
    }
}
