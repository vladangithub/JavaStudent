public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.husFirstName = "Alex";
        so.husLastName = "Petrov";
        so.wifeFirstName = "Galina";
        so.wifeLastName = "Petrova";

        long ans = saveStudentOrder(so);
        System.out.println(ans);

        StudentOrder so1 = new StudentOrder();
        so1.husFirstName = "Bobb";
        so1.husLastName = "Negrov";
        so1.wifeFirstName = "Malina";
        so1.wifeLastName = "Negrova";
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder:" + studentOrder.husLastName);

        return answer;
    }
}
