package edu.vladan.javastudent.validator;

import edu.vladan.javastudent.domain.AnswerCityRegister;
import edu.vladan.javastudent.domain.StudentOrder;

public class CityRegisterValidator {

    public String hostName;
    protected int port;
    private String login;
    String password;

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is running" + " " + hostName + " , " + login + " , " + password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
