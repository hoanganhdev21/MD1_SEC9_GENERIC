package generic;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<?> list1;
        List<String> listString = new ArrayList<>();
        List<Integer> listInt = new ArrayList<>();
        List<Student> listStudent = new ArrayList<>();
        list1 = listString;
        list1 = listInt;
        list1 = listStudent;
        List<? extends Person> list2;
        List<Person> listPerson = new ArrayList<>();
        List<Teacher> listTeacher = new ArrayList<>();
        list2 = listPerson;
        list2 = listTeacher;
        //list2 = listStudent;--> lỗi do Student không kế thừa Person
        List<? super Teacher> list3;
        list3 = listPerson;
        list3 = listTeacher;
        List<SubTeacher> listSubTeacher = new ArrayList<>();
//        list3 = listSubTeacher;--> lỗi do subTeacher không phải là cha của Teacher
    }
}
