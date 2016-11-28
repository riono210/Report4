package jp.ac.uryukyu.ie.e165729;

/**
 * Created by e165729 on 2016/11/23.
 */

public class LivingThing2 {
    private String name;
    private int hitPoint;
    private int magicPoint;
    private int attack;
    private boolean dead;

    public LivingThing2(String name, int maximumHP, int maximumMP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.magicPoint = maximumMP;
        this.attack = attack;

        dead = false;
        System.out.printf("%sのHPは%d，MPは%d。攻撃力は%dです。\n", name, maximumHP, magicPoint, attack);
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }

    public  int  getHitPoint(){
        return  hitPoint;
    }

    public  void  setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public int getAttack(){
        return  attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getMagicPoint(){return magicPoint;}

    public  void setMagicPoint(int magicPoint){this.magicPoint = magicPoint;}


    public void attack(LivingThing2 opponent) {
        if (dead == false && opponent.dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public  void magic(LivingThing2 opponent){
        if(dead ==  false && opponent.dead == false) {
            if (magicPoint > 0) {
                magicPoint--;
                int damage = (int) (Math.random() * ((attack + hitPoint) * 0.9));
                System.out.printf("%sは魔法を唱えた!%sに%dのダメージを与えた!\n", name, opponent.getName(), damage);
                opponent.wounded(damage);
            } else {
                System.out.printf("ミス! %sはMPが足りない!\n", name);
         }
        }
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint <= 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    public void escape(LivingThing2 oppoent) {
        if (oppoent.dead == false) {
            this.dead = true;
            System.out.printf("%sは逃げ出した!\n", name);
        }
    }


}