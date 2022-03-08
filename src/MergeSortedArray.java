public class MergeSortedArray {

    /*
    input :  [2, 3, 5, 7, 9]
    input :  [1, 4, 6, 8]
    output:  [1, 2, 3, 4, 5, 6, 7, 8, 9]

    mergeSortedArray([2, 3, 7, 9], [1, 4, 6, 8, 9]);
    */
    public static void main(String[] args) {
        int [] arr1 = {2, 3, 5, 7, 9};
        int [] arr2 = {1, 4, 6, 8};

        int[] resultArr = mergeSortedArray(arr1, arr2);
        printResult(resultArr);
    }

    private static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int[] resultArr = new int[arr1.length + arr2.length];

        int indexOfArr1 = 0;
        int indexOfArr2 = 0;
        int indexOfResult = 0;
        while (indexOfArr1<arr1.length || indexOfArr2<arr2.length) {
            if (indexOfArr1 >= arr1.length) {
                resultArr[indexOfResult] = arr2[indexOfArr2++];
            } else if (indexOfArr2 >= arr2.length) {
                resultArr[indexOfResult] = arr1[indexOfArr1++];
            } else if (arr1[indexOfArr1] <= arr2[indexOfArr2]) {
                resultArr[indexOfResult] = arr1[indexOfArr1++];
            } else {
                resultArr[indexOfResult] = arr2[indexOfArr2++];
            }
            indexOfResult++;
        }

        return resultArr;
    }

    private static void printResult(int[] resultArr) {
        System.out.print("[");
        for (int i=0; i<resultArr.length; i++) {
            if (i != 0)
                System.out.print(", ");
            System.out.print(resultArr[i]);
        }
        System.out.print("]");
    }

}
