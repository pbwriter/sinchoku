import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		String title = "かんたんじゃんけん";
		String rule = "コンピューターと3回勝負\n"
                + "グーは0,パーは1,チョキは2と入力してください。\n";
		//player1はCOM,player2は人とする。

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		BufferedReader br
        = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(title);
		System.out.println(rule);

    int numwin = 0;
    int numlose = 0;
    int numdraw = 0;

    for(int count = 0;count < 3;count++) {
     int player1 = rand.nextInt(3);
     int player2 = sc.nextInt();
		if (player1 == 0 && player2 == 1) {
            System.out.println("コンピューターのかち");
            numlose++;
        } else if (player1 == 1 && player2 == 2) {
            System.out.println("コンピューターのかち");
            numlose++;
        } else if (player1 == 2 && player2 == 0) {
            System.out.println("コンピューターのかち");
            numlose++;
        } else if (player1 == player2) {
            System.out.println("ひきわけ");
            numdraw++;
        } else {
            System.out.println("かちー");
            numwin++;
        }
    }
		System.out.println(numwin + "勝" + numlose + "敗" + numdraw + "引き分け");
    	if(numwin == 2) {
    	System.out.println("あなたの勝ち");
    	}
	}

}
