package proyecto_segundo_corte;
public class Proyecto_Segundo_Corte {
    public static void main(String[] args) {
        /*Uso constructores vacios ya que son entidades(personajes, jugadores, etc)
        que son nuevas y no se tiene informacion de ellas*/
        Personajes personaje1 = new Personajes();
        Jugador player1 = new Jugador();
        Enemigo nomuerto1 = new  Enemigo();
        NPC npc1 = new NPC();
        
        /*Uso constructores incompletos ya que son entidades(personajes, jugadores, etc)
        que estan en proceso de conocimiento, osea aun no tienen toda la informacion de ellas*/
        Personajes personaje2 = new Personajes("Lucian", 16);
        Jugador player2 = new Jugador("Sylas", 21, "Picaro", 'D');
        Enemigo nomuerto2 = new  Enemigo("Esqueleto", 17, "No-Muerto", false);
        NPC granjero1 = new NPC("Valeria", 73, "Mata al mago de la peste", 'P');
        
        /*Uso constructores Completos ya que son entidades(personajes, jugadores, etc)
        que son conocidas y se tiene toda la informacion de estas*/
        Personajes personaje3 = new Personajes("Selene", 32, 418, true);
        Jugador player3 = new Jugador("Ragnar", 48, 653.0, true, "Barbaro", 4297, 509.72, 'C');
        Enemigo jefe1 = new  Enemigo("Nekros", 50, 2470.0, false, "Nigromante", 1500, 68.85, true);
        NPC herrero1 = new NPC("Serah", 35, 100.0, true, "Acaba con Nekros el Nigromante", 1500, 6.4, 'C');

        System.out.println("ESTADO: DESCONOCIDOS");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(personaje1);
        System.out.println("---------------------------------------------------");
        System.out.println(player1);
        System.out.println("---------------------------------------------------");
        System.out.println(nomuerto1);
        System.out.println("---------------------------------------------------");
        System.out.println(npc1);
        System.out.println("***************************************************");
        
        System.out.println("ESTADO: BUSCANDO INFORMACION");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(personaje2);
        System.out.println("---------------------------------------------------");
        System.out.println(player2);
        System.out.println("---------------------------------------------------");
        System.out.println(nomuerto2);
        System.out.println("---------------------------------------------------");
        System.out.println(granjero1);
        System.out.println("");
        System.out.println("***************************************************");
        
        System.out.println("ESTADO: IDENTIFICADO");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(personaje3);
        System.out.println("---------------------------------------------------");
        System.out.println(player3);
        System.out.println("---------------------------------------------------");
        System.out.println(jefe1);
        System.out.println("---------------------------------------------------");
        System.out.println(herrero1);
        System.out.println("***************************************************");
    }    
}
