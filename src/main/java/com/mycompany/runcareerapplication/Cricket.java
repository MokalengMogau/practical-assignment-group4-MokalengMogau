/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runcareerapplication;

/**
 *
 * @author lab_services_student
 */
public abstract class Cricket implements ICricket {
    protected String batsmanName;
    protected String stadiumName;
    protected int totalRuns;

public Cricket(String batsmanName, String stadiumName, int totalRuns) {
    this.batsmanName = batsmanName;
    this.stadiumName = stadiumName;
    this.totalRuns = totalRuns;
    }

@Override
public String getBatsman() {
    return batsmanName;
    }
@Override
public String getStadium() {
    return stadiumName;
    }
@Override 
public String getRunScored() {
    return String.valueOf(totalRuns);
    }
}

    

