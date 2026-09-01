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
}
