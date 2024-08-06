package edu.vladan.javastudent;

import edu.vladan.javastudent.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.setHusFirstName("Alex");
        so.setHusLastName("Petrov");
        so.setWifeFirstName("Galina");
        so.setWifeLastName("Petrova");
        long ans = saveStudentOrder(so);
        System.out.println(ans);

    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder:" + studentOrder.getHusLastName());

        return answer;
    }
}
