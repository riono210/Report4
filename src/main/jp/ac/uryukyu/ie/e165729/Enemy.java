package jp.ac.uryukyu.ie.e165729;

/**
 * Created by e165729 on 2016/11/17.
 */
public class Enemy extends LivingThing {

    public  Enemy(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);

        //System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);

    }

}
