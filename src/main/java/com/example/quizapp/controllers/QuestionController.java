package com.example.quizapp.controllers;

import com.example.quizapp.models.entities.Question;
import com.example.quizapp.services.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {


    final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> getALlQuestions() {
        return questionService.getAllQuestions();
    }

    @PostMapping("/")
    public ResponseEntity<String> createQuestion(@RequestBody Question question) {
        return questionService.createQuestion(question);
    }


    @GetMapping("/category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }

}
