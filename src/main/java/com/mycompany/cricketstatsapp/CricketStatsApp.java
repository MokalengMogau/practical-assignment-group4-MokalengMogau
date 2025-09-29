/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cricketstatsapp;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class CricketStatsApp {
    public static void main(String[] args) {
      CricketStats stats = new CricketStats();
        stats.collectRunsData();
        stats.displayRunsReport();
        stats.displayHighestRunsPerStadium();
        stats.displayStadiumWithMostRuns();
    }
}

class CricketStats {
    Scanner scanner = new Scanner(System.in);

    String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};
    String[] stadiums = {"Kingsmead", "ST Georges", "Wanderers"};

    // 2D array: batsman and stadium
    int[][] runs = new int[batsmen.length][stadiums.length];

 public void collectRunsData() {
    System.out.println("Enter the number of runs scored by each batsman at each stadium:");
       for (int i = 0; i < batsmen.length; i++) {
          for (int j = 0; j < stadiums.length; j++) {
            System.out.print("Enter the number of runs scored by " + batsmen[i] + " at " + stadiums[j] + ": ");
              runs[i][j] = scanner.nextInt(); 
             }
         }
     }

public void displayRunsReport() {
    System.out.println("\nCareer Runs Report:");
        for (int i = 0; i < batsmen.length; i++) {
            for (int j = 0; j < stadiums.length; j++) {
                System.out.println(batsmen[i] + " runs scored at " + stadiums[j] + ": " + runs[i][j] + " runs");
            }
        }
    }

public void displayHighestRunsPerStadium() {
    System.out.println("\nHighest Runs Per Stadium:");
     for (int j = 0; j < stadiums.length; j++) {
        int maxRuns = 0;
        String topBatsman = "";
            for (int i = 0; i < batsmen.length; i++) {
                if (runs[i][j] > maxRuns) {
                    maxRuns = runs[i][j];
                    topBatsman = batsmen[i];
                }
            }
            System.out.println(stadiums[j] + ": " + topBatsman + " with " + maxRuns + " runs");
        }
    }

public void displayStadiumWithMostRuns() {
    int[] stadiumTotals = new int[stadiums.length];
      for (int j = 0; j < stadiums.length; j++) {
          for (int i = 0; i < batsmen.length; i++) {
               stadiumTotals[j] += runs[i][j];
               }
         }

    int maxTotal = 0;
    String topStadium = "";
       System.out.println("\nTotal Runs by Stadium:");
          for (int j = 0; j < stadiums.length; j++) {
               System.out.println(stadiums[j] + ": " + stadiumTotals[j] + " runs");
            if (stadiumTotals[j] > maxTotal) {
                maxTotal = stadiumTotals[j];
                topStadium = stadiums[j];
            }
        }

        System.out.println("\nStadium with Most Runs Scored: " + topStadium);
    }
}
