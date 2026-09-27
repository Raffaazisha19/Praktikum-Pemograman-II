package Module01.Problem04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String inputAbu = scanner.nextLine().trim().toUpperCase();

        System.out.print("Tangan Bagas: ");
        String inputBagas = scanner.nextLine().trim().toUpperCase();

        String[] handAbu = inputAbu.split(" ");
        String[] handBagas = inputBagas.split(" ");

        int scoreAbu = 0;
        int scoreBagas = 0;

        for (int i = 0; i < 3; i++) {
            String abu = handAbu[i];
            String bagas = handBagas[i];

            if (abu.equals(bagas)) {
                // Draw, no score
            } else if (
                (abu.equals("B") && bagas.equals("G")) ||
                (abu.equals("G") && bagas.equals("K")) ||
                (abu.equals("K") && bagas.equals("B"))
            ) {
                scoreAbu++;
            } else {
                scoreBagas++;
            }
        }

        if (scoreAbu > scoreBagas) {
            System.out.println("Abu");
        } else if (scoreBagas > scoreAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

    }
}