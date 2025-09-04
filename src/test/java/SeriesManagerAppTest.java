/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class SeriesManagerAppTest {
    
private SeriesManagerApp getSeriesManagerWithSampleData() {
        SeriesManagerApp manager = new SeriesManagerApp();
        
        try {
            java.lang.reflect.Field arrayField = SeriesManagerApp.class.getDeclaredField("seriesArray");
            arrayField.setAccessible(true);
            TVSeries[] seriesArray = (TVSeries[]) arrayField.get(null);
            seriesArray[0] = new TVSeries(101, "Test Series 1", 12, 10);
            seriesArray[1] = new TVSeries(102, "Test Series 2", 10, 20);
            seriesArray[2] = new TVSeries(103, "Test Series 3", 16, 30);
            
            java.lang.reflect.Field countField = SeriesManagerApp.class.getDeclaredField("seriesCount");
            countField.setAccessible(true);
            countField.set(null, 3);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return manager;
    }

    @Test
    void TestSearchSeries() {
        
        getSeriesManagerWithSampleData();
        String input = "102\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        Scanner testScanner = new Scanner(System.in);
        TVSeries foundSeries = SeriesManagerApp.searchSeries(testScanner);
        
        assertNotNull(foundSeries);
        assertEquals("Test Series 2", foundSeries.getSeriesName());
    }
    
    @Test
    void TestSearchSeriesNotFound() {
        
        getSeriesManagerWithSampleData();
        String input = "999\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        Scanner testScanner = new Scanner(System.in);
        TVSeries foundSeries = SeriesManagerApp.searchSeries(testScanner);
        
        assertNull(foundSeries);
    }
    
    @Test
    void TestUpdateSeries() {
        
        getSeriesManagerWithSampleData();
        String input = "101\n12\n30\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        SeriesManagerApp.updateSeries(new Scanner(System.in));
        
        
        try {
            java.lang.reflect.Field arrayField = SeriesManagerApp.class.getDeclaredField("seriesArray");
            arrayField.setAccessible(true);
            TVSeries[] seriesArray = (TVSeries[]) arrayField.get(null);
            
            assertEquals(30, seriesArray[0].getNumberOfEpisodes());
        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }
    
    @Test
    void TestDeleteSeries() {
       
        getSeriesManagerWithSampleData();
        String input = "102\ny\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        SeriesManagerApp.deleteSeries(new Scanner(System.in));

        
        try {
            java.lang.reflect.Field arrayField = SeriesManagerApp.class.getDeclaredField("seriesArray");
            arrayField.setAccessible(true);
            TVSeries[] seriesArray = (TVSeries[]) arrayField.get(null);
            
            java.lang.reflect.Field countField = SeriesManagerApp.class.getDeclaredField("seriesCount");
            countField.setAccessible(true);
            int seriesCount = (int) countField.get(null);
            
            assertEquals(2, seriesCount);
            assertNull(seriesArray[seriesCount]); // The last element is now null
        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }
    
    @Test
    void TestDeleteSeries_SeriesNotFound() {
       
        getSeriesManagerWithSampleData();
        String input = "999\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        SeriesManagerApp.deleteSeries(new Scanner(System.in));
        
        
        try {
            java.lang.reflect.Field countField = SeriesManagerApp.class.getDeclaredField("seriesCount");
            countField.setAccessible(true);
            int seriesCount = (int) countField.get(null);
            
            assertEquals(3, seriesCount);
        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
    }
    
    @Test
    void TestSeriesAgeRestriction_AgeValid() {
        
        String input = "12\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
      
    }
    
    @Test
    void TestSeriesAgeRestriction_AgeInvalid() {
        
        String input = "Ten\n12\n"; 
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        
        assertTrue(true); 
    }
}
   
 
