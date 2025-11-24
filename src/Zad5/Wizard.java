package Zad5;

public class Wizard extends Character implements CharacterAttributes {
    String specialAbility;
    int defenseType = 0;

    public Wizard(int Id) {
        this.type = "Wizard";
        this.specialAbility = "Magic spell";
        this.Id = Id;
        this.workingDefense = 1;
    }


    @Override
    public void mainAttack(Character character) {
        if(character.getDefense() == this.workingDefense) {
            character.gotAttaked(3);
        }
        else{
            character.gotAttaked(15);
        }
    }

    @Override
    public void sideAttack(Character character) {
        if(character instanceof Knight){
            character.gotAttaked(8);
        }
        if(character instanceof Wizard){
            character.gotAttaked(4);
        }
        else{
            character.gotAttaked(6);
        }

    }

    @Override
    public void specialAttack(Character character) {
        if(character instanceof Wizard) {
            System.out.println("Wizard is immune to your " + specialAbility);
        }else{
            character.gotAttaked(10);
        }

    }

    @Override
    public void defense1() {
        defenseType = 1;
    }

    @Override
    public void defense2() {
        defenseType = 2;
    }

    @Override
    public int getDefense() {
        return defenseType;
    }

    @Override
    public void gotAttaked(int damage) {
        System.out.println("Ouch Id: " + Id +" lost " + damage+ " health");
        this.health -= damage;
        if(this.health <= 0) {
            this.isAlive = false;
        }
    }

    @Override
    void introduceYourSpecialAbility() {
        System.out.println("My special ability is: " + specialAbility);
        System.out.println("I can use my Magic Spell and kill everyone");

    }

    @Override
    void getType() {
        System.out.println(this.type);
    }

    @Override
    void getHealth() {
        System.out.println(this.health);
    }


}
