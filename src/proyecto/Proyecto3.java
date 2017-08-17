package proyecto;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;


public class Proyecto3 extends JFrame{
   
    private PrendasSeleccionadas ps;
    
    JPanel p = new JPanel();
    
    JPanel panelfondo = new JPanel();
    
    JPanel pprenda = new JPanel();
    JPanel pmarca = new JPanel();
    JPanel pcolor = new JPanel();
    JPanel ptalle = new JPanel();
    JPanel pprecio = new JPanel();
    
    JLabel jlprendasup = new JLabel();
    JLabel jlmarcasup = new JLabel();
    JLabel jlcolorsup = new JLabel();
    JLabel jltallesup = new JLabel();
    JLabel jlpreciosup = new JLabel();
    
    JLabel jlprendainf = new JLabel();
    JLabel jlmarcainf = new JLabel();
    JLabel jlcolorinf = new JLabel();
    JLabel jltalleinf = new JLabel();
    JLabel jlprecioinf = new JLabel();
    
    JLabel jlprendacal = new JLabel();
    JLabel jlmarcacal = new JLabel();
    JLabel jlcolorcal = new JLabel();
    JLabel jltallecal = new JLabel();
    JLabel jlpreciocal = new JLabel();
    
    JButton btnC = new JButton("Cancelar");
    JButton btnA = new JButton("Comprar");
    
    public Proyecto3(PrendasSeleccionadas ps) {
        System.out.println("Ventana en construccion");
        this.setSize(new Dimension (600, 400));
        setLocation(400, 150);
        this.setVisible(true);
        
        pprenda.setLayout(new BoxLayout(pprenda, BoxLayout.Y_AXIS));
        pmarca.setLayout(new BoxLayout(pmarca, BoxLayout.Y_AXIS));
        pcolor.setLayout(new BoxLayout(pcolor, BoxLayout.Y_AXIS));
        ptalle.setLayout(new BoxLayout(ptalle, BoxLayout.Y_AXIS));
        pprecio.setLayout(new BoxLayout(pprecio, BoxLayout.Y_AXIS));
        
        pprenda.setPreferredSize(new Dimension(100, 100));
        pmarca.setPreferredSize(new Dimension(100, 100));
        pcolor.setPreferredSize(new Dimension(100, 100));
        ptalle.setPreferredSize(new Dimension(100, 100));
        pprecio.setPreferredSize(new Dimension(100, 100));
        
        this.ps = ps;
        pprenda.add(jlprendasup);
        pprenda.add(jlprendainf);
        pprenda.add(jlprendacal);
        
        pmarca.add(jlmarcasup);
        pmarca.add(jlmarcainf);
        pmarca.add(jlmarcacal);
        
        pcolor.add(jlcolorsup);
        pcolor.add(jlcolorinf);
        pcolor.add(jlcolorcal);
        
        ptalle.add(jltallesup);
        ptalle.add(jltalleinf);
        ptalle.add(jltallecal);
        
        pprecio.add(jlpreciosup);
        pprecio.add(jlprecioinf);
        pprecio.add(jlpreciocal);
        
        p.add(pprenda);
        p.add(pmarca);
        p.add(pcolor);
        p.add(ptalle);
        p.add(pprecio);
        
        p.add(btnA);
        p.add(btnC);
        Container cp = getContentPane();
        cp.add(p);
        
        this.jlprendasup.setText(ps.getPrendaSuperiores());
        this.jlprendainf.setText(ps.getPrendaInferior());
        this.jlprendacal.setText(ps.getCalzados());
        
        this.jlmarcasup.setText(ps.getMarcaSuperiores());
        this.jlmarcainf.setText(ps.getMarcaInferiores());
        this.jlmarcacal.setText(ps.getMarcaCalzados());
        
        this.jlcolorsup.setText(ps.getColorSuperior());
        this.jlcolorinf.setText(ps.getColorInferior());
        this.jlcolorcal.setText(ps.getColorCalzado());
        
        this.jltallesup.setText(ps.getTallaSuperior());
        this.jltalleinf.setText(ps.getTallaInferior());
        this.jltallecal.setText(ps.getTallaCalzado());
        
        this.jlpreciosup.setText(ps.getPrecioSuperior() + "");
        this.jlprecioinf.setText(ps.getPrecioInferior() + "");
        this.jlpreciocal.setText(ps.getPrecioCalzado() + "");
    }
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.btnC) {

            this.dispose();
            new Proyecto2();
        
        }
    }
}