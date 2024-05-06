package hw02;

import java.util.Random;
import java.util.Scanner;

public class RockScissPaper {

    private Scanner sc = new Scanner(System.in);
    private Random rd = new Random();
    private boolean isExit = false;

    private int gameCnt = 0;
    private int winCnt = 0;
    private int drawCnt = 0;
    private int loseCnt = 0;

    public void start() {

        while (!isExit) {
            int user = 0;
            int com = rd.nextInt(3);

            System.out.println("가위, 바위, 보: ");
            String userpick = sc.nextLine();

            switch (userpick) {
                case "가위":
                    user = 0;
                    break;
                case "바위":
                    user = 1;
                    break;
                case "보":
                    user = 2;
                    break;
                case "3":
                    System.out.println("게임을 종료합니다.");
                    break;
            }
            if (userpick.equals("3")) {
                System.out.println(gameCnt + "전 " + winCnt + "승 " + drawCnt + "무 " + loseCnt + "패");
                isExit = true;
            } else {
                printCom(com);
                judgeWDL(user, com);
            }
        }
        sc.close();
    }

    public void judgeWDL(int user, int com) {
        if (user == com) {
            System.out.println("비겼습니다.");
            drawCnt++;
        } else if ((user == 0 && com == 1) || (user == 1 && com == 2) || (user == 2 && com == 0)) {
            System.out.println("졌습니다.");
            loseCnt++;
        } else {
            System.out.println("이겼습니다.");
            winCnt++;
        }
        gameCnt++;
    }

    public void printCom(int com) {
        System.out.print("컴퓨터: ");
        switch (com) {
            case 0:
                System.out.println("가위");
                break;
            case 1:
                System.out.println("바위");
                break;
            case 2:
                System.out.println("보");
                break;
        }
    }

    public static void main(String[] args) {

        RockScissPaper rsp = new RockScissPaper();
        rsp.start();
    }
}
