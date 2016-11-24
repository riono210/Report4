package jp.ac.uryukyu.ie.e165729;

/**
 * Created by e165729 on 2016/11/24.
 */
public class ActionDecision extends LivingThing2 {

    private LivingThing2 opponent;

    public ActionDecision(String name, int maximumHP, int maximumMP, int attack){
        super(name, maximumHP, maximumMP, attack);
    }

    public void command(LivingThing2 opponent, int deci){

        if (deci == 0){
            attack(opponent);

        }else if(deci == 1){
            magic(opponent);
        }else {
            escape(opponent);
        }


    }


}
