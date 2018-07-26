public class Sort {

    public static void main(String[] args) {

    }

    public int[] of(int[] input) {

        if (input.length == 3) {
            if (input[0] > input[1]) {
                int temp = input[0];
                input[0] = input[1];
                input[1] = temp;
            }
            if (input[1] > input[2]) {
                int temp = input[1];
                input[1] = input[2];
                input[2] = temp;
            }
//            if (input[0] > input[1]) {
//                int temp = input[0];
//                input[0] = input[1];
//                input[1] = temp;
//            }
//            if (input[1] > input[2]) {
//                int temp = input[1];
//                input[1] = input[2];
//                input[2] = temp;
//            }
            

        }

        if (input.length == 2) {
            if (input[0] > input[1]) {
                int temp = input[0];
                input[0] = input[1];
                input[1] = temp;
            }

        }

        return input;
    }

}