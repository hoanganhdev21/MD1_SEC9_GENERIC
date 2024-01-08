package generic;

public class ListStudent<N, U> {
    private N no;
    private U student;

    public ListStudent(N no, U student) {
        this.no = no;
        this.student = student;
    }

    public N getNo() {
        return no;
    }

    public void setNo(N no) {
        this.no = no;
    }

    public U getStudent() {
        return student;
    }

    public void setStudent(U student) {
        this.student = student;
    }
}
