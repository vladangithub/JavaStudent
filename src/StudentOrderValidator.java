public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        StudentOrder so = readStudentOrder();

        AnswerCityRegister cityAnswer = checkCityRegister(so);
        checkWedding(so);
        checkChildren(so);
        checkStudent(so);

        sendMail(so);

    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {

        System.out.println("CityRegister is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }

    static void checkWedding(StudentOrder so) {
        System.out.println("Wedding запущен");
    }

    static void checkChildren(StudentOrder so) {
        System.out.println("Children Check is running");
    }

    static void checkStudent(StudentOrder so) {
        System.out.println("Студенты проверяются");
    }

    static void sendMail(StudentOrder so) {

    }

}
