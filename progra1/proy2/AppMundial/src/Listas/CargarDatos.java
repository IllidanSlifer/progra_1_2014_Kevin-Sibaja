/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author juan jose
 *
 */
public class CargarDatos {

    static ListaEquipo equipos = new ListaEquipo();
    

    public static void CargarJugador() {
        ListaJugador alemania = new ListaJugador();
        alemania.Insertar("Klose", 36);
        alemania.Insertar("Luka", 26);
        alemania.Insertar("Reus", 23);
        equipos.Insertar("Alemania", alemania);

        ListaJugador costaRica = new ListaJugador();
        costaRica.Insertar("Campbell", 21);
        costaRica.Insertar("Ruiz", 27);
        costaRica.Insertar("Navas", 26);
        costaRica.Insertar("Duarte", 25);
        equipos.Insertar("Costa Rica", costaRica);

        ListaJugador argentina = new ListaJugador();
        argentina.Insertar("Messi", 27);
        argentina.Insertar("Angel Di Maria", 26);
        argentina.Insertar("Gonzalo Higuain", 29);
        equipos.Insertar("Argentina", argentina);

        ListaJugador usa = new ListaJugador();
        usa.Insertar("Tim Howard", 35);
        usa.Insertar("Michael Bradley", 29);
        usa.Insertar("Brad Davis", 32);
        equipos.Insertar("USA", usa);

        ListaJugador belgica = new ListaJugador();
        belgica.Insertar("Eden Hazard", 23);
        belgica.Insertar("Thibaut Courtois", 22);
        belgica.Insertar("Nicolas Lombaerts", 29);
        equipos.Insertar("Belgica", belgica);

        ListaJugador argelia = new ListaJugador();
        argelia.Insertar("Mehdi Mostefa", 30);
        argelia.Insertar("Yacine Brahimi", 29);
        argelia.Insertar("Mahamed Zemmamouche", 26);
        equipos.Insertar("Argelia", argelia);

        ListaJugador camerun = new ListaJugador();
        camerun.Insertar("Samuel Eto'o", 33);
        camerun.Insertar("Alexandre Song", 26);
        camerun.Insertar("Joël Matip", 22);
        equipos.Insertar("Camerun", camerun);

        ListaJugador costademarfil = new ListaJugador();
        costademarfil.Insertar("Didier Drogba", 36);
        costademarfil.Insertar("Yaya Toure", 31);
        costademarfil.Insertar("Wilfried Bony", 25);
        equipos.Insertar("Costa de Marfil", costademarfil);

        ListaJugador ghana = new ListaJugador();
        ghana.Insertar("Kevin-Prince Boateng", 27);
        ghana.Insertar("Michael Essien", 31);
        ghana.Insertar("Majeed Waris", 22);
        equipos.Insertar("Ghana", ghana);

        ListaJugador australia = new ListaJugador();
        australia.Insertar("Tim Cahill", 34);
        australia.Insertar("James Troisi", 26);
        australia.Insertar("Ryan McGowan", 24);
        equipos.Insertar("Australia", australia);

        ListaJugador iran = new ListaJugador();
        iran.Insertar("Alireza Haghighi", 26);
        iran.Insertar("Ashkan Dejagah", 28);
        iran.Insertar("Daniel Davari", 25);
        equipos.Insertar("Iran", iran);

        ListaJugador japon = new ListaJugador();
        japon.Insertar("Oliver Atom", 20);
        japon.Insertar("Benji Price", 21);
        japon.Insertar("Andy Jhonson", 22);
        equipos.Insertar("Japon", japon);

        ListaJugador republicadekorea = new ListaJugador();
        republicadekorea.Insertar("Park Ji-Sung", 33);
        republicadekorea.Insertar("Yoo Byung-Soo", 26);
        republicadekorea.Insertar("Heung-Min Son", 22);
        equipos.Insertar("Republica de Korea", republicadekorea
        );

        ListaJugador bosniayherzegovina = new ListaJugador();
        bosniayherzegovina.Insertar("Elvir Rahimic", 38);
        bosniayherzegovina.Insertar("Edin Džeko", 28);
        bosniayherzegovina.Insertar("Zvjezdan Misimovic", 25);
        equipos.Insertar("Bosnia y Herzegovina", bosniayherzegovina
        );

        ListaJugador croacia = new ListaJugador();
        croacia.Insertar("Luka Modric", 28);
        croacia.Insertar("Ivica Olic", 34);
        croacia.Insertar("Mario Mandžukic", 29);
        equipos.Insertar("Croacia", croacia);

        ListaJugador inglaterra = new ListaJugador();
        inglaterra.Insertar("Frank Lampard", 34);
        inglaterra.Insertar("Steven Gerrard", 36);
        inglaterra.Insertar("Wayne Rooney", 38);
        equipos.Insertar("Inglaterra", inglaterra);

        ListaJugador francia = new ListaJugador();
        francia.Insertar("Karin Benzema", 26);
        francia.Insertar("Patrice Evra", 33);
        francia.Insertar("Hugo Lloris", 27);
        equipos.Insertar("Francia", francia);

        ListaJugador grecia = new ListaJugador();
        grecia.Insertar("Georgios Samaras", 29);
        grecia.Insertar("Stefanos Kapino", 20);
        grecia.Insertar("Kyriakos Papadopoulos", 22);
        equipos.Insertar("Grecia", grecia);

        ListaJugador italia = new ListaJugador();
        italia.Insertar("Andrea Pirlo", 34);
        italia.Insertar("Gianluigi Buffon", 37);
        italia.Insertar("Salvatore Bocchetti", 27);
        equipos.Insertar("Italia", italia);

        ListaJugador portugal = new ListaJugador();
        portugal.Insertar("Cristiano Ronaldo", 29);
        portugal.Insertar("Pepe", 31);
        portugal.Insertar("Nani", 27);
        equipos.Insertar("Portugal", portugal);

        ListaJugador rusia = new ListaJugador();
        rusia.Insertar("Igor Akinfeev", 28);
        rusia.Insertar("Dmitri Kombarov", 27);
        rusia.Insertar("Yevgeni Makeyev", 25);
        equipos.Insertar("Rusia", rusia);

        ListaJugador holanda = new ListaJugador();
        holanda.Insertar("Arjen Robben", 29);
        holanda.Insertar("Robin Van Persie", 31);
        holanda.Insertar("Wesley Sneijder", 30);
        equipos.Insertar("Holanda", holanda);

        ListaJugador españa = new ListaJugador();
        españa.Insertar("Iker Casillas", 34);
        españa.Insertar("David Villa", 31);
        españa.Insertar("Andres Iniesta", 32);
        equipos.Insertar("España", españa);

        ListaJugador suiza = new ListaJugador();
        suiza.Insertar("Xherdan Shaqiri", 22);
        suiza.Insertar("Diego Benaglio", 30);
        suiza.Insertar("Admir Mehmedi", 23);
        equipos.Insertar("Suiza", suiza);

        ListaJugador honduras = new ListaJugador();
        honduras.Insertar("Minor Figueroa", 28);
        honduras.Insertar("Jerry Palacios", 27);
        honduras.Insertar("Wilson Palacios", 30);
        equipos.Insertar("Honduras", honduras);

        ListaJugador mexico = new ListaJugador();
        mexico.Insertar("Guillermo Ochoa", 31);
        mexico.Insertar("Rafael Marquez", 37);
        mexico.Insertar("Javier Hernandez", 26);
        equipos.Insertar("Mexico", mexico);

        ListaJugador brazil = new ListaJugador();
        brazil.Insertar("Neymar", 24);
        brazil.Insertar("Julio Cesar", 30);
        brazil.Insertar("David Luiz", 27);
        equipos.Insertar("Brazil", brazil);

        ListaJugador chile = new ListaJugador();
        chile.Insertar("Alexis Sanches", 28);
        chile.Insertar("Arturo Vidal", 25);
        chile.Insertar("Claudio Bravo", 31);
        equipos.Insertar("Chile", chile);

        ListaJugador colombia = new ListaJugador();
        colombia.Insertar("James Rodiguez", 22);
        colombia.Insertar("Roger Cañas", 24);
        colombia.Insertar("Mario Yepes", 38);
        equipos.Insertar("Colombia", colombia);

        ListaJugador ecuador = new ListaJugador();
        ecuador.Insertar("Antonio Valencia", 29);
        ecuador.Insertar("Alexander Domínguez", 27);
        ecuador.Insertar("Édison Méndez", 25);
        equipos.Insertar("Ecuador", ecuador);

        ListaJugador uruguay = new ListaJugador();
        uruguay.Insertar("Edinson Cavani", 28);
        uruguay.Insertar("Luis Suares", 30);
        uruguay.Insertar("Diego Forlan", 32);
        equipos.Insertar("Uruguay", uruguay);

        ListaJugador nigeria = new ListaJugador();
        nigeria.Insertar("Vincent ENYEAMA", 31);
        nigeria.Insertar("Joseph YOBO", 33);
        nigeria.Insertar("Emmanuel EMENIKE", 27);
        equipos.Insertar("Nigeria", nigeria);

    }

