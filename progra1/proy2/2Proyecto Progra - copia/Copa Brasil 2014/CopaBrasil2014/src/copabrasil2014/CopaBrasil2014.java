/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package copabrasil2014;

/*import Listas.*;
import Nodos.NodoJugador;
import java.util.Scanner;
import Nodos.NodoEquipo;
import Nodos.NodoEstadio;*/
import Nodos.NodoJugador;
import Listas.ListaEquipo;
import Listas.ListaJugador;
import Listas.ListaEstadio;
import Nodos.NodoEstadio;
import Listas.ListaGrupos;
import Listas.ListaCalendario;
import java.util.Scanner;
 


/**
 *
 * @author Dinier
 */
public class CopaBrasil2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
        int opcion;
        int opcion2;
        char c = 's';
        String nombre;
        String nombreNuevo;
        int edad;
                                ListaEquipo equipoale = new ListaEquipo();
                                ListaJugador alemania = new ListaJugador();
                                alemania.Insertar("Klose", 36);
                                alemania.Insertar("Luka", 26);
                                alemania.Insertar("Reus", 23);
                                equipoale.InsertarE("Alemania", alemania);
                               
                                ListaEquipo equipocr = new ListaEquipo();
                                ListaJugador costaRica = new ListaJugador();
                                costaRica.Insertar("Campbell", 21);
                                costaRica.Insertar("Ruiz", 27);
                                costaRica.Insertar("Navas", 26);
                                costaRica.Insertar("Duarte", 25);
                                equipocr.InsertarE("Costa Rica", costaRica);
                                
                                ListaEquipo equipoargen = new ListaEquipo();
                                ListaJugador argentina = new ListaJugador();
                                argentina.Insertar("Messi", 27);
                                argentina.Insertar("Angel Di Maria", 26);
                                argentina.Insertar("Gonzalo Higuain", 29);
                                equipoargen.InsertarE("Argentina", argentina);
                                
                                ListaEquipo equipousa = new ListaEquipo();
                                ListaJugador usa = new ListaJugador();
                                usa.Insertar("Tim Howard", 35);
                                usa.Insertar("Michael Bradley", 29);
                                usa.Insertar("Brad Davis", 32);
                                equipousa.InsertarE("USA", usa);
                                
                                ListaEquipo equipobel = new ListaEquipo();
                                ListaJugador belgica = new ListaJugador();
                                belgica.Insertar("Eden Hazard", 23);
                                belgica.Insertar("Thibaut Courtois", 22);
                                belgica.Insertar("Nicolas Lombaerts", 29);
                                equipobel.InsertarE("Belgica", belgica);
                               
                                ListaEquipo equipoarg = new ListaEquipo();
                                ListaJugador argelia = new ListaJugador();
                                argelia.Insertar("Mehdi Mostefa", 30);
                                argelia.Insertar("Yacine Brahimi", 29);
                                argelia.Insertar("Mahamed Zemmamouche", 26);
                                equipoarg.InsertarE("Argelia", argelia);
                                
                                ListaEquipo equipocam = new ListaEquipo();
                                ListaJugador camerun = new ListaJugador();
                                camerun.Insertar("Samuel Eto'o", 33);
                                camerun.Insertar("Alexandre Song", 26);
                                camerun.Insertar("Joël Matip", 22);
                                equipocam.InsertarE("Camerun", camerun);
                                
                                ListaEquipo equipocdm = new ListaEquipo();
                                ListaJugador costademarfil = new ListaJugador();
                                costademarfil.Insertar("Didier Drogba", 36);
                                costademarfil.Insertar("Yaya Toure", 31);
                                costademarfil.Insertar("Wilfried Bony", 25);
                                equipocdm.InsertarE("Costa de Marfil", costademarfil);
                                
                                ListaEquipo equipogh = new ListaEquipo();
                                ListaJugador ghana = new ListaJugador();
                                ghana.Insertar("Kevin-Prince Boateng", 27);
                                ghana.Insertar("Michael Essien", 31);
                                ghana.Insertar("Majeed Waris", 22);
                                equipogh.InsertarE("Ghana", ghana);
                                
                                ListaEquipo equipoau = new ListaEquipo();
                                ListaJugador australia = new ListaJugador();
                                australia.Insertar("Tim Cahill", 34);
                                australia.Insertar("James Troisi", 26);
                                australia.Insertar("Ryan McGowan", 24);
                                equipoau.InsertarE("Australia", australia);
                              
                                ListaEquipo equipoir = new ListaEquipo();
                                ListaJugador iran = new ListaJugador();
                                iran.Insertar("Alireza Haghighi", 26);
                                iran.Insertar("Ashkan Dejagah", 28);
                                iran.Insertar("Daniel Davari", 25);
                                equipoir.InsertarE("Iran", iran);
                                
                                ListaEquipo equipoja = new ListaEquipo();
                                ListaJugador japon = new ListaJugador();
                                japon.Insertar("Oliver Atom", 20);
                                japon.Insertar("Benji Price", 21);
                                japon.Insertar("Andy Jhonson", 22);
                                equipoja.InsertarE("Japon", japon);
                                
                                ListaEquipo equipore = new ListaEquipo();
                                ListaJugador republicadekorea = new ListaJugador();
                                republicadekorea.Insertar("Park Ji-Sung", 33);
                                republicadekorea.Insertar("Yoo Byung-Soo", 26);
                                republicadekorea.Insertar("Heung-Min Son", 22);
                                equipore.InsertarE("Republica de Korea", republicadekorea
                                );
                                
                                ListaEquipo equipobos = new ListaEquipo();
                                ListaJugador bosniayherzegovina = new ListaJugador();
                                bosniayherzegovina.Insertar("Elvir Rahimic", 38);
                                bosniayherzegovina.Insertar("Edin Džeko", 28);
                                bosniayherzegovina.Insertar("Zvjezdan Misimovic", 25);
                                equipobos.InsertarE("Bosnia y Herzegovina", bosniayherzegovina
                                );
                                
                                ListaEquipo equipocro = new ListaEquipo();
                                ListaJugador croacia = new ListaJugador();
                                croacia.Insertar("Luka Modric", 28);
                                croacia.Insertar("Ivica Olic", 34);
                                croacia.Insertar("Mario Mandžukic", 29);
                                equipocro.InsertarE("Croacia", croacia);
                                
                                ListaEquipo equipoin = new ListaEquipo();
                                ListaJugador inglaterra = new ListaJugador();
                                inglaterra.Insertar("Frank Lampard", 34);
                                inglaterra.Insertar("Steven Gerrard", 36);
                                inglaterra.Insertar("Wayne Rooney", 32);
                                equipoin.InsertarE("Inglaterra", inglaterra);
                                
                                ListaEquipo equipof = new ListaEquipo();
                                ListaJugador francia = new ListaJugador();
                                francia.Insertar("Karin Benzema", 26);
                                francia.Insertar("Patrice Evra", 33);
                                francia.Insertar("Hugo Lloris", 27);
                                equipof.InsertarE("Francia", francia);
                                
                                ListaEquipo equipog = new ListaEquipo();
                                ListaJugador grecia = new ListaJugador();
                                grecia.Insertar("Georgios Samaras", 29);
                                grecia.Insertar("Stefanos Kapino", 20);
                                grecia.Insertar("Kyriakos Papadopoulos", 22);
                                equipog.InsertarE("Grecia", grecia);
                                
                                ListaEquipo equipoi = new ListaEquipo();
                                ListaJugador italia = new ListaJugador();
                                italia.Insertar("Andrea Pirlo", 34);
                                italia.Insertar("Gianluigi Buffon", 37);
                                italia.Insertar("Salvatore Bocchetti", 27);
                                equipoi.InsertarE("Italia", italia);
                                
                                ListaEquipo equipop = new ListaEquipo();
                                ListaJugador portugal = new ListaJugador();
                                portugal.Insertar("Cristiano Ronaldo", 29);
                                portugal.Insertar("Pepe", 31);
                                portugal.Insertar("Nani", 27);
                                equipop.InsertarE("Portugal", portugal);
                             
                                ListaEquipo equipor = new ListaEquipo();
                                ListaJugador rusia = new ListaJugador();
                                rusia.Insertar("Igor Akinfeev", 28);
                                rusia.Insertar("Dmitri Kombarov", 27);
                                rusia.Insertar("Yevgeni Makeyev", 25);
                                equipor.InsertarE("Rusia", rusia);
                                
                                ListaEquipo equipoho = new ListaEquipo();
                                ListaJugador holanda = new ListaJugador();
                                holanda.Insertar("Arjen Robben", 29);
                                holanda.Insertar("Robin Van Persie", 31);
                                holanda.Insertar("Wesley Sneijder", 30);
                                equipoho.InsertarE("Holanda", holanda);
                                
                                ListaEquipo equipoes = new ListaEquipo();
                                ListaJugador españa = new ListaJugador();
                                españa.Insertar("Iker Casillas", 34);
                                españa.Insertar("David Villa", 31);
                                españa.Insertar("Andres Iniesta", 32);
                                equipoes.InsertarE("España", españa);
                               
                                ListaEquipo equiposu = new ListaEquipo();
                                ListaJugador suiza = new ListaJugador();
                                suiza.Insertar("Xherdan Shaqiri", 22);
                                suiza.Insertar("Diego Benaglio", 30);
                                suiza.Insertar("Admir Mehmedi", 23);
                                equiposu.InsertarE("Suiza", suiza);
                                
                                ListaEquipo equipoh = new ListaEquipo();
                                ListaJugador honduras = new ListaJugador();
                                honduras.Insertar("Minor Figueroa", 28);
                                honduras.Insertar("Jerry Palacios", 27);
                                honduras.Insertar("Wilson Palacios", 30);
                                equipoh.InsertarE("Honduras", honduras);
                                
                                ListaEquipo equipom = new ListaEquipo();
                                ListaJugador mexico = new ListaJugador();
                                mexico.Insertar("Guillermo Ochoa", 31);
                                mexico.Insertar("Rafael Marquez", 37);
                                mexico.Insertar("Javier Hernandez", 26);
                                equipom.InsertarE("Mexico", mexico);
                               
                                ListaEquipo equipob = new ListaEquipo();
                                ListaJugador brazil = new ListaJugador();
                                brazil.Insertar("Neymar", 24);
                                brazil.Insertar("Julio Cesar", 30);
                                brazil.Insertar("David Luiz", 27);
                                equipob.InsertarE("Brazil", brazil);
                                
                                ListaEquipo equipoch = new ListaEquipo();
                                ListaJugador chile = new ListaJugador();
                                chile.Insertar("Alexis Sanches", 28);
                                chile.Insertar("Arturo Vidal", 25);
                                chile.Insertar("Claudio Bravo", 31);
                                equipoch.InsertarE("Chile", chile);
                               
                                ListaEquipo equipoc = new ListaEquipo();
                                ListaJugador colombia = new ListaJugador();
                                colombia.Insertar("James Rodiguez", 22);
                                colombia.Insertar("Roger Cañas", 24);
                                colombia.Insertar("Mario Yepes", 38);
                                equipoc.InsertarE("Colombia", colombia);
                              
                                ListaEquipo equipoe = new ListaEquipo();
                                ListaJugador ecuador = new ListaJugador();
                                ecuador.Insertar("Antonio Valencia", 29);
                                ecuador.Insertar("Alexander Domínguez", 27);
                                ecuador.Insertar("Édison Méndez", 25);
                                equipoe.InsertarE("Ecuador", ecuador);
                                
                                
                                ListaEquipo equipou = new ListaEquipo();
                                ListaJugador uruguay = new ListaJugador();
                                uruguay.Insertar("Edinson Cavani", 28);
                                uruguay.Insertar("Luis Suares", 30);
                                uruguay.Insertar("Diego Forlan", 32);
                                equipou.InsertarE("Uruguay", uruguay);
                                
                                ListaEquipo equipon = new ListaEquipo();
                                ListaJugador nigeria = new ListaJugador();
                                nigeria.Insertar("Vincent ENYEAMA", 31);
                                nigeria.Insertar("Joseph YOBO", 33);
                                nigeria.Insertar("Emmanuel EMENIKE", 27);
                                equipon.InsertarE("Nigeria", nigeria);
                                equipon.Imprimir();
                                
                                
                                ListaCalendario segundoPartido = new ListaCalendario();
                                            segundoPartido.Insertar("Mexico vs Camerun Fecha 13/06/2014 | 13:00 horas Marcador 0 vs 2  ",
                                                    "Cr vs Camerun Fecha 13/06/2014 | 13:00 horas Marcador 3 vs 3","Mexico vs Camerun Fecha 13/06/2014 | 13:00 horas Marcador 3 vs 3","Mexico vs Camerun Fecha 13/06/2014 | 13:00 horas Marcador 3 vs 3");                     
                                            segundoPartido.Imprimir();
                                segundoPartido.rc("Cr");
                                
                                System.out.println(uruguay.jugadorJoven(uruguay));
                                System.out.println(uruguay.jugadorViejo(uruguay));
                                
                                
                       //         ListaGrupos grupos = new ListaGrupos();
     //   grupos.InsertarGs("A",equipocr,equipon,equipou,equipoe);
        
    //    grupos.arreglo();
     //   grupos.Imprimir();
                                
                                
                 /*              
                    ListaEstadio estadioMineirao = new ListaEstadio();
                    estadioMineirao.InsertarE("Estadio Mineirao, Belo Horizonte",equipon,"31 C",20);
                    estadioMineirao.InsertarE("Estadio Mineirao, Belo Horizonte",equipocr,"29 c",20);
                    estadioMineirao.InsertarE("Estadio Mineirao, Belo Horizonte",equipoh,"33 c",20);
                    estadioMineirao.Imprimir();
                    
                     ListaEstadio estadioArenaPantanal = new  ListaEstadio();
                    estadioArenaPantanal.InsertarE("Arena Pantanal, Cuiaba", equipocr,"28 c",12);
                    estadioArenaPantanal.Imprimir();
                    
                    ListaEstadio estadioCastelao = new ListaEstadio();                   
                    estadioCastelao.InsertarE("Estadio Castelao, Fortaleza", EstadioCastelao);
                    estadioCastelao.Imprimir();
                            
                    ListaEstadio estadiodasDunas = new ListaEstadio();                   
                    estadiodasDunas.InsertarE("Estadio das Dunas, Natal", EstadiodasDunas);
                    estadiodasDunas.Imprimir();

                    ListaEstadio estadioArenaPernambuco = new ListaEstadio();
                    estadioArenaPernambuco.InsertarE("Arena Pernambuco, Recife", ArenaPernambuco);
                    estadioArenaPernambuco.Imprimir();

                    ListaEstadio estadioArenaFonteNova = new ListaEstadio();
                    estadioArenaFonteNova.InsertarE("Arena Fonte Nova, Salvador", ArenaFonteNova);
                    estadioArenaFonteNova.Imprimir();

                    ListaEstadio estadioEstadioNacionaldeBrasilia = new ListaEstadio();                  
                    estadioEstadioNacionaldeBrasilia.InsertarE("Estadio Nacional de Brasilia, Brasilia", EstadioNacionaldeBrasilia);
                    estadioEstadioNacionaldeBrasilia.Imprimir();
                    
                    ListaEstadio estadioArenadaBaixada = new ListaEstadio();
                    estadioArenadaBaixada.InsertarE("Arena da Baixada, Curitiba", ArenadaBaixada);
                    estadioArenadaBaixada.Imprimir();

                    ListaEstadio estadioArenaAmazonia = new ListaEstadio();
                    estadioArenaAmazonia.InsertarE("Arena Amazonia, Manaus", ArenaAmazonia);
                    estadioArenaAmazonia.Imprimir();

                    ListaEstadio estadioEstadioBeiraRio = new ListaEstadio();
                    estadioEstadioBeiraRio.InsertarE("Estadio Beira-Rio, Porto Alegre", EstadioBeiraRio);
                    estadioEstadioBeiraRio.Imprimir();
                    
                    ListaEstadio estadioEstadioDoMaracana = new ListaEstadio();
                    estadioEstadioDoMaracana.InsertarE("Estadio Do Maracana, Rio de Janeiro", EstadioDoMaracana);
                    estadioEstadioDoMaracana.Imprimir();
                            
                    ListaEstadio estadioArenadeSaoPaulo = new ListaEstadio();
                    estadioArenadeSaoPaulo.InsertarE("Arena de Sao Paulo, Sao Paulo", ArenadeSaoPaulo);
                    estadioArenadeSaoPaulo.Imprimir();
                              
               */                
                   

        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Lista");
            System.out.println("Digite el numero del ejercicio: " + "\n" + "1.Insercion,Modificar y Eliminar"
                    + "\n" + "2.Consultas"
                    + "\n" + "3.Reportes"
                    + "\n" + "4.Calendario");

            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Sub lista");
                        System.out.println("Digite el numero de lo que desea hacer:" + "\n" + "1.Insertar Jugador"
                                + "\n" + "2.Modificar Jugador"
                                + "\n" + "3.Insertar Estadio"
                                + "\n" + "4.Eliminar Estadio");
                        opcion2 = Integer.parseInt(teclado.nextLine());
                        switch (opcion2) {
                            case 1:
                                do{
                                System.out.println("Escoja cual equipo:"
                                + "SUBMENU DE EQUIPOS"
                                + "\n1:   Alemania."
                                + "\n2:   Costa Rica."
                                + "\n3:   Argentina."
                                + "\n4:   EEUU."
                                + "\n5:   Belgica."
                                + "\n6:   Argelia."
                                + "\n7:   Camerun."
                                + "\n8:   Costa de Marfil."
                                + "\n9:   Ghana."
                                + "\n10:  Australia."
                                + "\n11:  Iran."
                                + "\n12:  Japon."
                                + "\n13:  Republica de korea ."
                                + "\n14:  Bosnia y Herzegovina ."
                                + "\n15:  Croacia."
                                + "\n16:  Inglaterra."
                                + "\n17:  francia."
                                + "\n18:  Grecia ."
                                + "\n19:  Italia."
                                + "\n20:  Portugal."
                                + "\n21:  Rusia."
                                + "\n22:  Holanda."
                                + "\n23:  España."
                                + "\n24:  Suiza."
                                + "\n25:  Honduras."
                                + "\n26:  Mexico."
                                + "\n27:  Brazil."
                                + "\n28:  Chile."
                                + "\n29:  Colombia."
                                + "\n30:  Ecuador."
                                + "\n31:  Uruguay."
                                + "\n32:  Nigeria.");
                                 opcion2 = Integer.parseInt(teclado.nextLine());
                        switch (opcion2) {
                            case 1:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                            
                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                alemania.Insertar(nombre, edad);
                                alemania.Imprimir();

                                break;
                            case 2:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();


                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                costaRica.Insertar(nombre,edad);
                                costaRica.Imprimir();
                                break;
                            case 3:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();
                              
                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                argentina.Insertar(nombre,edad);
                                argentina.Imprimir();
                                break;
                            case 4:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();


                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                usa.Insertar(nombre, edad);
                                usa.Imprimir();
                                break;
                            case 5:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                belgica.Insertar(nombre,edad);
                                belgica.Imprimir();
                                break;
                            case 6:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();


                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                argelia.Insertar(nombre, edad);
                                argelia.Imprimir();
                                break;
                            case 7:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();


                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                camerun.Insertar(nombre, edad);
                                camerun.Imprimir();
                                break;
                            case 8:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();


                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                costademarfil.Insertar(nombre, edad);
                                costademarfil.Imprimir();
                                break;
                            case 9:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                ghana.Insertar(nombre,edad);
                                ghana.Imprimir();
                                break;
                            case 10:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();


                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                australia.Insertar(nombre, edad);
                                australia.Imprimir();
                                break;
                            case 11:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();


                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                iran.Insertar(nombre, edad);
                                iran.Imprimir();
                                break;
                            case 12:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();


                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                japon.Insertar(nombre, edad);
                                japon.Imprimir();
                                break;
                            case 13:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();


                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                republicadekorea.Insertar(nombre, edad);
                                republicadekorea.Imprimir();
                                break;
                            case 14:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                bosniayherzegovina.Insertar(nombre, edad);
                                bosniayherzegovina.Imprimir();
                                break;
                            case 15:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                croacia.Insertar(nombre, edad);
                                croacia.Imprimir();
                                break;
                            case 16:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                inglaterra.Insertar(nombre, edad);
                                inglaterra.Imprimir();
                                break;
                            case 17:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                francia.Insertar(nombre,edad);
                                francia.Imprimir();
                                break;
                            case 18:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                grecia.Insertar(nombre, edad);
                                grecia.Imprimir();
                                break;
                            case 19:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                italia.Insertar(nombre, edad);
                                italia.Imprimir();
                                break;
                            case 20:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                portugal.Insertar(nombre,edad);
                                portugal.Imprimir();
                                break;
                            case 21:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                rusia.Insertar(nombre,edad);
                                rusia.Imprimir();
                                break;
                            case 22:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                holanda.Insertar(nombre, edad);
                                holanda.Imprimir();

                                break;
                            case 23:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                españa.Insertar(nombre,edad);
                                españa.Imprimir();
                                break;
                            case 24:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                suiza.Insertar(nombre,edad);
                                suiza.Imprimir();
                                break;
                            case 25:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                honduras.Insertar(nombre,edad);
                                honduras.Imprimir();
                                break;
                            case 26:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                mexico.Insertar(nombre,edad);
                                mexico.Imprimir();
                                break;
                            case 27:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                brazil.Insertar(nombre,edad);
                                brazil.Imprimir();
                                break;
                            case 28:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                chile.Insertar(nombre,edad);
                                chile.Imprimir();
                                break;
                            case 29:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                colombia.Insertar(nombre,edad);
                                colombia.Imprimir();
                                break;
                            case 30:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                ecuador.Insertar(nombre,edad);
                                ecuador.Imprimir();
                                break;
                            case 31:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                uruguay.Insertar(nombre,edad);
                                uruguay.Imprimir();
                                break;
                            case 32:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                nigeria.Insertar(nombre,edad);
                                nigeria.Imprimir();
                                break;
                        }
                               System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                        c = teclado.nextLine().charAt(0);
                        
                    } while (c == 'S' || c == 's');
                                
                                break;
                            case 2:
                                do{
                                System.out.println("Escoja cual equipo:"
                                + "SUBMENU DE EQUIPOS"
                                + "\n1:   Alemania."
                                + "\n2:   Costa Rica."
                                + "\n3:   Argentina."
                                + "\n4:   EEUU."
                                + "\n5:   Belgica."
                                + "\n6:   Argelia."
                                + "\n7:   Camerun."
                                + "\n8:   Costa de Marfil."
                                + "\n9:   Ghana."
                                + "\n10:  Australia."
                                + "\n11:  Iran."
                                + "\n12:  Japon."
                                + "\n13:  Republica de korea ."
                                + "\n14:  Bosnia y Herzegovina ."
                                + "\n15:  Croacia."
                                + "\n16:  Inglaterra."
                                + "\n17:  francia."
                                + "\n18:  Grecia ."
                                + "\n19:  Italia."
                                + "\n20:  Portugal."
                                + "\n21:  Rusia."
                                + "\n22:  Holanda."
                                + "\n23:  España."
                                + "\n24:  Suiza."
                                + "\n25:  Honduras."
                                + "\n26:  Mexico."
                                + "\n27:  Brazil."
                                + "\n28:  Chile."
                                + "\n29:  Colombia."
                                + "\n30:  Ecuador."
                                + "\n31:  Uruguay."
                                + "\n32:  Nigeria.");
                                 opcion2 = Integer.parseInt(teclado.nextLine());
                        switch (opcion2) {
                            case 1:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                alemania.ModificarJugador(nombre, nombreNuevo, edad);
                                alemania.Imprimir();

                                break;
                            case 2:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                costaRica.ModificarJugador(nombre, nombreNuevo, edad);
                                costaRica.Imprimir();
                                break;
                            case 3:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                argentina.ModificarJugador(nombre, nombreNuevo, edad);
                                argentina.Imprimir();
                                break;
                            case 4:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                usa.ModificarJugador(nombre, nombreNuevo, edad);
                                usa.Imprimir();
                                break;
                            case 5:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                belgica.ModificarJugador(nombre, nombreNuevo, edad);
                                belgica.Imprimir();
                                break;
                            case 6:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                argelia.ModificarJugador(nombre, nombreNuevo, edad);
                                argelia.Imprimir();
                                break;
                            case 7:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                camerun.ModificarJugador(nombre, nombreNuevo, edad);
                                camerun.Imprimir();
                                break;
                            case 8:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                costademarfil.ModificarJugador(nombre, nombreNuevo, edad);
                                costademarfil.Imprimir();
                                break;
                            case 9:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                ghana.ModificarJugador(nombre, nombreNuevo, edad);
                                ghana.Imprimir();
                                break;
                            case 10:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                australia.ModificarJugador(nombre, nombreNuevo, edad);
                                australia.Imprimir();
                                break;
                            case 11:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                iran.ModificarJugador(nombre, nombreNuevo, edad);
                                iran.Imprimir();
                                break;
                            case 12:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                japon.ModificarJugador(nombre, nombreNuevo, edad);
                                japon.Imprimir();
                                break;
                            case 13:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                republicadekorea.ModificarJugador(nombre, nombreNuevo, edad);
                                republicadekorea.Imprimir();
                                break;
                            case 14:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                bosniayherzegovina.ModificarJugador(nombre, nombreNuevo, edad);
                                bosniayherzegovina.Imprimir();
                                break;
                            case 15:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                croacia.ModificarJugador(nombre, nombreNuevo, edad);
                                croacia.Imprimir();
                                break;
                            case 16:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                inglaterra.ModificarJugador(nombre, nombreNuevo, edad);
                                inglaterra.Imprimir();
                                break;
                            case 17:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                francia.ModificarJugador(nombre, nombreNuevo, edad);
                                francia.Imprimir();
                                break;
                            case 18:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                grecia.ModificarJugador(nombre, nombreNuevo, edad);
                                grecia.Imprimir();
                                break;
                            case 19:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                italia.ModificarJugador(nombre, nombreNuevo, edad);
                                italia.Imprimir();
                                break;
                            case 20:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                portugal.ModificarJugador(nombre, nombreNuevo, edad);
                                portugal.Imprimir();
                                break;
                            case 21:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                rusia.ModificarJugador(nombre, nombreNuevo, edad);
                                rusia.Imprimir();
                                break;
                            case 22:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                holanda.ModificarJugador(nombre, nombreNuevo, edad);
                                holanda.Imprimir();

                                break;
                            case 23:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                españa.ModificarJugador(nombre, nombreNuevo, edad);
                                españa.Imprimir();
                                break;
                            case 24:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                suiza.ModificarJugador(nombre, nombreNuevo, edad);
                                suiza.Imprimir();
                                break;
                            case 25:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                honduras.ModificarJugador(nombre, nombreNuevo, edad);
                                honduras.Imprimir();
                                break;
                            case 26:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                mexico.ModificarJugador(nombre, nombreNuevo, edad);
                                mexico.Imprimir();
                                break;
                            case 27:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                brazil.ModificarJugador(nombre, nombreNuevo, edad);
                                brazil.Imprimir();
                                break;
                            case 28:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                chile.ModificarJugador(nombre, nombreNuevo, edad);
                                chile.Imprimir();
                                break;
                            case 29:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                colombia.ModificarJugador(nombre, nombreNuevo, edad);
                                colombia.Imprimir();
                                break;
                            case 30:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                ecuador.ModificarJugador(nombre, nombreNuevo, edad);
                                ecuador.Imprimir();
                                break;
                            case 31:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                uruguay.ModificarJugador(nombre, nombreNuevo, edad);
                                uruguay.Imprimir();
                                break;
                            case 32:
                                System.out.println("Digite el nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                System.out.println("Digite el nuevo nombre del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                nombreNuevo = teclado.nextLine();

                                System.out.println("Digite la edad del jugador de Costa Rica a modificar");
                                teclado = new Scanner(System.in);
                                edad = teclado.nextInt();
                                nigeria.ModificarJugador(nombre, nombreNuevo, edad);
                                nigeria.Imprimir();
                                break;
                        }
                               System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                        c = teclado.nextLine().charAt(0);
                        
                    } while (c == 'S' || c == 's');
                            case 3:
                                System.out.println("Insertar Estadio");
                                 System.out.println("Digite el nombre del jugador de Costa Rica a Eliminar");
                                teclado = new Scanner(System.in);
                                nombre = teclado.nextLine();

                                nigeria.EliminarJugador(nombre);
                                nigeria.Imprimir();
                                break;
                                
                               
                            case 4:
                                System.out.println("Eliminar Estadio");
                                break;
                        }
                        
                        System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                        c = teclado.nextLine().charAt(0);
                        
                    } while (c == 'S' || c == 's');
                    break;

                case 2:
                    do {
                        System.out.println("Sub lista");
                        System.out.println("Digite el numero de lo que desea hacer:" + "\n" + "1.Jugador mas Joven de un equipo (x)"
                                + "\n" + "2.Jugador mas Viejo de un equipo (x)"
                                + "\n" + "3.Resultado de un partido (x)");
                        opcion2 = Integer.parseInt(teclado.nextLine());
                        switch (opcion2) {
                            case 1:
                                System.out.println("Jugador mas Joven de un equipo (x)");
                                break;
                            case 2:
                                System.out.println("Jugador mas Viejo de un equipo (x)");
                                break;
                            case 3:
                                System.out.println("Resultado de un partido (x)");
                                break;
                        }
                        System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                        c = teclado.nextLine().charAt(0);
                    } while (c == 'S' || c == 's');
                    break;

                case 3:
                    do {
                        System.out.println("Sub lista");
                        System.out.println("Digite el numero de lo que desea hacer:" + "\n" + "1.Estadios con toda la información respectiva"
                                + "\n" + "2.Equipos con toda la información respectiva"
                                + "\n" + "3.Grupos con toda la información respectiva"
                                + "\n" + "4.Mostrar los goleadores "
                                + "\n" + "5.Tabla de posiciones ");
                        opcion2 = Integer.parseInt(teclado.nextLine());
                        switch (opcion2) {
                            case 1:
                                System.out.println("Estadios con toda la información respectiva");
                              
                               do{
                                     System.out.println("Escoja cual Estadio:"
                                             +"\n"+"SubMenu de Estadios"
                                                   +"\n1."+"Estadio Mineirao"
                                                   +"\n2."+"Arena Pantanal"
                                                   +"\n3."+"Estadio Castelao"
                                                   +"\n4."+"Estadio das Dunas"
                                                   +"\n5."+"Arena Pernambuco"
                                                   +"\n6."+"Arena Fonte Nova"
                                                   +"\n7."+"Arena da Baixada"
                                                   +"\n8."+"Arena Amazonia"
                                                   +"\n9."+"Estadio Beira-Rio"  
                                                   +"\n10."+"Estadio Do Maracana"
                                                   +"\n11."+"Arena de Sao Paulo"
                                                   +"\n12."+"Estadio Nacional de Brasilia");
                                      opcion = Integer.parseInt(teclado.nextLine());
                                   switch (opcion) {
                                       case 1:
                                           ListaCalendario EstadioMineirao = new ListaCalendario();
                                           System.out.println("Calendario de los Estadios con su informacion respectiva.");
                                           equipoc.ImprimirPrueba();
                                           System.out.print("  vs  ");
                                           equipog.ImprimirPrueba();
                                           System.out.println("");
                                           EstadioMineirao.InsertarClima("PARCIALMENTE NUBOSO, 24°C Temperatura, 11m/s Viento, 51% Humedad",", Cantidad Personas 20");
                                           EstadioMineirao.ImprimirClima();
                                           System.out.println("");

                                           equipobel.ImprimirPrueba();
                                           System.out.print("  vs  ");
                                           equipoarg.ImprimirPrueba();
                                           System.out.println("");
                                           EstadioMineirao.InsertarClima("PARCIALMENTE NUBOSO, 29°C Temperatura, 5m/s Viento, 37% Humedad",", Cantidad Personas 12");
                                           EstadioMineirao.ImprimirClima();
                                           System.out.println("");

                                           equipoargen.ImprimirPrueba();
                                           System.out.print("  vs  ");
                                           equipoir.ImprimirPrueba();
                                           System.out.println("");
                                           EstadioMineirao.InsertarClima("PARCIALMENTE NUBOSO, 23°C Temperatura, 8m/s Viento, 51% Humedad",", Cantidad Personas 15");
                                           EstadioMineirao.ImprimirClima();
                                           System.out.println("");

                                           equipocr.ImprimirPrueba();
                                           System.out.print("  vs  ");
                                           equipoin.ImprimirPrueba();
                                           System.out.println("");
                                           EstadioMineirao.InsertarClima("SOLEADO, 24°C Temperatura, 3m/s Viento, 44% Humedad",", Cantidad Personas 16");
                                           EstadioMineirao.ImprimirClima();
                                           System.out.println("");

                                           equipob.ImprimirPrueba();
                                           System.out.print("  vs ");
                                           equipoch.ImprimirPrueba();
                                           System.out.println("");
                                           EstadioMineirao.InsertarClima("PARCIALMENTE NUBOSO, 26°C Temperatura, 6m/s Viento, 45% Humedad",", Cantidad Personas 22");
                                           EstadioMineirao.ImprimirClima();
                                           System.out.println("");

                                           equipob.ImprimirPrueba();
                                           System.out.print("  vs  ");
                                           equipoale.ImprimirPrueba();
                                           System.out.println("");
                                           EstadioMineirao.InsertarClima("NUBOSO, 22°C Temperatura, 7m/s Viento, 51% Humedad",", Cantidad Personas 81");
                                           EstadioMineirao.ImprimirClima();
                                           System.out.println("");
                                           break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                               
                            case 7:
                                break;
                            case 8: 
                                break;
                                   }  
                                   
                                
                                
                                System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                        c = teclado.nextLine().charAt(0);
                    } while (c == 'S' || c == 's');
                    break;
                                
                            case 2:
                                System.out.println("Equipos con toda la información respectiva");
                                
                                do{
                                    System.out.println(" SUBMENU DE EQUIPOS"
                                + "\n1:   Alemania."
                                + "\n2:   Costa Rica."
                                + "\n3:   Argentina."
                                + "\n4:   EEUU."
                                + "\n5:   Belgica."
                                + "\n6:   Argelia."
                                + "\n7:   Camerun."
                                + "\n8:   Costa de Marfil."
                                + "\n9:   Ghana."
                                + "\n10:  Australia."
                                + "\n11:  Iran."
                                + "\n12:  Japon."
                                + "\n13:  Republica de korea ."
                                + "\n14:  Bosnia y Herzegovina ."
                                + "\n15:  Croacia."
                                + "\n16:  Inglaterra."
                                + "\n17:  francia."
                                + "\n18:  Grecia ."
                                + "\n19:  Italia."
                                + "\n20:  Portugal."
                                + "\n21:  Rusia."
                                + "\n22:  Holanda."
                                + "\n23:  España."
                                + "\n24:  Suiza."
                                + "\n25:  Honduras."
                                + "\n26:  Mexico."
                                + "\n27:  Brazil."
                                + "\n28:  Chile."
                                + "\n29:  Colombia."
                                + "\n30:  Ecuador."
                                + "\n31:  Uruguay."
                                + "\n32:  Nigeria."
                                + "\n0:   Regresar.");
                                opcion = Integer.parseInt(teclado.nextLine());
                                   switch (opcion) {
                                 case 1:
                                           equipoale.Imprimir();
                                 case 2:
                                     equipocr.Imprimir();
                                break;
                            case 3:
                                equipoargen.Imprimir();
                                break;
                            case 4:
                                equipousa.Imprimir();
                                break;
                            case 5:
                                equipobel.Imprimir();
                                break;
                            case 6:
                                equipoarg.Imprimir();
                                break;
                               
                            case 7:
                                equipocam.Imprimir();
                                break;
                            case 8: 
                                break;
                                   }  
                                   
                                
                                
                                System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                        c = teclado.nextLine().charAt(0);
                    } while (c == 'S' || c == 's');
                                
                                
                                
                                
                                break;
                            case 3:
                                System.out.println("Grupos con toda la información respectiva");
                                break;
                            case 4:
                                System.out.println("Mostrar los goleadores ordenados por goleo.(El nombre del jugador, el nombre del equipo y la cantidad de goles anotados).");
                                break;
                            case 5:
                                System.out.println("Mostrar la tabla de posiciones por grupo.(Letra de grupo, nombre del equipo, PJ, PG, PE, PP, GA, GE, GDif y puntos).");
                                break;
                            case 6:
                                System.out.println("Mostrar los datos climáticos por estadio, indicar fecha y hora.");
                                break;
                        }

                        System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                        c = teclado.nextLine().charAt(0);
                    } while (c == 'S' || c == 's');
                    break;
                case 4:
                   
                   do {
                        
                                   System.out.println( " SUBMENU DE FECHAS"
                                            + "\n PRIMERA VUELTA"
                                            + "\n1:   fecha 1."
                                            + "\n2:   fecha 2."
                                            + "\n3:   fecha 3."
                                            + "\n4:   fecha 4."
                                            + "\n5:   fecha 5."
                                            + "\n6:   fecha 6."
                                            + "\n7:   fecha 7."
                                            + "\n8:   fecha 8."
                                            + "\n9:   fecha 9."
                                            + "\n10:  fecha 10."
                                            + "\n11:  fecha 11."
                                            + "\n12:  fecha 12."
                                            + "\n13:  fecha 13."
                                            + "\n14:  fecha 14."
                                            + "\n15:  fecha 15."
                                            + "\n OCTAVOS"
                                            + "\n16:  fecha 16."
                                            + "\n17:  fecha 17."
                                            + "\n18:  fecha 18."
                                            + "\n19:  fecha 19."
                                            + "\n CUARTOS DE FINAL"
                                            + "\n20:  fecha 20."
                                            + "\n21:  fecha 21."
                                            + "\n SEMIFINALES "
                                            + "\n22:  fecha 22."
                                            + "\n23:  fecha 23."
                                            + "\n DISPUTA POR TERCER LUGAR Y FINAL"
                                            + "\n24: fecha 24"
                                            + "\n25:  fecha 25."
                                           );
                                   
                                   opcion = Integer.parseInt(teclado.nextLine());
                                   
                                    switch (opcion) {
                                        case 1:
                                            ListaCalendario primerPartido = new ListaCalendario();

                                            /*primerPartido.Insertar("brazil vs croacia 12/06/2014 | 17:00 horas");
                                            primerPartido.Imprimir();
                                            break;
                                        case 2:
                                          //  ListaCalendario segundoPartido = new ListaCalendario();

                                            segundoPartido.Insertar("Mexico vs Camerun Fecha 13/06/2014 | 13:00 horas "
                                                    + "\n España vs Holanda Fecha 13/06/2014 | 16:00 horas"
                                                    + "\n Chile vs Australia Fecha 13/06/2014 | 18:00 horas");
                                            segundoPartido.Imprimir();
                                            break;
                                        case 3:
                                            ListaCalendario tercPartido = new ListaCalendario();

                                            tercPartido.Insertar("Colombia vs Grecia Fecha 14/06/2014 | 13:00 horas "
                                                    + "\n Uruguay vs Costa Rica Fecha 14/06/2014 | 16:00 horas"
                                                    + "\n Inglaterra  vs Italia Fecha 14/06/2014 | 18:00 horas"
                                                    + "\n Costa de Marfil vs Japon 14/06/2014 | 22:00 horas");
                                            tercPartido.Imprimir();
                                            break;
                                        case 4:
                                            ListaCalendario cuarPartido = new ListaCalendario();

                                            cuarPartido.Insertar("Suiza vs Ecuador Fecha 15/06/2014 | 13:00 horas "
                                                    + "\n Francia vs Honduras Fecha 15/06/2014 | 16:00 horas"
                                                    + "\n Argentina vs Bosnia y Herzegovina Fecha 15/06/2014 | 19:00 horas");
                                            cuarPartido.Imprimir();
                                            break;
                                        case 5:
                                            ListaCalendario ciPartido = new ListaCalendario();

                                            ciPartido.Insertar("Alemania vs Portugal Fecha 16/06/2014 | 13:00 horas "
                                                    + "\n Iran vs Nigeria Fecha 16/06/2014 | 16:00 horas"
                                                    + "\n Ghana vs EEUU Fecha 16/06/2014 | 18:00 horas");
                                            ciPartido.Imprimir();
                                            break;
                                        case 6:
                                            ListaCalendario sixPartido = new ListaCalendario();

                                            sixPartido.Insertar("Belgica vs Argelia Fecha 17/06/2014 | 13:00 horas "
                                                    + "\n Brazil vs Mexico Fecha 17/06/2014 | 16:00 horas"
                                                    + "\n Rusia vs Republica checa Fecha 17/06/2014 | 19:00 horas");
                                            sixPartido.Imprimir();
                                            break;
                                        case 7:
                                            ListaCalendario sevPartido = new ListaCalendario();

                                            sevPartido.Insertar("Australia vs Holanda Fecha 18/06/2014 | 13:00 horas "
                                                    + "\n España vs chile Fecha 18/06/2014 | 16:00 horas"
                                                    + "\n Camerun vs Croacia Fecha 18/06/2014 | 18:00 horas");
                                            sevPartido.Imprimir();
                                            break;
                                        case 8:
                                            ListaCalendario octPartido = new ListaCalendario();

                                            octPartido.Insertar("Colombia vs Costa de Marfil Fecha 19/06/2014 | 13:00 horas "
                                                    + "\n Uruguay vs Inglaterra Fecha 19/06/2014 | 16:00 horas"
                                                    + "\n Japon vs Grecia Fecha 19/06/2014 | 19:00 horas");
                                            octPartido.Imprimir();
                                            break;
                                        case 9:
                                            ListaCalendario ninPartido = new ListaCalendario();

                                            ninPartido.Insertar("Italia vs Costa Rica Fecha 20/06/2014 | 13:00 horas "
                                                    + "\n Suiza vs Francia Fecha 20/06/2014 | 16:00 horas"
                                                    + "\n Honduras vs Ecuador Fecha 20/06/2014 | 18:00 horas");
                                            ninPartido.Imprimir();
                                            break;
                                        case 10:
                                            ListaCalendario tenPartido = new ListaCalendario();

                                            tenPartido.Insertar("Argentina vs Iran Fecha 21/06/2014 | 13:00 horas "
                                                    + "\n Alemania vs Ghana Fecha 21/06/2014 | 16:00 horas"
                                                    + "\n Nigeria vs Bosnia y Herzegovina Fecha 21/06/2014 | 18:00 horas");
                                            tenPartido.Imprimir();
                                            break;
                                        case 11:
                                            ListaCalendario oncPartido = new ListaCalendario();

                                            oncPartido.Insertar("Belgica vs Rusia Fecha 22/06/2014 | 13:00 horas "
                                                    + "\n Republica de korea vs Argelia Fecha 22/06/2014 | 16:00 horas"
                                                    + "\n EEUU vs Portugal Fecha 22/06/2014 | 18:00 horas");
                                            oncPartido.Imprimir();
                                            break;
                                        case 12:
                                            ListaCalendario docPartido = new ListaCalendario();

                                            docPartido.Insertar("Holanda vs Chile Fecha 23/06/2014 | 13:00 horas "
                                                    + "\n Australia vs España Fecha 23/06/2014 | 13:00 horas"
                                                    + "\n Camerun vs Brazil Fecha 23/06/2014 | 17:00 horas"
                                                    + "\n Croacia vs Mexico Fecha 23/06/2014 | 17:00 horas");
                                            docPartido.Imprimir();
                                            break;
                                        case 13:
                                            ListaCalendario trecPartido = new ListaCalendario();

                                            trecPartido.Insertar("Italia vs Uruguay Fecha 24/06/2014 | 13:00 horas "
                                                    + "\n Costa Rica vs Inglaterra Fecha 24/06/2014 | 13:00 horas"
                                                    + "\n Japon vs Colombia Fecha 24/06/2014 | 16:00 horas"
                                                    + "\n Gracia vs Costa de Marfil Fecha 24/06/2014 | 17:00 horas");
                                            trecPartido.Imprimir();
                                            break;
                                        case 14:
                                            ListaCalendario catPartido = new ListaCalendario();

                                            catPartido.Insertar("Nigeria vs Argentina Fecha 25/06/2014 | 13:00 horas "
                                                    + "\n Bosnia y Herzagovina vs Iran Fecha 25/06/2014 | 13:00 horas"
                                                    + "\n Honduras vs Suiza Fecha 25/06/2014 | 16:00 horas"
                                                    + "\n Ecuador vs Francia Fecha 25/06/2014 | 17:00 horas");
                                            catPartido.Imprimir();
                                            break;
                                        case 15:
                                            ListaCalendario quiPartido = new ListaCalendario();

                                            quiPartido.Insertar("Portugal vs Ghana Fecha 26/06/2014 | 13:00 horas "
                                                    + "\n EEUU vs Alemania Fecha 26/06/2014 | 13:00 horas"
                                                    + "\n Republica de korea vs Belgica Fecha 26/06/2014 | 17:00 horas"
                                                    + "\n Argelia vs Rusia Fecha 26/06/2014 | 17:00 horas");
                                            quiPartido.Imprimir();
                                            break;
                                        case 16:
                                            ListaCalendario diePartido = new ListaCalendario();

                                            diePartido.Insertar("Brazil vs Chile Fecha 28/06/2014 | 13:00 horas "
                                                    + "\n Colombia vs Uruguay Fecha 28/06/2014 | 17:00 horas");
                                            diePartido.Imprimir();
                                            break;
                                        case 17:
                                            ListaCalendario diesPartido = new ListaCalendario();

                                            diesPartido.Insertar("Holanda vs Mexico Fecha 29/06/2014 | 13:00 horas "
                                                    + "\n Costa Rica vs Gracia Fecha 29/06/2014 | 17:00 horas");

                                            diesPartido.Imprimir();
                                            break;
                                        case 18:
                                            ListaCalendario dieocPartido = new ListaCalendario();

                                            dieocPartido.Insertar("Francia vs Nigeria Fecha 30/06/2014 | 13:00 horas "
                                                    + "\n Alemania vs Argelia Fecha 30/06/2014 | 17:00 horas");

                                            dieocPartido.Imprimir();
                                            break;
                                        case 19:
                                            ListaCalendario dienuPartido = new ListaCalendario();

                                            dienuPartido.Insertar("Argentina vs Suiza Fecha 01/06/2014 | 13:00 horas "
                                                    + "\n Belgica vs EEUU Fecha 01/06/2014 | 17:00 horas");

                                            dienuPartido.Imprimir();
                                            break;
                                        case 20:
                                            ListaCalendario vePartido = new ListaCalendario();

                                            vePartido.Insertar("Francia vs Alemania Fecha 04/06/2014 | 13:00 horas "
                                                    + "\n Brazil vs Colombia Fecha 04/06/2014 | 17:00 horas");

                                            vePartido.Imprimir();
                                            break;
                                        case 21:
                                            ListaCalendario veunoPartido = new ListaCalendario();

                                            veunoPartido.Insertar("Argentina vs Belgica Fecha 05/06/2014 | 13:00 horas "
                                                    + "\n Holanda vs Costa Rica Fecha 05/06/2014 | 17:00 horas");

                                            veunoPartido.Imprimir();
                                            break;
                                        case 22:
                                            ListaCalendario vedosPartido = new ListaCalendario();

                                            vedosPartido.Insertar("Bazil vs Alemania Fecha 08/06/2014 | 17:00 horas ");

                                            vedosPartido.Imprimir();
                                            break;
                                        case 23:
                                            ListaCalendario vetresPartido = new ListaCalendario();

                                            vetresPartido.Insertar("Holanda vs Argentina Fecha 09/06/2014 | 17:00 horas ");

                                            vetresPartido.Imprimir();
                                            break;
                                        case 24:
                                            ListaCalendario vecuaPartido = new ListaCalendario();

                                            vecuaPartido.Insertar("Brazil vs Holanda Fecha 12/06/2014 | 16:00 horas ");

                                            vecuaPartido.Imprimir();
                                            break;
                                        case 25:
                                            ListaCalendario vecinqPartido = new ListaCalendario();

                                            vecinqPartido.Insertar("Alemania vs Argentina Fecha 13/06/2014 | 16:00 horas ");
                                            
                                            vecinqPartido.Imprimir();
                                            System.out.println("Alemania Ganador");
                                            break;*/

                                    }
                                System.out.println("Desea continuar con otra operacion de la Sub lista  S/N : ");
                                    c = teclado.nextLine().charAt(0);
                         } while (c == 'S' || c == 's');
                        break;

            }
            System.out.println("Desea continuar con otra operacion de la Lista  S/N :  ");
            c = teclado.nextLine().charAt(0);
        } while (c == 'S' || c == 's');



    }
}
