package org.example;

public class WildeCards {

}
// Class using wildcard with extends
 class Producer<T> {
    private T item;

    public Producer(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

// Class using wildcard with super
class Consumer<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public void consume(Producer<?> producer) {
        this.item = (T) producer.getItem();
    }

    public T getItem() {
        return item;
    }
}

// Class using wildcard with both extends and super
 class WildcardDemo {
    public static void main(String[] args) {
        // Wildcard with extends
        Producer<? extends Number> producer = new Producer<>(10);
        Consumer<Integer> consumer = new Consumer<>();
        consumer.consume(producer);
        System.out.println("Consumed item: " + consumer.getItem());

        // Wildcard with super
        Producer<Integer> producer2 = new Producer<>(20);
        Consumer<? super Integer> consumer2 = new Consumer<>();
        consumer2.consume(producer2);
        System.out.println("Consumed item: " + consumer2.getItem());
    }
}
