import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    arr[i] = arr[j];
                }
            }

        }
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[arr.length - 1] = -1;
        System.out.println(Arrays.toString(arr));

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 400 };
        ReplaceElementsWithGreatestElementOnRightSide rSide = new ReplaceElementsWithGreatestElementOnRightSide();
        rSide.replaceElements(arr);
    }
}
