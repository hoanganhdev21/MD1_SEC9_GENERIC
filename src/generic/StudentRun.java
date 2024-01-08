package generic;

public class StudentRun {
    public static void main(String[] args) {
        Student student = new Student("SV001","Nguyen Van A",20);
        ListStudent<Integer,Student> listStudent = new ListStudent<>(1,student);
        ListStudent<Integer,String> listStudent2 = new ListStudent<>(1,"Nguyen Van A");
        ListStudent<String,String> listStudent3 = new ListStudent<>("N01","Nguyen Van A");

    }
}
