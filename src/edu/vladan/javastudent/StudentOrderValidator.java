package edu.vladan.javastudent;

import edu.vladan.javastudent.domain.*;
import edu.vladan.javastudent.mail.MailSender;
import edu.vladan.javastudent.validator.ChildrenValidator;
import edu.vladan.javastudent.validator.CityRegisterValidator;
import edu.vladan.javastudent.validator.StudentValidator;
import edu.vladan.javastudent.validator.WeddingValidator;

public class StudentOrderValidator {
    public static void main(String[] args) { checkAll(); }

    static void checkAll() {
        while (true) {
            StudentOrder so = readStudentOrder();
//            System.out.println("Start");
            if (so == null) {
                break;
            }
//            System.out.println("Finish");
            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.success) {
//
//                continue;
                break;
            }
            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);
        }
//        System.out.println("Finish 2");
    }
    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host1";
//        crv1.login = "Login1";
//        crv1.password = "Password1";
        AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        return ans1;
    }

    static AnswerWedding checkWedding(StudentOrder so) {
        WeddingValidator wd = new WeddingValidator();
        return wd.checkWedding(so);
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        ChildrenValidator cv = new ChildrenValidator();
        return cv.checkChildren(so);
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        return new StudentValidator().checkStudent(so);
    }

    static void sendMail(StudentOrder so) {
        new MailSender().sendMail(so);
    }
}
