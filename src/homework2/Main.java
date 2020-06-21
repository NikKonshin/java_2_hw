package homework2;

public class Main {
    static final int LENGTH_STRING = 4;

    public static void main(String[] args) {


        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"8", "9", "10", "11"},
                {"12", "13", "14", "/"}

        };
        try {
            arrSize(arr);
        } catch (MyArrayDataException e) {
            System.out.println(e.getLocalizedMessage() + "[" + e.getX() + "]" + "[" + e.getY() + "]");
        } catch (MySizeArrayException e) {
            System.out.println(e.getMessage() + e.getLengthArray());
        }
    }

    static void arrSize(String[][] arr) {
        int sum = 0;
        int elementArr;


        for (int i = 0; i < arr.length; i++) {
            if (arr.length != LENGTH_STRING) {
                throw new MySizeArrayException("Количество строк не соответствует условиям задачи ", arr.length);
            }

            for (int j = 0; j < arr.length; j++) {
                if (arr[i].length != LENGTH_STRING) {
                    throw new MySizeArrayException("Количество элементов в строке: [" + i + "] не соответствует условиям задачи ", arr[i].length);
                }
                try {
                    elementArr = Integer.parseInt(arr[i][j]);
                    sum += elementArr;
                    System.out.print(elementArr + ", ");
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Массив содержит неверный элемент " + '"' + arr[i][j] + '"' + "; В поле", i, j, arr[i][j]);
                }
            }
        }
        System.out.println(sum);
    }


}
