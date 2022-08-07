import java.util.Random;

public class MagicBox<T> {
    final private int MAXITEMS = 5;
    private T itemSave;
    T[] items = (T[]) new Object[MAXITEMS];
    private int randomInt = 0;

    public boolean add(T item) {
        //Pick();
        for (int i = 0; i < MAXITEMS; i++) {
            if (items[i] == null) {
                this.items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T Pick() {
        for (int i = 0; i < MAXITEMS; i++) {
            if (items[i] == null) {
                RuntimeException e = new RuntimeException("Коробка не полная! Нужно ещё " +
                        "заполнить: " + (MAXITEMS - i) + " позиции!");
                throw e;
            }
        }
        Random random = new Random();
        this.randomInt = random.nextInt(MAXITEMS);
        this.itemSave = items[this.randomInt];
        return itemSave;
    }

    public T getItems() {
        return itemSave;
    }

}
