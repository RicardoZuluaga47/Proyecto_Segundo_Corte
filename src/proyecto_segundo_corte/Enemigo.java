package proyecto_segundo_corte;
public class Enemigo extends Personajes{
    private String raza;
    private int recompensa;
    private double daño;
    private boolean jefe;
    
    public Enemigo(String nombre, int nivel, double vida, boolean vivo, String raza, int recompensa, double daño, boolean jefe){
        super(nombre, nivel, vida, vivo);
        this.raza = raza;
        this.recompensa = recompensa;
        this.daño = daño;
        this.jefe = jefe;
    }
    
    public Enemigo(String nombre, int nivel, String raza, boolean jefe){
        super(nombre, nivel);
        this.raza = raza;
        this.recompensa = 0;
        this.daño = 0;
        this.jefe = jefe;
    }
    
    public Enemigo(){
        this.raza = "Sin raza";
        this.recompensa = 0;
        this.daño = 0;
        this.jefe = false;
    }
    
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    
    public int getRecompensa(){
        return recompensa;
    }
    public void setRecompensa(int recompensa){
        this.recompensa = recompensa;
    }
    
    public double getDaño(){
        return daño;
    }
    public void setDaño(double daño){
        this.daño = daño;
    }
    
    public boolean getJefe(){
        return jefe;
    }
    public void setJefe(boolean jefe){
        this.jefe = jefe;
    }
    
    @Override
    public String toString(){
        return "Enemigo: "+getNombre()+"   |   Nivel: "+getNivel()+"\nVida: "+getVida()+"   |   Vivo: "+getVivo()
                +"\nRaza: "+raza+"   |   Recompensa: "+recompensa+"\nDanio: "+daño+"   |   Jefe: "+jefe;
    }
}
