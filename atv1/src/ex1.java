public class ex1 {
    public static void main(String[] args) {
        int[][] tabuadaSoma = new int[10][10];
        int i, j;
        for (i = 1; i < 11; i++) {
            for (j = 1; j < 11; j++) {
                tabuadaSoma[i - 1][j - 1] = i + j;
                System.out.print(i + " + " + j + " = " + tabuadaSoma[i - 1][j - 1] + '\n');
            }
        }
    }
}
