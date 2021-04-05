package com.example.netbeans.workers;

import com.example.netbeans.flight.Flight;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Pilot extends Employee
{
    String reference, telephone, birthDate;
    //public static Pilot pilotList[]=new Pilot[]{new Pilot("Harrison","Ford","45854112-V","HLK-011","+34569954521","05/10/1974")};
    public static ArrayList pilotList = new ArrayList();
    public static int pilotCounter;

    public Pilot(String name, String surname, String dni, String reference, String telephone, String birthDate) 
    {
        super(name, surname, dni);
        this.reference=reference;
        this.telephone=telephone;
        this.birthDate=birthDate;
    }


    @Override
    public String toString()
    {
        return "Pilot{" +
                "Reference='" + reference + '\'' +
                ", Telephone='" + telephone + '\'' +
                ", Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", Dni='" + dni + '\'' +
                '}';
    }

    @Override
    public void showInfo()
    {
        System.out.println("- Información del piloto -");
        System.out.println("Nombre: " + this.name);
        System.out.println("Apellido: " + this.surname);
        System.out.println("Dni: " + this.dni);
        System.out.println("Referencia: " + this.reference);
        System.out.println("Telefono" + this.telephone);
        System.out.println("Cumpleaños: " + this.birthDate);
    }

    public String getReference() {
        return reference;
    }
}
