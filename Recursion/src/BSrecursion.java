public class BSrecursion {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 9, 10, 11, 12, 13};
        int target = 12;
        System.out.println(search(arr, target, 0, arr.length - 1));

    }

    static int search(int[] arr, int target, int s, int e){
        if (s > e){
            return -1;
        }

        int m = s + (e - s)/2;

        if (arr[m] == target){
            return m;
        }

        if (target < arr[m]){
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);
    }
}
