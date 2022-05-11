public class Main {
    public static void main(String[] args) {
        int[] integersArray;
        integersArray = new int[4];
        integersArray[0] = 5;
        integersArray[1] = 36;
        integersArray[2] = 45;
        integersArray[3] = 12;

        int[] copyArray = new int[integersArray.length];
        for (int i = 0; i < integersArray.length; i++) {
            copyArray[i] = integersArray[i];
        }
    }
}