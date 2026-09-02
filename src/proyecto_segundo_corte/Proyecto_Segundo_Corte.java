package proyecto_segundo_corte;
public class Proyecto_Segundo_Corte {
    public static void main(String[] args) {
        Personajes personaje1 = new Personajes();
        Personajes personaje2 = new Personajes("Lucian", 16);
        Personajes personaje3 = new Personajes("Selene", 32, 418, true);
        
        Jugador player1 = new Jugador();
        Jugador player2 = new Jugador("Sylas", 21, "Picaro", 'D');
        Jugador player3 = new Jugador("Ragnar", 48, 653.0, true, "Barbaro", 4297, 509.72, 'C');
        
        Enemigo nomuerto1 = new  Enemigo();
        Enemigo nomuerto2 = new  Enemigo("Esqueleto", 17, "No-Muerto", false);
        Enemigo jefe1 = new  Enemigo("Nekros", 50, 2470.0, false, "Nigromante", 1500, 68.85, true);
        
        NPC npc1 = new NPC();
        NPC granjero1 = new NPC("Valeria", 73, "Mata al mago de la peste", 'P');
        NPC herrero1 = new NPC("Serah", 35, 100.0, true, "Acaba con Nekros el Nigromante", 1500, 6.4, 'C');
        
        //Constructores vacios, valores predeterminados
        System.out.println("ESTADO: PREDETERMINADO (SIN ASIGNACION DE VALORES)");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(personaje1);
        System.out.println("---------------------------------------------------");
        System.out.println(player1);
        System.out.println("---------------------------------------------------");
        System.out.println(nomuerto1);
        System.out.println("---------------------------------------------------");
        System.out.println(npc1);
        System.out.println("***************************************************");
        
        //Constructores incompletos, falta de conocimiento de todos los datos
        System.out.println("ESTADO: INCOMPLETO (FALTA DE VALORES)");
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
        
        //Constructores completos, todos los datos asignados correctamente
        System.out.println("ESTADO: COMPLETO");
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
