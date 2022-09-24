package Algorithm.src.그냥;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E"};
        int c = arr.length;

        for(int i=0; i<c; i++){
            if(arr[i].equals("C")){
                for(int j = i; j< c-1; j++) {
                    arr[j] = arr[j + 1];
                }
                    c--;
                    break;

            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
    }
}
