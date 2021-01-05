/*
* This class creates a bicycle which is a type of vehicle.
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-12-17
*/

public class Bike extends Vehicle {
  // Initializing fields
  private float cadence;
  private int tireNum;

  /**
   * Setting field values with a constructor. Also assigns the pikes colour to
   * a constant in this file.
   */
  public Bike(String bikeColour) {
    super(bikeColour);
    this.colour = bikeColour;
    this.tireNum = 2;
    this.cadence = 0;
  }

  /**
   * Method for finding cadence.
   * Using the number 8 as the modifier for cadence as theres no way to be 
   * accurate because we arent given tire pressure, which gear the bike is in
   * tire size, or tire type to accurately describe how many rotations per 
   * minute a bike rider would have at X speed.
   */
  public float getCadence() {
    cadence = (currentSpeed() * 8);
    return cadence;
  }
    
  /**
   * method to return tire number.
   */
  public int tireCheck() {
    return tireNum;
  }  
  
  /** 
   * method to ring bell.
   */
  public String callBell() {
    String bell = ("Ring!");
    return bell;
  }
  
}
