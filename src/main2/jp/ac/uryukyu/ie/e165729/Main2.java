package jp.ac.uryukyu.ie.e165729;

import java.util.Scanner;
/**
 * Created by e165729 on 2016/11/23.
 */
public class Main2 {
    public static void main(String[] args){
        Hero2 hero2 = new Hero2("勇者", 10, 3, 5);
        Enemy2 enemy2 = new Enemy2("スライム", 6, 1, 3);

        System.out.printf("%s vs. %s\n", hero2.getName(), enemy2.getName());

        int turn = 0;
        while( hero2.isDead() == false && enemy2.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            System.out.println("勇者はどうする?\n0:こうげき　1:まほう　2:にげる\n");
            Scanner com = new Scanner(System.in);
            int fa = com.nextInt();

            int eCom = (int)(Math.random() *3);
            enemy2.command(hero2, eCom);

            hero2.command(enemy2, fa);
        }
        System.out.println("戦闘終了");
    }
}
