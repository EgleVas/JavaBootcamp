public class Main {
    public static void main(String[] args) {
        int[][] multiplicationTable = new int[10][10];
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable.length; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable.length; j++) {
                System.out.println((i + 1) + " * " + (j + 1) + " = " + multiplicationTable[i][j]);
            }
        }
    }
}