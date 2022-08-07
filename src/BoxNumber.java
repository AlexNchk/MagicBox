public class BoxNumber extends MagicBox {
    private int numbers;

    public BoxNumber(int numbers) {
        this.numbers = numbers;
    }

    public int getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return String.valueOf(numbers);
    }
}
