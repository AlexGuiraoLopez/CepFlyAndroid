package com.example.netbeans.flight;

import com.example.netbeans.input.Checker;
import com.example.netbeans.input.Input;
import com.example.netbeans.interfaces.FlightManager;
import com.example.netbeans.visualfront.ConsoleColors;
import com.example.netbeans.workers.Copilot;
import com.example.netbeans.workers.Employee;
import com.example.netbeans.workers.Pilot;

/**
 * El vol podrà tenir entre 1 i 3 assistents, però per estar complet, 
 * com a mínim haurà de tenir un pilot, un copilot i un assistent. 
 * mentre no estigui complet, no es podran vendre bitllets
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Flight implements FlightManager
{
    public static final int MAX_EMPLOYEE=3, MAX_PILOT=1, MAX_COPILOT=1;
    
    public static String origin, destiny, planeName;
    public static int duration, seatTotalAmount, purchasedSeats;
    public static float seatPrice;
    public static Employee [][] employeeList = new Employee [3][]; //Lista de trabajadores (0-Piloto,1-Copiloto,2-Asistente)

    public Flight()
    {
        createFlight(); //Crea el vuelo pidiendo la informacion al usuario.
        
        /*Define la longitud para cada fila dependiendo del número máximo de cada tipo de trabajador*/
        employeeList[0]= new Employee[MAX_PILOT];
        employeeList[1]= new Employee[MAX_COPILOT];
        employeeList[2]= new Employee[MAX_EMPLOYEE];
    }

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

        /*Define la longitud para cada fila dependiendo del número máximo de cada tipo de trabajador*/
        employeeList[0]= new Employee[MAX_PILOT];
        employeeList[1]= new Employee[MAX_COPILOT];
        employeeList[2]= new Employee[MAX_EMPLOYEE];
    }

    public void createFlight()
    {
        String origin, destiny, planeName;
        int duration, totalSeats;
        float seatPrice;
        
        System.out.println("- Datos del vuelo -");
        
        do{
            System.out.println("Introduce el origen: ");
            origin=Input.readString();
        }while(Checker.checkBlankField(origin, "El origen no puede estar en blanco."));
        setOrigin(origin);
        
        do{
            System.out.println("Introduce el destino: ");
            destiny=Input.readString();
        }while(Checker.checkBlankField(destiny, "El destino no puede estar en blanco."));
        setDestiny(destiny);
        
        do{
            System.out.println("Introduce la duración: ");
            duration=Input.readInt();
        }while(!Checker.checkHigherThan(duration, 1, "La duracion no puede ser inferior a 0"));
        setDuration(duration);
        
        do{
            System.out.println("Introduce el nombre del avion: ");
            planeName=Input.readString();
        }while(Checker.checkBlankField(planeName, "El nombre del avion no puede estar vacío"));
        setPlaneName(planeName);
        
        do{
            System.out.println("Introduce el numero de asientos totales: ");
            totalSeats=Input.readInt();
        }while(!Checker.checkHigherThan(totalSeats, 1, "El numero de asientos no puede ser menor a 1"));
        setSeatTotalAmount(totalSeats);
        
        do{
            System.out.println("Introduce el precio de los asientos: ");
            seatPrice=Input.readFloat();
        }while(!Checker.checkHigherThan(seatPrice, 0f, "El precio no puede ser tan bajo"));
        setSeatPrice(seatPrice);
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
    
    public static void showEmployeeList()
    {
        for (int i = 0; i < employeeList.length; i++)
        {
            for (int j = 0; j< employeeList[i].length; j++)
            {
                switch (i)
                {
                    /*Los pilotos/copilotos fueron añadidos a una lista de Empleados con lo cual perdieron acceso
                    * a sus métodos y atributos específicos. 
                    * Para mostrar su informacion voy a crear un objeto de piloto/copiloto provisional y haciendo un cast
                    * de su posición en la lista de empleados podré acceder a sus métodos y atributos que tienen como 
                    * piloto/copiloto.
                    */
                    case 0: //Muestra la info de los pilotos.
                                if (employeeList[i][j]!=null)
                                {
                                    Pilot pilot = (Pilot)(employeeList[i][j]);
                                    pilot.showInfo();
                                }/*else{
                                    System.out.println("Todavía no hay pilotos");
                                }*/
                        break;
                    case 1: //Muestra la info de los copilotos.
                                if (employeeList[i][j]!=null)
                                {
                                    Copilot copilot = (Copilot)(employeeList[i][j]);
                                    copilot.showInfo();
                                }/*else{
                                    System.out.println("Todavía no hay copilotos");
                                }*/
                        break;
                    case 2: //Muestra la info de los asistentes.
                                if (employeeList[i][j]!=null)
                                {
                                    employeeList[i][j].showInfo();
                                }/*else{
                                    System.out.println("Todavía no hay asistentes");
                                }*/
                        break;
                }
            }
        }
    }
    
    public static boolean isPrepared()
    {
        return employeeList[0][MAX_PILOT-1]!=null &&employeeList[1][MAX_COPILOT-1]!=null&&employeeList[2][0]!=null;
    }
    
    public static void buyTickets()
    {
        int seatsToBuy;
        char userAnswer;
        System.out.println("¿Cuántos asientos quiere comprar?");
        seatsToBuy=Input.readInt();
        if (purchasedSeats+seatsToBuy<=seatTotalAmount)
        {
            System.out.println("El total para " + seatsToBuy + " asientos es: " + seatsToBuy*seatPrice);
            System.out.println("¿Estás de acuerdo?");
            do{
                userAnswer=Input.readChar();
                if (Character.toLowerCase(userAnswer)=='s')
                {
                    purchasedSeats+=seatsToBuy;
                }
            }while(!Checker.checkChar(userAnswer, 's', 'n', "La respuesta no corresponde a ninguna opción. (S/N)"));
        }
        else
        {
            System.out.println(ConsoleColors.RED+"No quedan tantos asientos.");
        }
    }
    
    /**
     * Calcular si hi ha places disponibles a l’avió a partir de les places totals i 
     * del número de bitllets a comprar.
     * @return TRUE si quedan asientos libres.
     */
    @Override
    public boolean checkAvaiableSeats() 
    {
        return purchasedSeats < seatTotalAmount;
    }

    /**
     * Calcular el preu total dels bitllets comprats.
     * @return 
     */
    @Override
    public float purchasedSeatsPrice() 
    {
        return purchasedSeats * seatPrice;
    }

    /**
     * Calcular el preu total dels bitllets no comprats.
     * @return 
     */
    @Override
    public float freeSeatsPrice() 
    {
        return (seatTotalAmount-purchasedSeats)*seatPrice;
    }

    /**
     * Calcular el preu del número de bitllets rebut per paràmetre.
     * @param seatsAmount numero de asientos a comprobar su precio.
     * @return precio total de los asientos.
     */
    @Override
    public float seatsPrice(int seatsAmount) 
    {
        return seatsAmount * seatPrice;
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
