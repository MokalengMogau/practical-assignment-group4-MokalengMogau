package TeamManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class F1Manager {
    private static F1Driver[] drivers = new F1Driver[5];
    private static int driverCount = 0;
    private static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
        
    drivers[0] = new F1Driver("Lewis Hamilton", 39, 44, 250);
    drivers[1] = new F1Driver("Max Verstappen", 27, 1, 400);
    driverCount = 2;

    int choice;

while (true) {
    displayMenu();
    System.out.print("Enter your choice: ");
try {choice = Integer.parseInt(scanner.nextLine());
    System.out.println("----------------------------------------");
    switch (choice) {
        
    case 1:
    addDriver();
    break;
    
    case 2:updatePoints();
     break;
     
    case 3:searchDriver();
    break;
    
    case 4:generateReport();
    break;
    
    case 5:
    System.out.println("Exiting F1 Team Manager. Vroom!");
    return;
    default:
    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
        }
    } catch (NumberFormatException e) {
    System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

private static void displayMenu() {
    System.out.println("\n--- F1 Team Management System ---");
    System.out.println("1. Add a new driver");
    System.out.println("2. Update driver championship points");
    System.out.println("3. Search for a driver");
    System.out.println("4. Generate drivers report");
    System.out.println("5. Exit");
    }

private static void addDriver() {
    if (driverCount >= drivers.length) {
    System.out.println("Driver roster is full. Cannot add more drivers.");
    return;
    }

    System.out.print("Enter driver name: ");
    String name = scanner.nextLine();
    System.out.print("Enter driver age: ");
    int age = Integer.parseInt(scanner.nextLine());
    System.out.print("Enter car number: ");
    int carNumber = Integer.parseInt(scanner.nextLine());

    drivers[driverCount] = new F1Driver(name, age, carNumber, 0); 
    driverCount++;
    System.out.println("Driver '" + name + "' added successfully!");
    }

private static void updatePoints() {
    System.out.print("Enter driver name to update points: ");
    String name = scanner.nextLine();
    F1Driver driverToUpdate = findDriver(name);

    if (driverToUpdate != null) {
    System.out.print("Enter points to add: ");
    int pointsToAdd = Integer.parseInt(scanner.nextLine());
    driverToUpdate.addChampionshipPoints(pointsToAdd);
    System.out.println("Points for " + driverToUpdate.getName() + " updated to " + driverToUpdate.getChampionshipPoints() + ".");
    } else {
    System.out.println("Driver '" + name + "' not found.");
        }
    }

private static void searchDriver() {
    System.out.print("Enter driver name to search for: ");
    String name = scanner.nextLine();
    F1Driver foundDriver = findDriver(name);

if (foundDriver != null) {
    System.out.println("\nDriver found!");
    System.out.println("Name: " + foundDriver.getName());
    System.out.println("Age: " + foundDriver.getAge());
    System.out.println("Car Number: " + foundDriver.getCarNumber());
    System.out.println("Championship Points: " + foundDriver.getChampionshipPoints());
    } else {
    System.out.println("Driver '" + name + "' not found.");
    }
}
    
private static F1Driver findDriver(String name) {
    for (int i = 0; i < driverCount; i++) {
    if (drivers[i].getName().equalsIgnoreCase(name)) {
    return drivers[i];
    }
    }
    return null;
}

private static void generateReport() {
    System.out.println("\n--- F1 Drivers Report ---");
    System.out.println("----------------------------------------");
    for (int i = 0; i < driverCount; i++) {
    System.out.println("Driver Name: " + drivers[i].getName());
    System.out.println("Car Number: " + drivers[i].getCarNumber());
    System.out.println("Championship Points: " + drivers[i].getChampionshipPoints());
    System.out.println("----------------------------------------");
    }
    System.out.println("Report completed. Total drivers managed: " + driverCount);
    }
}  

