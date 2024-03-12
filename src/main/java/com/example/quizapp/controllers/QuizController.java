package com.example.quizapp.controllers;


import com.example.quizapp.models.entities.Quiz;
import com.example.quizapp.services.QuizService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    final QuizService quizService;
    public  QuizController(QuizService quizService){
        this.quizService = quizService;
    }


    @GetMapping("/getQuiz/{id}")
    public ResponseEntity<Optional<Quiz>> getQuiz(@PathVariable long id){
        return  quizService.getQuiz(id);

    }
    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String category,
                                             @RequestParam int numQ,
                                             @RequestParam String title) {
        return  quizService.createQuiz(category, numQ, title);
    }
}