    public static ListaEquipo CargarEquipos() {

        CargarJugador();

        return equipos;

    }

    public static ListaEstadios CargarEstadios() {

        ListaEstadios estadios = new ListaEstadios();
        estadios.Insertar("Arena Pantanal, Mato Grosso", "33 C", 4, 58170);
        estadios.Insertar("Estadio Mineirao, Belo Horizonte", "31 C", 6, 58170);
        estadios.Insertar("Estadio Castelao, Fortaleza", "32 C", 6, 60342);
        estadios.Insertar("Estadio das Dunas, Natal", "30 C", 4, 39971);
        estadios.Insertar("Arena Pernambuco, Recife", "34 C", 5, 42610);
        estadios.Insertar("Arena Fonte Nova, Salvador", "29 C", 6, 51900);
        estadios.Insertar("Estadio Nacional de Brasilia, Brasilia", "35 C", 7, 69349);
        estadios.Insertar("Arena da Baixada, Curitiba", "33 C", 4, 39631);
        estadios.Insertar("Arena Amazonia, Manaus", "29 C", 4, 40549);
        estadios.Insertar("Estadio Beira-Rio, Porto Alegre", "31 C", 4, 43394);
        estadios.Insertar("Estadio Do Maracana, Rio de Janeiro", "34 C", 7, 74738);
        estadios.Insertar("Arena de Sao Paulo, Sao Paulo", "36 C", 6, 63321);

        return estadios;
    }

}
