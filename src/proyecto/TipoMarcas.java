package proyecto;
import java.util.ArrayList;

public class TipoMarcas {
    
    ArrayList<String> MSuperior = new ArrayList<String>();
    double[] modificadorPrecioS = new double[]{0,50,150,100,100,200,230,150,250,130,140,120,140};
    ArrayList<String> MInferior = new ArrayList<String>();
    double[] modificadorPrecioI = new double[]{0,50,150,200,130,100,150,120,100};
    ArrayList<String> MCalzados = new ArrayList<String>();
    double[] modificadorPrecioC = new double[]{0,50,150,200,130,100,150,120,100};
    
    
    
    public TipoMarcas() {
        
        this.MSuperior.add("_______");
        this.MSuperior.add("Nike");
        this.MSuperior.add("Adidas");
        this.MSuperior.add("Element");
        this.MSuperior.add("Columbia");
        this.MSuperior.add("North Face");
        this.MSuperior.add("Coolhaas");
        this.MSuperior.add("Lacoste");
        this.MSuperior.add("Reebook");
        this.MSuperior.add("Zimith");
        this.MSuperior.add("Ripcurl");
        this.MSuperior.add("DCshoescousa");
        
        this.MInferior.add("_______");
        this.MInferior.add("Original");
        this.MInferior.add("Nike");
        this.MInferior.add("Levis");
        this.MInferior.add("Adidas");
        this.MInferior.add("Columbia");
        this.MInferior.add("Topper");
        this.MInferior.add("Ripcurl");
        this.MInferior.add("DCshoescousa");
        
        this.MCalzados.add("_______");
        this.MCalzados.add("Original");
        this.MCalzados.add("Nike");
        this.MCalzados.add("Adidas");
        this.MCalzados.add("Topper");
        this.MCalzados.add("New Balance");
        this.MCalzados.add("Mormaii");
        this.MCalzados.add("Kevingston");
        this.MCalzados.add("Vans");
        this.MCalzados.add("DCshoescousa");
    }
  


}
    

