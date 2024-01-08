package generic;

public class Book4<K,V,I> extends Dictionary<K,V>{
    private I info;

    public Book4() {
    }

    public Book4(K key, V value) {
        super(key, value);
    }

    public Book4(K key, V value, I info) {
        super(key, value);
        this.info = info;
    }
}
