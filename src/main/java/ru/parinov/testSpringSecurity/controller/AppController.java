package ru.parinov.testSpringSecurity.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.parinov.testSpringSecurity.model.ApplicationEntity;
import ru.parinov.testSpringSecurity.service.AppService;

import java.util.List;

@RestController
@RequestMapping("api/v1/apps")
@AllArgsConstructor
public class AppController {
    private AppService service;

    @GetMapping("/welcome")
    public String welcomePage(){
        return "Welcome! This page is unprotected.";
    }

    @GetMapping("/all-apps")
    public List<ApplicationEntity> allApps(){
        return service.allApps();
    }

    @GetMapping("{id}")
    public ApplicationEntity ApplicationByID(@PathVariable long id){
        return service.ApplicationByID(id);
    }
}
