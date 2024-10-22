public class evenArray {

    public static int[] Even(int[] a) {
        int size = (a.length + 1) / 2;
        int[] arr = new int[size];
        int j = 0; // for index of arr
        for (int i = 0; i < a.length; i = i + 2) {
            arr[j] = a[i];
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] a = { 10, 20, 30, 40 };
        // 10,30
        // System.out.println(Even(a));
        int[] res = Even(a);
        System.out.print("New Array: " );
        for (int i = 0; i < res.length; i = i + 1) {
            System.out.print(res[i] + " ");
        }

    }
}
