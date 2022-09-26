public class Main {
    public static void main(String[] args) {
        double[] arr = {6, 5, 5, 4, 4, 7, 4, 5, 5, 6};
        double total = 51;

        for(int i=0; i< arr.length; i++){
            total = total + arr[i];
        }

        double average= total / arr.length;

        System.out.format("The average grades in the IBDP are", average);

    }
}
