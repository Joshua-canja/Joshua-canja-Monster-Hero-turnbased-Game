/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gameex;

/**
 *
 * @author Student's Account
 */
public class Hero extends Character {

    public Hero(String name, int health, int minATK, int maxATK, double armor, double speed) {
        super(name, health, minATK, maxATK, armor, speed);  // Passing double armor to Character class
    }

    //Hero sample skill/spell
    public void specialMove() {
        System.out.println(name + " uses a powerful strike!");
    }
    public void stun(){
    }
}
