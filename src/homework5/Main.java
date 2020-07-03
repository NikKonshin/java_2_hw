package homework5;

public class Main {

    static final int size = 10000000;
    static final int h = size/2;

    public static void main(String[] args) {
      float arr[] = new float[size];
      processArr(arr);
      processArrMulti(arr);


    }

    static void processArr(float arr[]){

        for (int i = 0; i <size ; i++) {
            arr[i]=1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i <size ; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Время выполнения программы в одном потоке: " + (System.currentTimeMillis() - a) + " мс");
        System.out.println(arr[size-1]);

    }

    static void processArrMulti(float arr[]){

        for (int i = 0; i <size ; i++) {
            arr[i]=1;
        }
        float arr1[] = new float[h];
        float arr2[] = new float[h];

        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        for (int i = 0; i <h ; i++) {
            arr1[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        for (int i = 0; i <h ; i++) {
            arr2[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        System.out.println("Время выполнения программы в двух потоках: " + (System.currentTimeMillis() - a) + " мс");
        System.out.println(arr[size-1]);


    }
}
