package br.com.minhacena.minhacena_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController {
    public ProfessorController(){

    }

    @GetMapping
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hello world", HttpStatus.ACCEPTED);
    }

}
