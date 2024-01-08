package generic;

public class Demo {
    public static void main(String[] args) {
        Book1 book1 = new Book1("N1","Sách văn");
        System.out.println(book1.getKey());
        System.out.println(book1.getValue());
        Book2<Float> book2 = new Book2<>("N2",4.5F);
        System.out.println(book2.getKey());
        System.out.println(book2.getValue());
        Book3 book3 = new Book3<>(1,6.7);
        System.out.println(book3.getKey());
        System.out.println(book3.getValue());

        Book3 book31 = new Book3();
        book31.setKey(1);
        book31.setValue(4.2);
        System.out.println(book31.getKey());
        System.out.println(book31.getValue());
    }
}
