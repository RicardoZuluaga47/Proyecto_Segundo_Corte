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
    
    public NPC(String nombre, int nivel, String mision, char estado){
        super(nombre, nivel);
        this.mision = mision;
        this.recompensa = 0;
        this.dificultad = 0.0;
        this.estado = estado;
    }
    
    public NPC(){
        this.mision = "Sin mision";
        this.recompensa = 0;
        this.dificultad = 0;
        this.estado = '/';
    }
    
    public String getMision(){
        return mision;
    }
    public void setMision(String mision){
        this.mision = mision;
    }
    
    public int getRecompensa(){
        return recompensa;
    }
    public void setRecompensa(int recompensa){
        this.recompensa = recompensa;
    }
    
    public double getDificultad(){
        return dificultad;
    }
    public void setDificultad(double dificultad){
        this.dificultad = dificultad;
    }
    
    public char getEstado(){
        return estado;
    }
    public void setEstado(char estado){
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return "Jugador: "+getNombre()+"   |   Nivel: "+getNivel()+"\nVida: "+getVida()+"   |   Vivo: "+getVivo()
                +"\nMision: "+mision+"   |   Recompensa: "+recompensa+"\nDificultad: "+dificultad+"   |   Estado: "+estado;
    }
}
