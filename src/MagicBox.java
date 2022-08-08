import java.util.Random;

public class MagicBox<T> {
    private T[] items;

    public T box(int maxItems) {
        this.items = (T[]) new Object[maxItems];
        return (T) items;
    }

    private int randomInt = 0;

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                this.items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T Pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                RuntimeException e = new RuntimeException("Коробка не полная! Нужно ещё " +
                        "заполнить: " + (items.length - i) + " позиции!");
                throw e;
            }
        }
        Random random = new Random();
        this.randomInt = random.nextInt(items.length);
        return items[this.randomInt];
    }

    public T getItems() {
        return items[this.randomInt];
    }
}