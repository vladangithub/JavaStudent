package edu.vladan.javastudent.validator;

import edu.vladan.javastudent.domain.AnswerChildren;
import edu.vladan.javastudent.domain.StudentOrder;

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children Check is running");
        return new AnswerChildren();
    }
}
