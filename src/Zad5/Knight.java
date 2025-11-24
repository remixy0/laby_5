package Zad5;

import Zad4.Deployable;

public class Knight extends Character implements CharacterAttributes{
    String specialAbility;
    int defenseType = 0;

    public Knight(int Id) {
        this.Id = Id;
        this.type = "Knight";
        this.specialAbility = "Double sword";
        this.workingDefense = 2;
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
            character.gotAttaked(7);
        }
        if(character instanceof Wizard){
            character.gotAttaked(6);
        }
        else{
            character.gotAttaked(5);
        }
    }

    @Override
    public void specialAttack(Character character) {
        if(character instanceof Knight){
            System.out.println("Knight is immune to your " + specialAbility);
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
        System.out.println("I can use two swords at once");
    }

    @Override
    void getType() {
        System.out.println(this.type);
    }

}
