package edu.vladan.javastudent.validator;

import edu.vladan.javastudent.domain.AnswerStudent;
import edu.vladan.javastudent.domain.StudentOrder;

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Студенты проверяются");
        return new AnswerStudent();
    }
}
