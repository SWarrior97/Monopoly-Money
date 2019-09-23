/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Carlos Gomez
 */
public class Player {
    private String name;
    private float money;
    private int number;

    public Player(String name, float money,int number) {
        this.name = name;
        this.money = money;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
       
    
    @Override
    public String toString() {
        return number +"-"+name;
    }
    
    
    
}
