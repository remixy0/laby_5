package Zad5;


public abstract class Character implements CharacterAttributes{
    int health;
    boolean isAlive;
    String type;
    int workingDefense;
    int Id;



    public void walkForward(){
        System.out.println("Id: "+ Id+ " is walking forward");
    }

    public void walkBackward(){
        System.out.println("Id: "+ Id+ " is walking backward");
    }

    public void walkLeft(){
        System.out.println("Id: "+ Id+ " is walking left");
    }

    public void walkRight(){
        System.out.println("Id: "+ Id+ " is walking right");
    }

    public void introduceYouself(){
        System.out.println("I am Id: " + this.Id);
    }

    abstract int getDefense();

    abstract void introduceYourSpecialAbility();

    abstract void gotAttaked(int damage);

    abstract void getType();

    abstract void getHealth();
}
