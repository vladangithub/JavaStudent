public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so;
        so = new StudentOrder();
        so.husFirstName = "Alex";
        so.husLastName = "Petrov";
        so.wifeFirstName = "Galina";
        so.wifeLastName = "Petrova";

        StudentOrder so1;
        so1 = new StudentOrder();
        so1.husFirstName = "Bobb";
        so1.husLastName = "Sidorov";
        so1.wifeFirstName = "Malina";
        so1.wifeLastName = "Sidorova";

        long ans = saveStudentOrder(so);
        System.out.println(ans);
        long ans1 = saveStudentOrder(so1);
        System.out.println(ans1);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder:" + studentOrder.husLastName);

        return answer;
    }
}
