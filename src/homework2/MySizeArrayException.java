package homework2;

public class MySizeArrayException extends RuntimeException {
    private int lengthArray;

    public int getLengthArray() {
        return lengthArray;
    }

    public MySizeArrayException(int lengthArray) {
        this.lengthArray = lengthArray;
    }

    public MySizeArrayException(String message, int lengthArray) {
        super(message);
        this.lengthArray = lengthArray;
    }
}
