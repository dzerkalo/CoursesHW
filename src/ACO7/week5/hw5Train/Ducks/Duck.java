package ACO7.week5.hw5Train.Ducks;

/**
 * Created by acer on 19.08.2015.
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public Duck(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public  void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }

    public void swim(){

        System.out.println("Swim like a boss");
    }
}
