
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class rpg1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            List<String> enemy = new ArrayList<String>();
            enemy.add("かわきん");
            enemy.add("マイケル");
            enemy.add("やまい");

            System.out.print("始めますか？：\n");
            System.out.println("始める→0 やめる→1");
            int start = sc.nextInt();
            if (start != 0) {
                return;
            }

            for (int i = 0; i < 10; i++) {
                int enemyindex = new Random().nextInt(enemy.size());
                String enemyname = enemy.get(enemyindex);
                System.out.println(enemyname + "が現れた");

                int myphst = 20;
                int enemyphst = new Random().nextInt(20);
                enemyphst += 1;
                int enemypow = 30 - enemyphst;
                enemypow += 1;

                while (myphst > 0 && enemyphst > 0) {
                    System.out.println(enemyname + " HP:" + enemyphst + " 攻撃力" + enemypow);
                    System.out.println("あなた HP:" + myphst);
                    System.out.println("攻撃→0 防御→1 避ける→2");
                    int act = sc.nextInt();

                    int mydam = new Random().nextInt(15);
                    int enemydam = new Random().nextInt(15);
                    double avoid = Math.random();

                    if (act == 0) {
                        enemyphst -= mydam;
                        System.out.println("あなたの攻撃");
                        System.out.println(enemyname + "に" + mydam + "ダメージ！\n");
                    } else if (act == 1) {
                        enemydam -= 5;
                    } else if (act == 2) {
                        if (avoid < 0.5) {
                            enemydam = 0;
                            System.out.println("成功した！敵の攻撃力が０になった！");
                        } else {
                            System.out.println("失敗した！");
                        }
                    }

                    if (enemyphst <= 0) {
                        enemydam = 0;
                    }

                    System.out.println(enemyname + "の攻撃");
                    myphst -= enemydam;
                    System.out.println("あなたに" + enemydam + "ダメージ\n");
                }
                if (myphst <= 0) {
                    System.out.println("目の前が真っ暗になった");
                } else if (enemyphst <= 0) {
                    System.out.println("おめでとう！" + enemyname + "を倒した！");
                }
                System.out.println("続けますか？");
                System.out.println("続ける→0 終わる→1");
                int conti = sc.nextInt();
                if (conti == 1) {
                    return;
                }
            }
        }
    }
}