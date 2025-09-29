/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runcareerapplication;

/**
 *
 * @author lab_services_student
 */
public class CricketRunsScored extends Cricket {
    public CricketRunsScored(String batsmanName, String stadiumName, int totalRuns) {
        super(batsmanName, stadiumName, totalRuns);
    }

public void printReport() {
        System.out.println("BATSMAN RUNS SCORED REPORT");
        System.out.println("**********");
        System.out.println("CRICKET PAYER: " + getBatsman());
        System.out.println("STADIUM: " + getStadium());
        System.out.println("TOTAL RUNS SCORED: " + getRunScored());
    }
}


