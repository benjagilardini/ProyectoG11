package proyecto;
import java.util.ArrayList;

public class TiposPrendas {
    
    ArrayList<String> Superior = new ArrayList<String>();
     public double[] modificadorPrecioPS = new double[]{0, 200, 150, 300,400,500,230};
    ArrayList<String> Inferior = new ArrayList<String>();
    double[] modificadorPrecioPI = new double[]{0, 500,300,300,150,200,200};
    ArrayList<String> Calzados = new ArrayList<String>();
    double[] modificadorPrecioPC = new double[]{0, 2400,2000,1500,1900,1500};
        
    
    public TiposPrendas() {
        
        this.Superior.add("_______");
        this.Superior.add("Remera");
        this.Superior.add("Camiseta");
        this.Superior.add("Camisa");
        this.Superior.add("Campera");
        this.Superior.add("buzo");
        this.Superior.add("chaleco");
        
        this.Inferior.add("_______");
        this.Inferior.add("Jean");
        this.Inferior.add("Babucha");
        this.Inferior.add("Short");
        this.Inferior.add("Calza");
        this.Inferior.add("Jogging");
        this.Inferior.add("Maya");
        
        this.Calzados.add("_______");
        this.Calzados.add("zapatillas");
        this.Calzados.add("zapatos");
        this.Calzados.add("crocs");
        this.Calzados.add("botas");
        this.Calzados.add("botines");
    }
}
