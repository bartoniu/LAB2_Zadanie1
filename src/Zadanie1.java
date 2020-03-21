import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        String word1, word2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszy wyraz: ");
        word1 = scanner.nextLine();
        System.out.println("Podaj drugi wyraz: ");
        word2 = scanner.nextLine();

        System.out.println("Odleglosc Levensteina: " + LevQWERTY(word1, word2));
    }

    static double LevQWERTY(String s1, String s2) {
        double[][] matrix = new double[s1.length() + 1][s2.length() + 1];
        double cost;
        AssotiationTable ass = new AssotiationTable();

        for (int i = 0; i < s1.length(); i++) {
            matrix[i][0] = i;
        }

        for (int j = 1; j < s2.length(); j++) {
            matrix[0][j] = j;
        }

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    cost = 0;
                }

                else if (ass.keyboardletters.get(s1.charAt(i-1)).contains(s2.charAt(j - 1))) {
                    cost = 0.5;
                } else {
                    cost = 1;
                }

                matrix[i][j] = Math.min(matrix[i - 1][j] + 1,
                        Math.min(matrix[i][j - 1] + 1,
                                matrix[i - 1][j - 1] + cost));
            }
        }
        return matrix[s1.length()][s2.length()];
    }
}
