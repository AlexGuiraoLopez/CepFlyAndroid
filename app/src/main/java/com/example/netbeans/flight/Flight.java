package com.example.netbeans.flight;

import com.example.netbeans.workers.Copilot;
import com.example.netbeans.workers.Employee;
import com.example.netbeans.workers.Pilot;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * El vol podrà tenir entre 1 i 3 assistents, però per estar complet, 
 * com a mínim haurà de tenir un pilot, un copilot i un assistent. 
 * mentre no estigui complet, no es podran vendre bitllets
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Flight
{
    public static final int MAX_EMPLOYEE=3, MAX_PILOT=1, MAX_COPILOT=1;
    
    public static String origin, destiny, planeName;
    public static int duration, seatTotalAmount, purchasedSeats;
    public static float seatPrice;
    //public static Employee [][] employeeList = new Employee [3][]; //Lista de trabajadores (0-Piloto,1-Copiloto,2-Asistente)
    public static ArrayList<ArrayList<Employee>> employeeList = new ArrayList(Arrays.asList(Pilot.pilotList,Copilot.copilotList,Employee.assistantList));

    public Flight(String origin,
                  String Destiny,
                  String planeName,
                  int duration,
                  int seatTotalAmount,
                  float seatPrice)
    {
        this.origin=origin;
        this.destiny=destiny;
        this.planeName=planeName;
        this.duration=duration;
        this.seatTotalAmount=seatTotalAmount;
        this.seatPrice=seatPrice;

    }

    public static void showInfo()
    {
        System.out.println("- Datos del vuelo -");
        System.out.println("Origen: " + origin);
        System.out.println("Destino: " + destiny);
        System.out.println("Nombre avion: " + planeName);
        System.out.println("Duración: " + duration);
        System.out.println("Total asientos: " + seatTotalAmount);
        System.out.println("Asientos comprados: " + purchasedSeats);
        System.out.println("Precio asiento: " + seatPrice);
    }

    /*SET AND GET*/
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestiny(String destination) {
        this.destiny = destination;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public void setSeatTotalAmount(int seatTotalAmount) {
        this.seatTotalAmount = seatTotalAmount;
    }

    public void setPurchasedSeats(int purchasedSeats) {
        this.purchasedSeats = purchasedSeats;
    }

    public void setSeatPrice(float seatPrice) {
        this.seatPrice = seatPrice;
    }
}
