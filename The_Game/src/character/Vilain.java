/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import character.Character;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Vilain extends Character{
    public Vilain(String name, int healthPoints) {
        super(name, healthPoints);
        Random randomCoins = new Random();
        this.coins = randomCoins.nextInt(200);
    }
    
}