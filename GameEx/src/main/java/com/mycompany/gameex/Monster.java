/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gameex;

/**
 *
 * @author Student's Account
 */
public class Monster extends Character {
    
    public Monster(String name, int health, int minATK, int maxATK, double armor, double speed) {
        super(name, health, minATK, maxATK, armor, speed);
        this.name = super.name;
    }
    //Sample Monster Spell/skill - for each spell create a new spell/skill method
    public void roar() {
        System.out.println(name + " lets out a terrifying roar!");
    }

}