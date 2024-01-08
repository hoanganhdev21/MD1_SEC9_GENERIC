package collection;

import generic.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_ArrayList {
    public static void main(String[] args) {
        //Khởi tạo đối tượng từ ArrayList
        List<Student> listStudents = new ArrayList<>();
        Student student1 = new Student("SV001", "Nguyễn Văn A", 25);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 20);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 27);
        //COLLECTION METHOD
        //1. boolean add(Obejct o): Thêm phần tử vào cuối danh sách
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        //2. boolean addAll(<? extends E>): add dách khác vào danh sách hiện tại
        List<Student> list2 = new ArrayList<>();
        Student student4 = new Student("SV004", "Nguyễn Văn D", 22);
        Student student5 = new Student("SV005", "Nguyễn Văn E", 26);
        list2.add(student4);
        list2.add(student5);
        listStudents.addAll(list2);
        //3. void clear(): Xóa tất cả phần tử trong danh sách
        //listStudents.clear();
        //4. boolean contains(Object o): kiểm tra đối tượng o có trong danh sách không
        System.out.println("Kiểm tra sinh viên 2 có trong danh sách không: " + listStudents.contains(student2));
        //5. boolean containsAll(<? extends E> list): Kiêm tra danh sách con có trong danh sách ko
        System.out.println("Kiểm tra list2 có trong listStudent: " + listStudents.containsAll(list2));
        //6. boolean isEmpty(): Kiểm tra danh sách có phần tử chưa
        System.out.println("Kiểm tra listStudent có phần tử chưa: " + listStudents.isEmpty());
        //7. boolean remove(Object o): Xóa đối tượng o trong dah sách
        listStudents.remove(student3);
        //8. boolean removeAll(<? extends E> list): Xóa danh sách list trong danh sách
        listStudents.removeAll(list2);
        //9. int size(): Trả ra số phần tử của danh sách
        System.out.println("Số phần tử trong danh sách:" + listStudents.size());

        //ITERATOR METHOD
        //1. boolean hasNext(): Kiểm tra next sang phần tử tiếp theo
        //2. E next(): Chuyển sang phần tử tiếp theo
        //3. void remove(): xóa phần tử hiện tại
        //Dùng Iterator để duyệt và in ra các sinh viên trong listStudents
        //B1. Chuyển từ List --> Iterator
        Iterator<Student> itrStudent = listStudents.iterator();
        //B2. Sử dụng các phương thức của Interator để duyệt và in thông tin sinh viên
        System.out.println("Các phần tử trong mảng duyệt bằng iterator:");
        while (itrStudent.hasNext()){
            System.out.println(itrStudent.next());
        }
        //LIST INTERFACE METHOD
        //10. boolean add(int index, Object o): Chèn đối tượng o vào chỉ số index
        listStudents.add(1,student3);
        //11. E get(int index): Lấy phần tử có chỉ số index
        System.out.println("Phần tử chỉ số 2: "+listStudents.get(2));
        //12. int indexOf(Object o): lấy chỉ số đối tượng o trong danh sách
        System.out.println("Chỉ số sinh viên 1 trong danh sách:"+listStudents.indexOf(student1));
        //13. E remove(int index): xóa phần tử chỉ số index trong mảng --> trả ra phần tử vừa xóa
        System.out.println("Phần tử vừa xóa: "+listStudents.remove(2));
        //14. E set(int index, Object o): Đè phần tử o vào chỉ số index --> trả ra phần tử vừa bị đè
        System.out.println("Phần tử vừa đè: "+listStudents.set(1,student3));
        //15. List<E> subList(int fromIndex, int endIndex): Cắt danh sách từ chỉ số fromIndex đến <endIndex --> list
        listStudents.addAll(list2);
        List<Student> subList = listStudents.subList(1,3);
        System.out.println("Thông tin subList: ");
        subList.forEach(student -> System.out.println(student));
        //ARRAY LIST
        //16. void trimToSize()
        List<Student> listSt = new ArrayList<>(5);
        listSt.add(null);
        listSt.add(student1);
        listSt.add(student2);
        listSt.add(null);
        ArrayList<Student> arrStudent = new ArrayList<>(9);
        arrStudent.add(student1);
        arrStudent.trimToSize();//capacity: 1
        System.out.println("Các phần tử trong listSt: ");
        listSt.forEach(student -> System.out.println(student));
        System.out.println("CÁC SINH VIÊN TRONG DANH SÁCH:");
        listStudents.forEach(student -> System.out.println(student));




    }
}
