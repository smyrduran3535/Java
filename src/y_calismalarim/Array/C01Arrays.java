package y_calismalarim.Array;

import java.util.Arrays;

public class C01Arrays {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7};

//array in son hali:[7,4,5,6] olacak?
        arr=sagaKaydir(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] sagaKaydir(int[] arr) {//son elementi bos kovaya koyduk
        int bosKova = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = bosKova;
        return arr;
    }
}
