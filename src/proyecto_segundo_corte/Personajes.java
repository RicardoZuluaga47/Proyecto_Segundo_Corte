package proyecto_segundo_corte;
public class Personajes {
    private String nombre;
    private int nivel;
    private double vida;
    private boolean vivo;
    
    public Personajes(String nombre, int nivel, double vida, boolean vivo){
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.vivo = vivo;
    }
    
    public Personajes(String nombre, int nivel){
        this(nombre, nivel, 0, false);
    }
    
    public Personajes(){
        this("Sin nombre", 0, 0, false);
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    
    public double getVida(){
        return vida;
    }
    public void setVida(double vida){
        this.vida = vida;
    }
    
    public boolean getVivo(){
        return vivo;
    }
    public void setVivo(boolean vivo){
        this.vivo = vivo;
    }
    
    @Override
    public String toString(){
        return "Personaje: "+nombre+"   |   Nivel: "+nivel+"\nVida: "+vida+"   |   Vivo: "+vivo;
    }
}