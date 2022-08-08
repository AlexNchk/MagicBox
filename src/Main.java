import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        BoxString text = new BoxString("");
        text.box(5);
        text.add(new BoxString("First"));
        text.add(new BoxString("Second"));
        text.add(new BoxString("Third"));
        text.add(new BoxString("Fourth"));
        text.add(new BoxString("Fifth"));
        text.Pick();
        BoxString boxString = (BoxString) text.getItems();
        String saveString = String.valueOf(boxString);
        System.out.println("Объект из коробки строк: " + saveString);
        BoxNumber numbers = new BoxNumber(0);
        numbers.box(5);
        numbers.add(new BoxNumber(1));
        numbers.add(new BoxNumber(2));
        numbers.add(new BoxNumber(3));
        numbers.add(new BoxNumber(4));
        numbers.add(new BoxNumber(5));
        numbers.Pick();
        BoxNumber boxNumber = (BoxNumber) numbers.getItems();
        String saveNumbers = String.valueOf(boxNumber);
        int saveNumber = parseInt(saveNumbers);
        System.out.println("Объект из коробки чисел: " + saveNumber);
    }

}
