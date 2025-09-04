package TeamManager;


import TeamManager.TeamMember;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author lab_services_student
 */
public class F1Driver extends TeamMember {
    private int carNumber;
    private int championshipPoints;


public F1Driver(String name, int age, int carNumber, int championshipPoints) {
    super(name, age);
    this.carNumber = carNumber;
    this.championshipPoints = championshipPoints;
    }
 
public int getCarNumber() {
    return carNumber;
    }

public int getChampionshipPoints() {
    return championshipPoints;
    }

public void addChampionshipPoints(int points) {
    if (points > 0) {
        this.championshipPoints += points;
    }
    }
}

