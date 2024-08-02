public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so;
        so = new StudentOrder();
        so.husFirstName = "Alex";
        so.husLastName = "Petrov";
        so.wifeFirstName = "Galina";
        so.wifeLastName = "Petrova";

        long ans = saveStudentOrder(so);
        System.out.println(ans);

    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder:" + studentOrder.husLastName);

        return answer;
    }
}
