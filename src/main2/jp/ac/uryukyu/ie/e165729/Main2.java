package jp.ac.uryukyu.ie.e165729;

/**
 * Created by e165729 on 2016/11/23.
 */
public class Main2 {
    public static void main(String[] args){
        Hero2 hero2 = new Hero2("勇者", 10, 5);
        Enemy2 enemy2 = new Enemy2("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", hero2.getName(), enemy2.getName());

        int turn = 0;
        while( hero2.isDead() == false && enemy2.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero2.attack(enemy2);
            enemy2.attack(hero2);
        }
        System.out.println("戦闘終了");
    }
}
