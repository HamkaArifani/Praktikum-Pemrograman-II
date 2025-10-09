import java.util.Scanner;

public class PRAK104_2410817110006_HamkaArifani {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String[] moveFromAbu = scan.nextLine().split(" ");

        System.out.print("Tangan Bagas: ");
        String[] moveFromBagas = scan.nextLine().split(" ");

        int scoreAbu = 0;
        int scoreBagas = 0;

        for (int i = 0; i<3; i++){
            if (moveFromAbu[i].equals(moveFromBagas[i])){
                scoreAbu++;
                scoreBagas++;
            } else if (
                    (moveFromAbu[i].equals("B")&&moveFromBagas[i].equals("G")) ||
                    (moveFromAbu[i].equals("K")&&moveFromBagas[i].equals("B")) ||
                    (moveFromAbu[i].equals("G")&&moveFromBagas[i].equals("K"))
            ) {scoreAbu++;}
            else {scoreBagas++;}
        }
        if (scoreAbu == scoreBagas){
            System.out.println("Seri");
        } else if (scoreAbu > scoreBagas){
            System.out.println("Abu");
        } else {System.out.println("Bagas");}
        scan.close();
    }
}
