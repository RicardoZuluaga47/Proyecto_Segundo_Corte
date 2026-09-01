package proyecto_segundo_corte;
public class NPC extends Personajes{
    private String mision;
    private int recompensa;
    private double dificultad;
    private char estado;
    
    public NPC(String nombre, int nivel, double vida, boolean vivo, String mision, int recompensa, double dificultad, char estado){
        super(nombre, nivel, vida, vivo);
        this.mision = mision;
        this.recompensa = recompensa;
        this.dificultad = dificultad;
        this.estado = estado;
    }
    
    public NPC(String nombre, int nivel, String mision, double dificultad){
        super(nombre, nivel);
        this.mision = mision;
        this.recompensa = 0;
        this.dificultad = dificultad;
        this.estado = '/';
    }
    
    public NPC(){
        this.mision = "Sin mision";
        this.recompensa = 0;
        this.dificultad = 0;
        this.estado = '/';
    }
}
