package edu.vladan.javastudent.validator;

import edu.vladan.javastudent.domain.AnswerWedding;
import edu.vladan.javastudent.domain.StudentOrder;

public class WeddingValidator {
    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding запущен");
        return new AnswerWedding();
    }
}
