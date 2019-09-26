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
public class Propriety {
    private String name;
    private float rental;
    private float oneHouseRental;
    private float twoHouseRental;
    private float threeHouseRental;
    private float fourHouseRental;
    private float hotelRental;
    private float buildHouse;
    private float buildHotel;
    private int numberOfHouse;
    private float mortgage;
    private boolean isMortgage;
    private String color;
    private Player owner;
    private boolean isOwned;

    public Propriety(String name, float rental, float oneHouseRental, float twoHouseRental, float threeHouseRental, float fourHouseRental, float hotelRental, float buildHouse, float buildHotel, float mortgage,String color) {
        this.name = name;
        this.rental = rental;
        this.oneHouseRental = oneHouseRental;
        this.twoHouseRental = twoHouseRental;
        this.threeHouseRental = threeHouseRental;
        this.fourHouseRental = fourHouseRental;
        this.hotelRental = hotelRental;
        this.buildHouse = buildHouse;
        this.buildHotel = buildHotel;
        this.mortgage = mortgage;
        this.color=color;
        this.isMortgage = false;
        this.numberOfHouse = 0;
        this.owner = null;
        this.isOwned = false;
    }

    public Propriety(String name, int rent, int rent2, int rent3, int rent4, int mortgage, String color) {
        this.name = name;
        this.rental = rent;
        this.oneHouseRental = rent2;
        this.twoHouseRental = rent3;
        this.threeHouseRental = rent4;
        this.mortgage = mortgage;
        this.color=color;
        this.isMortgage = false;
        this.numberOfHouse = 0;
        this.hotelRental = 0;
        this.buildHouse = 0;
        this.buildHotel = 0;
        this.fourHouseRental = 0;
        this.owner = null;
        this.isOwned = false;
    }
    
    public Propriety(String name,int mortgage,String color) {
        this.name = name;
        this.mortgage = mortgage;
        this.color = color;
        this.rental = 4;
        this.oneHouseRental = 10;
        this.twoHouseRental = 0;
        this.owner = null;
        this.isOwned = false;
        this.isMortgage = false;
        this.threeHouseRental = 0;
        this.fourHouseRental = 0;
        this.numberOfHouse = 0;
        this.hotelRental = 0;
        this.buildHouse = 0;
        this.buildHotel = 0;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRental() {
        return rental;
    }

    public void setRental(float rental) {
        this.rental = rental;
    }

    public float getOneHouseRental() {
        return oneHouseRental;
    }

    public void setOneHouseRental(float oneHouseRental) {
        this.oneHouseRental = oneHouseRental;
    }

    public float getTwoHouseRental() {
        return twoHouseRental;
    }

    public void setTwoHouseRental(float twoHouseRental) {
        this.twoHouseRental = twoHouseRental;
    }

    public float getThreeHouseRental() {
        return threeHouseRental;
    }

    public void setThreeHouseRental(float threeHouseRental) {
        this.threeHouseRental = threeHouseRental;
    }

    public float getFourHouseRental() {
        return fourHouseRental;
    }

    public void setFourHouseRental(float fourHouseRental) {
        this.fourHouseRental = fourHouseRental;
    }

    public float getHotelRental() {
        return hotelRental;
    }

    public void setHotelRental(float hotelRental) {
        this.hotelRental = hotelRental;
    }

    public float getBuildHouse() {
        return buildHouse;
    }

    public void setBuildHouse(float buildHouse) {
        this.buildHouse = buildHouse;
    }

    public float getBuildHotel() {
        return buildHotel;
    }

    public void setBuildHotel(float buildHotel) {
        this.buildHotel = buildHotel;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public float getMortgage() {
        return mortgage;
    }

    public void setMortgage(float mortgage) {
        this.mortgage = mortgage;
    }

    public boolean isIsMortgage() {
        return isMortgage;
    }

    public void setIsMortgage(boolean isMortgage) {
        this.isMortgage = isMortgage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public boolean isIsOwned() {
        return isOwned;
    }

    public void setIsOwned(boolean isOwned) {
        this.isOwned = isOwned;
    }
    
    
    
    
}
