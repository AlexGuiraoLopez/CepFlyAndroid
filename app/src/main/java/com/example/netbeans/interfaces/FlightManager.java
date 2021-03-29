package com.example.netbeans.interfaces;
/**
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public interface FlightManager 
{
    public boolean checkAvaiableSeats();
    public float purchasedSeatsPrice();
    public float freeSeatsPrice();
    public float seatsPrice(int seatsAmount);
}
