/*
 APPMUNDIAL 2014, NOS FACILITA OPCIONES COMO CALENDARIOS, MARCADORES, TABLA DE POSICIONES,
 GRUPOS CON SUS RESPECTIVOS EQUIPOS, GOLEADORES, ETC.
 */
package appmundial;

import Listas.CargarDatos;
import Nodos.NodoGoleadores;
import Listas.ListaGrupos;
import Listas.ListaEstadios;
import Listas.ListaGoleadores;
import Listas.ListaEquipo;
import Listas.ListaJugador;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Jose y Kevin
 */
public class AppMundial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        JOptionPane.showMessageDialog(null, "MUNDIAL BRAZIL 2014");
        //VARIABLES DE LOS MENUS(SWITCH)
        int opc = -1;
        int opc0;
        int opc1;
        int opc2;
        int opc3;
        int opc4;
        int opc5;
        int opc6;
        int opc10;
        int opc11;
        int opc12;
        int opc13;
        int opc14;
        int opc15;
        int opc16;
        int opc17;
        int opc18;
        int opc19;
        int opc20;
        int opc21;
//LISTA DE ESTADIOS.

        ListaEquipo equipos = CargarDatos.CargarEquipos();

        ListaJugador jugador = new ListaJugador();

        ListaEstadios estadios = CargarDatos.CargarEstadios();

        do {//INICIO DE CICLO PARA EL MENU PRINCIPAL
            try {//VALIDACION DE ESPACIOS EN BLANCO.

                opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL"
                        + "\n1: ACTUALIZACION DE INFORMACION."
                        + "\n2: CONSULTAS."
                        + "\n3: REPORTES."
                        + "\n0: SALIR."));
                switch (opc) {
                    case 1:
                        int opjuga = 0;
                        //MENU PARA ACTUALIZACION DE DATOS.
                        opjuga = Integer.parseInt(JOptionPane.showInputDialog("SUB MENU MODIFICAR INFO"
                                + "\n1: Modificar Jugador."
                                + "\n2: Modificar Estadio."));

                        switch (opjuga) {
                            case 1:
                                int edad = 0;
                                String nombre = "";
                                String nuevonombre = "";
                                String equipo = "";

                                do {//CICLO PARA ENTRAR AL MENU DE ACTUALIZAR JUGADOR(MODIFICAR, AGREGAR O ELIMINAR).
                                    opjuga = Integer.parseInt(JOptionPane.showInputDialog("\n1:"
                                            + "Modificar Jugador" + "\n2: Agregar Jugador" + "\n3: Eliminar Jugador"
                                            + "\n0: Salir"));

                                    switch (opjuga) {
                                        case 1:

                                            equipo = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL EQUIPO QUE BUSCA");
                                            nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL JUGADOR QUE BUSCA");
                                            nuevonombre = JOptionPane.showInputDialog("DIGITE EL NUEVO NOMBRE DEL JUGADOR");
                                            edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD DEL JUGADOR"));
                                            jugador.ModificarJugador(equipo, nombre, nuevonombre, edad);
                                            jugador.ImprimirNombre(equipo, nuevonombre);
                                            break;
                                        case 2:
                                            equipo = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL EQUIPO QUE BUSCA");
                                            nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL JUGADOR QUE DESEA INGRESAR");
                                            edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD DEL JUGADOR"));
                                            nuevonombre=JOptionPane.showInputDialog("");
                                            jugador.Insertar(nombre, edad);
                                            jugador.ImprimirNombre(equipo, nombre);
                                             jugador.ModificarJugador(equipo, nombre, nuevonombre, edad);
                                            jugador.Agregar(nombre, edad);
                                            
                                            

                                            break;
                                        case 3:
                                            equipo = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL EQUIPO QUE BUSCA");
                                            nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL JUGADOR QUE DESEA ELIMINAR");
                                            jugador.EliminarJugador(equipo, nombre);
                                            jugador.ModificarJugador(equipo, nombre, nuevonombre, edad);
                                            jugador.ImprimirNombre(equipo, nombre);
                                            break;
                                    }

                                } while (opjuga != 0);
                                break;

                            case 2:// CASO PARA MODIFICAR ESTADIOS.

                                estadios.Imprimir();
                                int cantidadPersonas = 0;
                                nuevonombre = "";

                                nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL ESTADIO A BUSCAR");
                                nuevonombre = JOptionPane.showInputDialog("DIGITE EL NUEVO NOMBRE DEL ESTADIO");
                                cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE PERSONAS"));
                                estadios.ModificarEstadio(nombre, nuevonombre, cantidadPersonas);
                                break;

                        }

                        break;

                    case 2:
                        do {//CICLO PARA CONSULTAS.
                            opc10 = Integer.parseInt(JOptionPane.showInputDialog("SUBMENU DE CONSULTAS"
                                    + "\n1: Resultado de partidos."
                                    + "\n2: Jugador mas joven."
                                    + "\n3: Jugador mas viejo"
                                    + "\n0: REGRESAR."));
                            switch (opc10) {
                                case 1:
                                    do {
                                         opc10 = Integer.parseInt(JOptionPane.showInputDialog(""));
                                        JOptionPane.showInputDialog("Sub lista"
                                                + "Digite el numero de lo que desea hacer:"
                                                + "\n1: Jugador mas Joven de un equipo."
                                                + "\n2: Jugador mas Viejo de un equipo."
                                                + "\n3: Resultado de un partido."
                                                + "\n0: REGRESAR.");
                                       
                                        switch (opc10) {
                                            case 1:
                                                jugador.jugadorJoven(jugador);
                                                equipos.Insertar(null, jugador);
                                                JOptionPane.showInputDialog("Jugador mas Joven de un equipo (x)");
                                                break;
                                            case 2:
                                                jugador.jugadorViejo(jugador);
                                                equipos.Insertar(null, jugador);
                                                JOptionPane.showInputDialog("Jugador mas Viejo de un equipo (x)");
                                                break;
                                            case 3:
                                                
                                                JOptionPane.showInputDialog("Resultado de un partido (x)");
                                                break;
                                        }
                                    } while (opc10 != 0);
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                            }

                        } while (opc10 != 0);

                        break;
                    case 3:
                        do {//CICLO PARA SUBMENU DE REPORTES.
                            opc0 = Integer.parseInt(JOptionPane.showInputDialog("SUBMENU DE REPORTES"
                                    + "\n1: ESTADIOS."
                                    + "\n2: EQUIPOS."
                                    + "\n3: GRUPOS."
                                    + "\n4: GOLEADORES."
                                    + "\n5: CALENDARIOS."
                                    + "\n6: TABLA DE POSICIONES"
                                    + "\n0: REGRESAR."));
                            switch (opc0) {
                                case 1:
                                    do {//CICLO PARA SUBMENU DE ESTADIOS

                                        opc1 = Integer.parseInt(JOptionPane.showInputDialog(" SUBMENU DE ESTADIOS " + "\n"
                                                + estadios.toStringNombre()));
                                        switch (opc1) {
                                            case 1:
                                                estadios.toStringPosicion(opc1);
                                                break;

                                            case 2:
                                                estadios.toStringPosicion(opc1);
                                                break;

                                            case 3:
                                                estadios.toStringPosicion(opc1);
                                                break;

                                            case 4:
                                                estadios.toStringPosicion(opc1);
                                                break;

                                            case 5:
                                                estadios.toStringPosicion(opc1);
                                                break;

                                            case 6:
                                                estadios.toStringPosicion(opc1);
                                                break;

                                            case 7:
                                                estadios.toStringPosicion(opc1);
                                                break;

                                            case 8:
                                                estadios.toStringPosicion(opc1);
                                                break;

                                            case 9:
                                                estadios.toStringPosicion(opc1);
                                                break;

                                            case 10:
                                                estadios.toStringPosicion(opc1);
                                                break;

                                            case 11:
                                                estadios.toStringPosicion(opc1);
                                                break;

                                            case 12:
                                                estadios.toStringPosicion(opc1);
                                                break;
                                        }

                                    } while (opc1 != 0);
                                    break;
                                case 2:
                                    do {//MENU PARA VER LOS EQUIPOS CON SUS JUGADORES.

                                        String equipo = null;

                                        opc2 = Integer.parseInt(JOptionPane.showInputDialog(" SUBMENU DE EQUIPOS"
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
                                                + "\n0:   REGRESAR."));

                                        switch (opc2) {

                                            case 1:

                                                equipo = "Alemania";
                                                break;
                                            case 2:

                                                equipo = "Costa Rica";
                                                break;
                                            case 3:

                                                equipo = "Argentina";
                                                break;
                                            case 4:

                                                equipo = "USA";
                                                break;
                                            case 5:
                                                equipo = "Belgica";
                                                break;
                                            case 6:
                                                equipo = "Argelia";
                                                break;
                                            case 7:
                                                equipo = "Camerun";
                                                break;
                                            case 8:
                                                equipo = "Costa de Marfil";
                                                break;
                                            case 9:
                                                equipo = "Ghana";
                                                break;
                                            case 10:
                                                equipo = "Australia";
                                                break;
                                            case 11:
                                                equipo = "Iran";
                                                break;
                                            case 12:
                                                equipo = "Japon";
                                                break;
                                            case 13:
                                                equipo = "Republica de Korea";
                                                break;
                                            case 14:
                                                equipo = "Bosnia y Herzegovina";
                                                break;
                                            case 15:
                                                equipo = "Croacia";
                                                break;
                                            case 16:
                                                equipo = "Inglaterra";
                                                break;
                                            case 17:
                                                equipo = "Francia";
                                                break;
                                            case 18:
                                                equipo = "Grecia";
                                                break;
                                            case 19:

                                                equipo = "Italia";
                                                break;
                                            case 20:
                                                equipo = "Portugal";
                                                break;
                                            case 21:

                                                equipo = "Rusia";
                                                break;
                                            case 22:
                                                equipo = "Holanda";

                                                break;
                                            case 23:
                                                equipo = "España";
                                                break;
                                            case 24:

                                                equipo = "Suiza";
                                                break;
                                            case 25:
                                                equipo = "Honduras";
                                                break;
                                            case 26:
                                                equipo = "Mexico";
                                                break;
                                            case 27:
                                                equipo = "Brazil";
                                                break;
                                            case 28:
                                                equipo = "Chile";
                                                break;
                                            case 29:
                                                equipo = "Colombia";
                                                break;
                                            case 30:
                                                equipo = "Ecuador";
                                                break;
                                            case 31:
                                                equipo = "Uruguay";

                                                break;
                                            case 32:
                                                equipo = "Nigeria";
                                                break;

                                        }
                                        equipos.Imprimir(equipo);

                                    } while (opc2 != 0);
                                    break;
                                case 3:
                                    do {//MENU SOLO PARA VER LOS EQUIPOS EN SUS RESPECTIVOS GRUPOS.
                                        opc3 = Integer.parseInt(JOptionPane.showInputDialog("SUBMENU GRUPOS"
                                                + "\n1: Grupo A."
                                                + "\n2: Grupo B."
                                                + "\n3: Grupo C."
                                                + "\n4: Grupo D."
                                                + "\n5: Grupo E."
                                                + "\n6: Grupo F."
                                                + "\n7: Grupo G."
                                                + "\n8: Grupo H."
                                                + "\n0: REGRESAR."));

                                        switch (opc3) {
                                            case 1:
                                                ListaGrupos grupoA = new ListaGrupos();
                                                grupoA.Insertar("Grupo A" + "\n\nBrazil" + "\nMexico" + "\nCroacia" + "\nCamerun");
                                                grupoA.Imprimir();
                                                break;
                                            case 2:
                                                ListaGrupos grupoB = new ListaGrupos();
                                                grupoB.Insertar("Grupo B" + "\n\nHolanda" + "\nChile" + "\nEspaña" + "\nAustralia");
                                                grupoB.Imprimir();
                                                break;
                                            case 3:
                                                ListaGrupos grupoC = new ListaGrupos();
                                                grupoC.Insertar("Grupo C" + "\n\nColombia" + "\nGrecia" + "\nCosta de Marfil" + "\nJapon");
                                                grupoC.Imprimir();
                                                break;
                                            case 4:
                                                ListaGrupos grupoD = new ListaGrupos();
                                                grupoD.Insertar("Grupo D" + "\n\nCosta Rica" + "\nUruguay" + "\nItalia" + "\nInglaterra");
                                                grupoD.Imprimir();
                                                break;
                                            case 5:
                                                ListaGrupos grupoE = new ListaGrupos();
                                                grupoE.Insertar("Grupo E" + "\n\nFrancia" + "\nSuiza" + "\nEcuador" + "\nHonduras");
                                                grupoE.Imprimir();
                                                break;
                                            case 6:
                                                ListaGrupos grupoF = new ListaGrupos();
                                                grupoF.Insertar("Grupo F" + "\n\nArgentina" + "\nNigeria" + "\nBosnia y Herzegovina" + "\nIran");
                                                grupoF.Imprimir();
                                                break;
                                            case 7:
                                                ListaGrupos grupoG = new ListaGrupos();
                                                grupoG.Insertar("Grupo G" + "\n\nAlemania" + "\nEEUU" + "\nPortugal" + "\nGhana");
                                                grupoG.Imprimir();
                                                break;
                                            case 8:
                                                ListaGrupos grupoH = new ListaGrupos();
                                                grupoH.Insertar("Grupo H" + "\n\nBelgica" + "\nArgelia" + "\nRusia" + "\nRepublica de Korea");
                                                grupoH.Imprimir();
                                                break;
                                        }

                                    } while (opc3 != 0);
                                    break;
                                case 4:
                                    do {//MENU PARA VER LOS MEJORES 5 GOLEADORES DEL MUNDIAL.
                                        ListaGoleadores goleadores = new ListaGoleadores();
                                        opc4 = Integer.parseInt(JOptionPane.showInputDialog("SUBMENU DE GOLEADORES"
                                                + "\n1:   Colombia."
                                                + "\n2:   Alemania."
                                                + "\n3:   Brazil."
                                                + "\n4:   Argentina."
                                                + "\n5:   Holanda."
                                                + "\n0:   REGRESAR."));
                                        switch (opc4) {
                                            case 1:
                                                NodoGoleadores GolColombia = new NodoGoleadores();
                                                GolColombia.setNombre("James RODRIGUEZ");
                                                GolColombia.setGoles(6);
                                                GolColombia.setEquipos("Colombia");
                                                goleadores.Insertar("James RODRIGUEZ", GolColombia);
                                                break;
                                            case 2:
                                                NodoGoleadores GolAlemania = new NodoGoleadores();
                                                GolAlemania.setNombre("Thomas MUELLER");
                                                GolAlemania.setGoles(5);
                                                GolAlemania.setEquipos("Alemania");
                                                goleadores.Insertar("Thomas MUELLER", GolAlemania);
                                                break;
                                            case 3:
                                                NodoGoleadores GolBrazil = new NodoGoleadores();
                                                GolBrazil.setNombre("NEYMAR");
                                                GolBrazil.setGoles(4);
                                                GolBrazil.setEquipos("Brazil");
                                                goleadores.Insertar("NEYMAR", GolBrazil);
                                                break;
                                            case 4:
                                                NodoGoleadores Golargentina = new NodoGoleadores();
                                                Golargentina.setNombre("Lionel MESSI");
                                                Golargentina.setGoles(4);
                                                Golargentina.setEquipos("Argentina");
                                                goleadores.Insertar("Lionel MESSI", Golargentina);
                                                break;
                                            case 5:
                                                NodoGoleadores GolHolanda = new NodoGoleadores();
                                                GolHolanda.setNombre("Robin VAN PERSIE");
                                                GolHolanda.setGoles(4);
                                                GolHolanda.setEquipos("Holanda");
                                                goleadores.Insertar("Robin VAN PERSIE", GolHolanda);
                                                break;

                                        }
                                        goleadores.Imprimir();

                                    } while (opc4 != 0);
                                    break;
                                case 5:
                                    do {//SUBMEN PARA VER LA INFO DE LOS CALENDARIOS, DATOS COMO FECHA, HORA, CLIMA, HUMEDAD, ETC.
                                        opc5 = Integer.parseInt(JOptionPane.showInputDialog("SUBMENU INFO DE CALENDARIOS"
                                                + "\n1: Grupo A."
                                                + "\n2: Grupo B."
                                                + "\n0: REGRESAR"));
                                        switch (opc5) {
                                            case 1:
                                                do {
                                                    opc6 = Integer.parseInt(JOptionPane.showInputDialog("SUBMENU GRUPO A"
                                                            + "\n1: Brazil."
                                                            + "\n2: Mexico."
                                                            + "\n3: Croacia."
                                                            + "\n4: Camerun."
                                                            + "\n0: REGRESAR"));
                                                    switch (opc6) {
                                                        case 1:
                                                            do {
                                                                opc11 = Integer.parseInt(JOptionPane.showInputDialog("INFO DE PARTIDOS DE BRAZIL"
                                                                        + "\n1: Primer partido."
                                                                        + "\n2: segundo partido."
                                                                        + "\n3: tercer partido."
                                                                        + "\n0: REGRESAR."));
                                                                switch (opc11) {
                                                                    case 1:
                                                                        JOptionPane.showMessageDialog(null, "Brazil (3) vs Croacia (1)" + "\nFecha: 12/jun/2014" + "\nHora: 17:00" + "\nClima: Soleado" + "\nTemparatura: 24 C°" + "\nHumedad: 63%" + "\nViento: 8m/s");
                                                                        break;
                                                                    case 2:
                                                                        JOptionPane.showMessageDialog(null, "Brazil (0) vs Mexico (0)" + "\nFecha: 17/jun/2014" + "\nHora: 16:00" + "\nClima: Nuboso" + "\nTemparatura: 28 C°" + "\nHumedad: 66%" + "\nViento: 27m/s");
                                                                        break;
                                                                    case 3:
                                                                        JOptionPane.showMessageDialog(null, "Camerun (1) vs Brazil (4)" + "\nFecha: 23/jun/2014" + "\nHora: 17:00" + "\nClima: Parcialmente Nuboso" + "\nTemparatura: 24 C°" + "\nHumedad: 57%" + "\nViento: 26m/s");
                                                                        break;
                                                                }

                                                            } while (opc11 != 0);
                                                            break;
                                                        case 2:
                                                            do {
                                                                opc12 = Integer.parseInt(JOptionPane.showInputDialog("INFO DE PARTIDOS DE MEXICO"
                                                                        + "\n1: Primer partido."
                                                                        + "\n2: segundo partido."
                                                                        + "\n3: tercer partido."
                                                                        + "\n0: REGRESAR."));
                                                                switch (opc12) {
                                                                    case 1:
                                                                        JOptionPane.showMessageDialog(null, "Mexico (1) vs Camerun (0)" + "\nFecha: 13/jun/2014" + "\nHora: 13:00" + "\nClima: Lluvia" + "\nTemparatura: 27 C°" + "\nHumedad: 65%" + "\nViento: 22m/s");
                                                                        break;
                                                                    case 2:
                                                                        JOptionPane.showMessageDialog(null, "Brazil (0) vs Mexico (0)" + "\nFecha: 17/jun/2014" + "\nHora: 16:00" + "\nClima: Nuboso" + "\nTemparatura: 28 C°" + "\nHumedad: 66%" + "\nViento: 27m/s");
                                                                        break;
                                                                    case 3:
                                                                        JOptionPane.showMessageDialog(null, "Croacia (1) vs Mexico (3)" + "\nFecha: 23/jun/2014" + "\nHora: 17:00" + "\nClima: Nuboso" + "\nTemparatura: 26 C°" + "\nHumedad: 82%" + "\nViento: 16m/s");
                                                                        break;
                                                                }

                                                            } while (opc12 != 0);
                                                            break;
                                                        case 3:
                                                            do {
                                                                opc13 = Integer.parseInt(JOptionPane.showInputDialog("INFO DE PARTIDOS DE CROACIA"
                                                                        + "\n1: Primer partido."
                                                                        + "\n2: segundo partido."
                                                                        + "\n3: tercer partido."
                                                                        + "\n0: REGRESAR."));
                                                                switch (opc13) {
                                                                    case 1:
                                                                        JOptionPane.showMessageDialog(null, "Brazil (3) vs Croacia (1)" + "\nFecha: 12/jun/2014" + "\nHora: 17:00" + "\nClima: Soleado" + "\nTemparatura: 24 C°" + "\nHumedad: 63%" + "\nViento: 8m/s");
                                                                        break;
                                                                    case 2:
                                                                        JOptionPane.showMessageDialog(null, "Camerun (0) vs Croacia (4)" + "\nFecha: 18/jun/2014" + "\nHora: 16:00" + "\nClima: Nuboso" + "\nTemparatura: 28 C°" + "\nHumedad: 66%" + "\nViento: 27m/s");
                                                                        break;
                                                                    case 3:
                                                                        JOptionPane.showMessageDialog(null, "Croacia (1) vs Mexico (3)" + "\nFecha: 23/jun/2014" + "\nHora: 17:00" + "\nClima: Nuboso" + "\nTemparatura: 24 C°" + "\nHumedad: 57%" + "\nViento: 26m/s");
                                                                        break;
                                                                }

                                                            } while (opc13 != 0);
                                                            break;
                                                        case 4:
                                                            do {
                                                                opc14 = Integer.parseInt(JOptionPane.showInputDialog("INFO DE PARTIDOS DE CAMERUN"
                                                                        + "\n1: Primer partido."
                                                                        + "\n2: segundo partido."
                                                                        + "\n3: tercer partido."
                                                                        + "\n0: REGRESAR."));
                                                                switch (opc14) {
                                                                    case 1:
                                                                        JOptionPane.showMessageDialog(null, "Mexico (1) vs Camerun (0)" + "\nFecha: 13/jun/2014" + "\nHora: 13:00" + "\nClima: Lluvia" + "\nTemparatura: 27 C°" + "\nHumedad: 65%" + "\nViento: 22m/s");

                                                                        break;
                                                                    case 2:
                                                                        JOptionPane.showMessageDialog(null, "Camerun (0) vs Croacia (4)" + "\nFecha: 18/jun/2014" + "\nHora: 16:00" + "\nClima: Nuboso" + "\nTemparatura: 28 C°" + "\nHumedad: 66%" + "\nViento: 27m/s");

                                                                        break;
                                                                    case 3:
                                                                        JOptionPane.showMessageDialog(null, "Camerun (1) vs Brazil (4)" + "\nFecha: 23/jun/2014" + "\nHora: 17:00" + "\nClima: Parcialmente Nuboso" + "\nTemparatura: 24 C°" + "\nHumedad: 57%" + "\nViento: 26m/s");

                                                                        break;
                                                                }

                                                            } while (opc14 != 0);
                                                            break;

                                                    }
                                                } while (opc6 != 0);
                                                break;
                                            case 2:
                                                do {//SUBMENU PARA VER LA INFO DE LOS CALENDARIOS, DATOS COMO FECHA, HORA, CLIMA, HUMEDAD, ETC.
                                                    opc15 = Integer.parseInt(JOptionPane.showInputDialog("SUBMENU GRUPO D"
                                                            + "\n1: Costa Rica."
                                                            + "\n2: Uruguay."
                                                            + "\n3: Italia."
                                                            + "\n4: Inglaterra."
                                                            + "\n0: REGRESAR"));
                                                    switch (opc15) {

                                                        case 1:
                                                            do {
                                                                opc16 = Integer.parseInt(JOptionPane.showInputDialog("INFO DE PARTIDOS DE COSTA RICA"
                                                                        + "\n1: Primer partido."
                                                                        + "\n2: segundo partido."
                                                                        + "\n3: tercer partido."
                                                                        + "\n0: REGRESAR."));
                                                                switch (opc16) {
                                                                    case 1:
                                                                        JOptionPane.showMessageDialog(null, "Uruguay (1) vs Costa Rica (3)" + "\nFecha: 14/jun/2014" + "\nHora: 16:00" + "\nClima: Parcialmente Nuboso" + "\nTemparatura: 30 C°" + "\nHumedad: 58%" + "\nViento: 19m/s");
                                                                        break;
                                                                    case 2:
                                                                        JOptionPane.showMessageDialog(null, "Italia (0) vs Costa Rica (1)" + "\nFecha: 20/jun/2014" + "\nHora: 16:00" + "\nClima: Nuboso" + "\nTemparatura: 28 C°" + "\nHumedad: 66%" + "\nViento: 27m/s");
                                                                        break;
                                                                    case 3:
                                                                        JOptionPane.showMessageDialog(null, "Costa Rica (0) vs Inglaterra (0)" + "\nFecha: 24/jun/2014" + "\nHora: 13:00" + "\nClima: Parcialmente Nuboso" + "\nTemparatura: 24 C°" + "\nHumedad: 57%" + "\nViento: 26m/s");
                                                                        break;
                                                                }

                                                            } while (opc16 != 0);
                                                            break;
                                                        case 2:
                                                            do {
                                                                opc17 = Integer.parseInt(JOptionPane.showInputDialog("INFO DE PARTIDOS DE URUGUAY"
                                                                        + "\n1: Primer partido."
                                                                        + "\n2: segundo partido."
                                                                        + "\n3: tercer partido."
                                                                        + "\n0: REGRESAR."));
                                                                switch (opc17) {
                                                                    case 1:
                                                                        JOptionPane.showMessageDialog(null, "Uruguay (1) vs Costa Rica (3)" + "\nFecha: 14/jun/2014" + "\nHora: 16:00" + "\nClima: Parcialmente Nuboso" + "\nTemparatura: 30 C°" + "\nHumedad: 58%" + "\nViento: 19m/s");
                                                                        break;
                                                                    case 2:
                                                                        JOptionPane.showMessageDialog(null, "Uruguay (2) vs Inglaterra (1)" + "\nFecha: 19/jun/2014" + "\nHora: 16:00" + "\nClima: Nuboso" + "\nTemparatura: 28 C°" + "\nHumedad: 66%" + "\nViento: 27m/s");
                                                                        break;
                                                                    case 3:
                                                                        JOptionPane.showMessageDialog(null, "Italia (0) vs Uruguay (1)" + "\nFecha: 24/jun/2014" + "\nHora: 13:00" + "\nClima: Parcialmente Nuboso" + "\nTemparatura: 24 C°" + "\nHumedad: 57%" + "\nViento: 26m/s");
                                                                        break;
                                                                }

                                                            } while (opc17 != 0);
                                                            break;
                                                        case 3:
                                                            do {
                                                                opc18 = Integer.parseInt(JOptionPane.showInputDialog("INFO DE PARTIDOS DE ITALIA"
                                                                        + "\n1: Primer partido."
                                                                        + "\n2: segundo partido."
                                                                        + "\n3: tercer partido."
                                                                        + "\n0: REGRESAR."));
                                                                switch (opc18) {
                                                                    case 1:
                                                                        JOptionPane.showMessageDialog(null, "Inglaterra (1) vs italia (2)" + "\nFecha: 14/jun/2014" + "\nHora: 13:00" + "\nClima: Parcialmente Nuboso" + "\nTemparatura: 30 C°" + "\nHumedad: 58%" + "\nViento: 19m/s");
                                                                        break;
                                                                    case 2:
                                                                        JOptionPane.showMessageDialog(null, "Italia (0) vs Costa Rica (1)" + "\nFecha: 20/jun/2014" + "\nHora: 16:00" + "\nClima: Nuboso" + "\nTemparatura: 28 C°" + "\nHumedad: 66%" + "\nViento: 27m/s");
                                                                        break;
                                                                    case 3:
                                                                        JOptionPane.showMessageDialog(null, "Italia (0) vs Uruguay (1)" + "\nFecha: 24/jun/2014" + "\nHora: 13:00" + "\nClima: Parcialmente Nuboso" + "\nTemparatura: 24 C°" + "\nHumedad: 57%" + "\nViento: 26m/s");
                                                                        break;
                                                                }

                                                            } while (opc18 != 0);
                                                            break;
                                                        case 4:
                                                            do {
                                                                opc19 = Integer.parseInt(JOptionPane.showInputDialog("INFO DE PARTIDOS DE INGLATERRA"
                                                                        + "\n1: Primer partido."
                                                                        + "\n2: segundo partido."
                                                                        + "\n3: tercer partido."
                                                                        + "\n0: REGRESAR."));
                                                                switch (opc19) {
                                                                    case 1:
                                                                        JOptionPane.showMessageDialog(null, "Inglaterra (1) vs italia (2)" + "\nFecha: 14/jun/2014" + "\nHora: 13:00" + "\nClima: Parcialmente Nuboso" + "\nTemparatura: 30 C°" + "\nHumedad: 58%" + "\nViento: 19m/s");
                                                                        break;
                                                                    case 2:
                                                                        JOptionPane.showMessageDialog(null, "Uruguay (2) vs Inglaterra (1)" + "\nFecha: 19/jun/2014" + "\nHora: 16:00" + "\nClima: Nuboso" + "\nTemparatura: 28 C°" + "\nHumedad: 66%" + "\nViento: 27m/s");
                                                                        break;
                                                                    case 3:
                                                                        JOptionPane.showMessageDialog(null, "Costa Rica (0) vs Inglaterra (0)" + "\nFecha: 24/jun/2014" + "\nHora: 13:00" + "\nClima: Parcialmente Nuboso" + "\nTemparatura: 24 C°" + "\nHumedad: 57%" + "\nViento: 26m/s");
                                                                        break;
                                                                }

                                                            } while (opc19 != 0);
                                                            break;

                                                    }
                                                } while (opc15 != 0);
                                                break;
                                        }
                                    } while (opc5 != 0);
                                    break;

                                case 6:
                                    do {//SUBMENU PARA VER LA TABLA DE POSICIONES DE LOS GRUPOS.(SOLO SE INCLUYEN A Y D, RAZON: SON DEMACIADOS.)
                                        opc20 = Integer.parseInt(JOptionPane.showInputDialog("SUBMENU TABLA DE POSICIONES"
                                                + "\n1: Grupo A."
                                                + "\n2: Grupo D."
                                                + "\n0: REGRESAR."));
                                        switch (opc20) {
                                            case 1:
                                                JOptionPane.showMessageDialog(null, "Grupo A" + "     " + "pj" + "     " + "PG" + "     " + "PE" + "     " + "GD" + "     " + "Pts" + "\n" + "BRA" + "            " + "3" + "        " + "2" + "        " + "1" + "       " + "" + "5" + "        " + "7" + "\n" + "MEX" + "            " + "3" + "        " + "2" + "        " + "1" + "       " + "" + "3" + "        " + "7" + "\n" + "CRO" + "            " + "3" + "        " + "1" + "        " + "0" + "       " + "" + "0" + "        " + "3" + "\n" + "CMR" + "            " + "3" + "        " + "0" + "        " + "0" + "      " + "" + "-8" + "        " + "0" + "\n");
                                                break;
                                            case 2:
                                                JOptionPane.showMessageDialog(null, "Grupo D" + "     " + "pj" + "     " + "PG" + "     " + "PE" + "     " + "GD" + "     " + "Pts" + "\n" + "CRC" + "            " + "3" + "        " + "2" + "        " + "1" + "       " + "" + "3" + "        " + "7" + "\n" + "URU" + "            " + "3" + "        " + "2" + "        " + "0" + "       " + "" + "0" + "        " + "6" + "\n" + "ITA" + "              " + "3" + "        " + "1" + "        " + "0" + "      " + "-1" + "        " + "3" + "\n" + "ENG" + "            " + "3" + "        " + "0" + "        " + "1" + "      " + "" + "-2" + "        " + "1" + "\n");

                                                break;
                                        }

                                    } while (opc20 != 0);
                                    break;

                            }

                        } while (opc0 != 0);
                        break;

                }
            } catch (Exception e) {//SIRVE PARA VALIDAR QUE SI QUEDA UN ESPACIO EN BLANCO NO DE ERROR Y VUELVA A SOLICITAR LA INFORMACION.
                JOptionPane.showMessageDialog(null, "INGRESE UNA OPCION");
            }

        } while (opc != 0);//FIN DEL CICLO DEL MENU PRINCIPAL.

    }
}
