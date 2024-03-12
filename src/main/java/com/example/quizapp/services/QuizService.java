package com.example.quizapp.services;


import com.example.quizapp.models.entities.Question;
import com.example.quizapp.models.entities.Quiz;
import com.example.quizapp.repositories.QuestionRepository;
import com.example.quizapp.repositories.QuizRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    QuizRepository quizRepository;
    QuestionRepository questionRepository;

    public QuizService(QuizRepository quizRepository, QuestionRepository questionRepository){
        this.quizRepository = quizRepository;
        this.questionRepository = questionRepository;
    }

    public ResponseEntity<String>  createQuiz(String category, int numQ, String title){

        List<Question> questions = questionRepository.findRandomQuestionsByCategory(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizRepository.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    public ResponseEntity<Optional<Quiz>> getQuiz(long id) {
        try {
            return new ResponseEntity<>(quizRepository.findById(id), HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return  new ResponseEntity(Optional.of(new Quiz()), HttpStatus.BAD_REQUEST);
    }
}
