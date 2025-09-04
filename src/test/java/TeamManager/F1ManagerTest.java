/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TeamManager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class F1ManagerTest {

    @Test
    void testDriverCreation() {
        F1Driver driver = new F1Driver("Charles Leclerc", 26, 16, 180);
        assertEquals("Charles Leclerc", driver.getName());
        assertEquals(26, driver.getAge());
        assertEquals(16, driver.getCarNumber());
        assertEquals(180, driver.getChampionshipPoints());
    }

    @Test
    void testAddChampionshipPoints() {
        F1Driver driver = new F1Driver("Carlos Sainz", 29, 55, 150);
        driver.addChampionshipPoints(18);
        assertEquals(168, driver.getChampionshipPoints());
    }
    
    @Test
    void testInheritance() {
        F1Driver driver = new F1Driver("George Russell", 26, 63, 100);
        assertTrue(driver instanceof TeamMember);
    }
}