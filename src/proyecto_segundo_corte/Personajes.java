package proyecto_segundo_corte;
public class Personajes {
    private String nombre = "";
    private int nivel = 0;
    private double vida = 0;
    private boolean vivo;
    
    public Personajes(String nombre, int nivel, double vida, boolean vivo){
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.vivo = vivo;
    }
    
    public Personajes(String nombre, int nivel){
        this(nombre, nivel, 100, true);
    }
    
    public Personajes(){
        this("Sin nombre", 1, 100, true);
    }
}