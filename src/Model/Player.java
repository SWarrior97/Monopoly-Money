/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.LinkedList;

/**
 *
 * @author Carlos Gomez
 */
public class Player {
    private String name;
    private float money;
    private int number;
    private LinkedList<Propriety> proprieties;

    public Player(String name, float money,int number) {
        this.name = name;
        this.money = money;
        this.number = number;
        proprieties= new LinkedList<>();
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

    public LinkedList<Propriety> getProprieties() {
        return proprieties;
    }

    public void setProprieties(LinkedList<Propriety> proprieties) {
        this.proprieties = proprieties;
    }
    
    public void addPropriety(Propriety propriety){
       proprieties.add(propriety);
    }   
    
    public void removePropriety(Propriety propriety){
       proprieties.remove(propriety);
    } 
    
    @Override
    public String toString() {
        return number +"-"+name;
    }
    
    
    
}
