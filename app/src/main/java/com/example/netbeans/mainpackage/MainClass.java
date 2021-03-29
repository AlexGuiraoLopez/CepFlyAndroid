package com.example.netbeans.mainpackage;
import com.example.netbeans.flight.Flight;
import com.example.netbeans.input.Input;
import com.example.netbeans.visualfront.ConsoleColors;
import com.example.netbeans.visualfront.Paint;
import com.example.netbeans.workers.Copilot;
import com.example.netbeans.workers.Employee;
import com.example.netbeans.workers.Pilot;
/**
 * Aplicació per poder comprar els bitllets d’un vol.
 * En aquesta aplicació gestionarem només la informació d’un vol.
 * Dos tipus d’usuaris (Admin, Client)
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class MainClass 
{
    /*Credenciales de administrador*/
    static final String USRNM="roger";
    static final String PASSWD="secret";
    /*Texto para los menús*/
    static final String [] MAIN_MENU= new String []{"- MENU PRINCIPAL -",
                                                                                    "1-Entrar admin", 
                                                                                        "2-Entrar client",
                                                                                            "0-Salir"};
    static final String [] ADMIN_MENU = new String[]{"- MODO: ADMINISTRADOR -",
                                                                                        "1-Visualizar vuelo", 
                                                                                            "2-Alta trabajador", 
                                                                                                "3-Visualizar trabajadores", 
                                                                                                    "0-Salir al menú principal"};
    static final String [] USER_MENU = new String[]{"- Bienvenido a CepFlights.SL -",
                                                                                        "1-Visualizar vuelo", 
                                                                                            "2-Comprar billetes", 
                                                                                                "0-Salir al menú principal"};
      static final String [] WORKER_SET_MENU = new String[]{"- Alta trabajador-",
                                                                                        "1-Piloto", 
                                                                                            "2-Copiloto",
                                                                                                "3-Asistente",
                                                                                                    "0-Salir"};
      
    public static boolean repeat=true; //Comprobante de repetición para bucles.
    
    public static void main(String[] args) 
    {
        /*==========DECLARACIÓN VARIABLES=========*/
        int userAnswer; //Opciones de los menús que selecciona el usuario.
        
        /*============FUNCIONAMIENTO==============*/
        /*Demana a l’usuari les dades del vol*/
        Paint.drawBanner("Bienvenido a CEP Flights");    
        new Flight(); //createFlight()
        
        /*Pregunta si vol accedir com a administrador o client o bé sortir*/
        do{
            showMenu(MAIN_MENU);     //Muestra menú de inicio (1-Entrar admin, 2-Entrar client, 0-Salir)
            userAnswer=Input.readInt();      //Recibe la respuesta del usuario
        
            switch (userAnswer)
            {
                case 1: executeAdminRol(); //Acceso como administrador (datos incorrectos => menú principal)
                    break;
                case 2: executeClientRol(); //Acceso como cliente.
                    break;
                case 0: System.out.println("Hasta la proxima");
                              repeat=false; //Salir.
                    break;
                default: System.out.print(ConsoleColors.RED+"La opción no corresponde");
                             System.out.println(ConsoleColors.BLACK);
                    break;
            }
        }while(userAnswer!=1 && userAnswer!=2 && userAnswer!=0||repeat);
    }
    
    /*OBSERBACIONES*/
    // > Hacer menú genérico. Parametros (String[] opciones) => OK
    // > Hacer clase menú? O utilizar el propio Main? => Usar el main
    // > Cada plaza tiene el mismo precio? => Sí
    // > Qué es la referencia del Piloto? Cada uno tiene distinto => Código alfanumerico
    // > Colores? => OK
    
    /*ERRORES*/
    // > 
    
    /**
     * Muestra un menú con un header y sus opciones.
     * @param optionText Textos del menú. El primer índice del vector corresponde al header.
     */
    public static void showMenu(String [] optionText)
    {
        System.out.println(optionText[0]); //Cabecera del menú
        
        for (int i = 1; i < optionText.length; i++) 
        {
            System.out.println("  "+optionText[i]);  //Opciones del menú
        }
        System.out.print("Introduce una opcion: ");
    }
    
    /**
     * Comprueba si los datos de login son correctos
     * @return TRUE si son correctos.
     */
    public static boolean checkAdminLogin()
    {
        String username, password;
        boolean loginSuccesful=false;
        
        System.out.print("Introduce el nombre de usuario: ");
        username=Input.readString();
        System.out.print("Introduce la contraseña: ");
        password=Input.readString();
        
        if (username.equals(USRNM)&&password.equals(PASSWD))
        {
            loginSuccesful=true;
        }
        else
        {
            System.out.println(ConsoleColors.RED+"Los datos no son correctos.");
        }
        return loginSuccesful;
    }
    
    public static void asignWorker()
    {
        int userAnswer;
        do{
            showMenu(WORKER_SET_MENU);
            userAnswer=Input.readInt();
            switch(userAnswer)
            {
                case 1: Pilot.asignPilot(); //Crea Piloto
                    break;
                case 2: Copilot.asignCopilot(); //Crea Copiloto
                    break;
                case 3: Employee.asignEmployee(); //Crea Asistente
                    break;
            }
        }while(userAnswer!=1&&userAnswer!=2&&userAnswer!=3);                          
    }
    
    public static void executeAdminRol()
    {
        if(checkAdminLogin())
        {
            int userAnswer;
            do{
            showMenu(ADMIN_MENU); //showAdminMenu() => (1-Visualizar vuelo, 2-Alta trabajador, 3-Visualizar trabajadores, 0-Salir)
            userAnswer=Input.readInt();
                switch(userAnswer)
                {
                    case 1: Flight.showInfo(); //Visualizar info del vuelo
                        break;
                    case 2: asignWorker(); //Alta trabajador
                        break;
                    case 3: Flight.showEmployeeList(); //Visualizar info trabajadores.
                        break;
                    case 0: repeat=false; //Salir al menú principal.
                        break;
                }
            }while(userAnswer!=1&&userAnswer!=2&&userAnswer!=3&&userAnswer!=0 || repeat);
        }
        repeat=true; //Vuelve al menú principal
    }
    
    public static void executeClientRol()
    {
        int userAnswer;
        repeat=true;
        if (Flight.isPrepared())
        {
            do{
                showMenu(USER_MENU);       /*showClientMenu() => Solo se muestra si hay 1 piloto, 1 copiloto y 1 asistente (mínimo). Sino vuelve al menu principal.
                                                                    (1-Visualizar información vuelo, 2-Comprar billetes, 0-Salir)*/
                userAnswer=Input.readInt();

                switch(userAnswer)
                {
                    case 1: Flight.showInfo(); //Visualizar info del vuelo
                        break;
                    case 2: Flight.buyTickets(); //Comprar billetes
                        break;
                    case 0: repeat=false; //Salir al menú principal
                        break;
                }
            }while(userAnswer!=1&&userAnswer!=2&&userAnswer!=0 || repeat);
        }
        else
        {
            System.out.println(ConsoleColors.RED+"El vuelo no está preparado todavía...");
        }
        repeat=true; //Vuelve al menú principal.
    }
}
