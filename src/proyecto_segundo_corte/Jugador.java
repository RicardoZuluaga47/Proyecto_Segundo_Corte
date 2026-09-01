package proyecto_segundo_corte;
public class Jugador extends Personajes{
    private String clase;
    private int dinero;
    private double xp;
    private char rango;
    
    public Jugador(String nombre, int nivel, double vida, boolean vivo, String clase, int dinero, double xp, char rango){
        super(nombre, nivel, vida, vivo);
        this.clase = clase;
        this.dinero = dinero;
        this.xp = xp;
        this.rango = rango;
    }
    
    public Jugador(String nombre, int nivel, String clase, char rango){
        super(nombre, nivel);
        this.clase = clase;
        this.rango = rango;
        this.xp = 0;
        this.dinero = 0;
    }
    
    public Jugador(){
        this.clase = "Sin clase";
        this.rango = '/';
        this.xp = 0;
        this.dinero = 0;
    }
    
    public String getClase(){
        return clase;
    }
    public void setClase(String clase){
        this.clase = clase;
    }
    
    public int getDinero(){
        return dinero;
    }
    public void setDinero(int dinero){
        this.dinero = dinero;
    }
    
    public double getXp(){
        return xp;
    }
    public void setXp(double xp){
        this.xp = xp;
    }
    
    public char getRango(){
        return rango;
    }
    public void setRango(char rango){
        this.rango = rango;
    }
    
    @Override
    public String toString(){
        return "Jugador: "+getNombre()+"   |   Nivel: "+getNivel()+"\nVida: "+getVida()+"   |   Vivo: "+getVivo()
                +"\nClase: "+clase+"   |   Dinero: "+dinero+"\nXP: "+xp+"   |   Rango: "+rango;
    }
}
