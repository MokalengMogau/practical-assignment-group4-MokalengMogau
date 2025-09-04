/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public class TVSeries extends Series {
    private int ageRestriction;
    private int numberOfEpisodes;   

    

   
public TVSeries(int seriesId, String seriesName, int ageRestriction, int numberOfEpisodes) {
    super(seriesId, seriesName); 
    this.ageRestriction = ageRestriction;
    this.numberOfEpisodes = numberOfEpisodes;
    }

   
public int getAgeRestriction() {
    return ageRestriction;
    }

public void setAgeRestriction(int ageRestriction) {
    this.ageRestriction = ageRestriction;
    }

public int getNumberOfEpisodes() {
    return numberOfEpisodes;
    }

public void setNumberOfEpisodes(int numberOfEpisodes) {
    this.numberOfEpisodes = numberOfEpisodes;
    }

public void setSer(String seriesName) {
       
    }
}
    

