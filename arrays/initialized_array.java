public class initialized_array {
    public void disp(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public int disp2(int arr[]) {

        
        return 5;
    }

    public static void main(String[] args) {
        initialized_array obj = new initialized_array();
        int arr[] = { 1, 2, 3, 4, 5 };
        obj.disp(arr);
        obj.disp2(arr);
    }
}