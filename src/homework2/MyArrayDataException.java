package homework2;

public class MyArrayDataException extends RuntimeException {
    private int x;
    private int y;
    private String wrongElement;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getWrongElement() {
        return wrongElement;
    }

    public MyArrayDataException(String message, int x, int y, String wrongElement) {
        super(message);
        this.x = x;
        this.y = y;
        this.wrongElement = wrongElement;

    }

    public MyArrayDataException(String message) {
        super(message);
    }
}
