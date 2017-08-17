package proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Proyecto2 extends JFrame implements ActionListener {

    private double sumasup, sumainf, sumacal;
    
//PANELES PRINCIPALES
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();

//PANELES DE PRENDAS
    JPanel pps = new JPanel();
    JPanel ppi = new JPanel();
    JPanel pc = new JPanel();

//PANELES DE MARCAS
    JPanel pms = new JPanel();
    JPanel pmi = new JPanel();
    JPanel pmc = new JPanel();

//PANELES DE COLORES
    JPanel pcs = new JPanel();
    JPanel pci = new JPanel();
    JPanel pcc = new JPanel();

//PANELES DE TALLES
    JPanel pts = new JPanel();
    JPanel pti = new JPanel();
    JPanel ptc = new JPanel();

//PANELES DE GENERO
    JPanel pgs = new JPanel();
    JPanel pgi = new JPanel();
    JPanel pgc = new JPanel();

//PANELES DE BOTONES
    JPanel pb = new JPanel();
    
//PANEL DE PRECIO
    JPanel ppss = new JPanel();
    JPanel ppii = new JPanel();
    JPanel ppcc = new JPanel();
    
//PANEL DE PRECIO TOTAL
    JPanel ppt = new JPanel();

//TITULO
    // Label titulo
    JLabel l = new JLabel("Bienvenido a Clothing Store!");

//JLABEL DE PRECIO TOTAL
    JButton jpt = new JButton("PRECIO TOTAL");
    JLabel lpt = new JLabel();

//COMBOBOX DE PRENDAS
    //JcomboBox de prendas superiores
    JLabel cc = new JLabel("Prenda superior");
    JComboBox c = new JComboBox(new TiposPrendas().Superior.toArray());
    //JcomboBox de prendas inferiores
    JLabel cc1 = new JLabel("Prenda inferior");
    JComboBox c1 = new JComboBox(new TiposPrendas().Inferior.toArray());
    //JcomboBox de calzados
    JLabel cc2 = new JLabel("Calzados");
    JComboBox c2 = new JComboBox(new TiposPrendas().Calzados.toArray());

//JCOMBOBOX DE MARCAS 
    //JcomboBox de marcas superiores
    JLabel lms = new JLabel("Marca:");
    JComboBox mps = new JComboBox(new TipoMarcas().MSuperior.toArray());
    //JcomboBox de marcas inferiores
    JLabel lmi = new JLabel("Marca:");
    JComboBox mpi = new JComboBox(new TipoMarcas().MInferior.toArray());
    //JcomboBox de marcas de calzados
    JLabel lc = new JLabel("Marca:");
    JComboBox mc = new JComboBox(new TipoMarcas().MCalzados.toArray());

//JCOMBOBOX DE COLORES
    JLabel ldc = new JLabel("Color:");
    JComboBox jcc = new JComboBox(new TipoColor().CSuperior.toArray());

    JLabel ldc1 = new JLabel("Color:");
    JComboBox jcc1 = new JComboBox(new TipoColor().CInferior.toArray());

    JLabel ldc2 = new JLabel("Color:");
    JComboBox jcc2 = new JComboBox(new TipoColor().CCalzados.toArray());

    //Botones 
    JButton btn = new JButton("Confirmar");
    JButton btn2;

//JCHOMBOBOX TALLE
    JLabel lts = new JLabel("Talle:");
    JComboBox cbs = new JComboBox(new TipoTalle().TSuperior.toArray());
    JLabel lti = new JLabel("Talle:");
    JComboBox cbi = new JComboBox(new TipoTalle().TInferior.toArray());
    JLabel ltc = new JLabel("Talle:");
    JComboBox cbc = new JComboBox(new TipoTalle().TCalzados.toArray());

//JCHECKBOX DE GENERO
    JCheckBox ms = new JCheckBox("Masculino");
    JCheckBox fs = new JCheckBox("Femenino");

    JCheckBox mi = new JCheckBox("Masculino");
    JCheckBox fi = new JCheckBox("Femenino");

    JCheckBox mcc = new JCheckBox("Masculino");
    JCheckBox fcc = new JCheckBox("Femenino");

//LABEL PRECIO SUPERIOR
    JLabel lps = new JLabel("Precio:");
    JLabel preciosup = new JLabel();
//LABEL PRECIO INFERIOR
    JLabel lpi = new JLabel("Precio:");
    JLabel precioinf = new JLabel();
//LABEL PRECIO CALZADOS
    JLabel lpc = new JLabel("Precio:");
    JLabel preciocal = new JLabel();

    public Proyecto2() {
        
        this.jpt.addActionListener(this);
        
        this.btn2 = new JButton("Cancelar");
        this.btn2.addActionListener(this);

        this.btn = new JButton("Confirmar");
        this.btn.addActionListener(this);

        this.mps.addActionListener(this);
        this.c.addActionListener(this);
        
        this.mpi.addActionListener(this);
        this.c1.addActionListener(this);
        
        this.mc.addActionListener(this);
        this.c2.addActionListener(this);
        this.setSize(new Dimension(1800, 400));
        setLocation(100, 150);
        this.setVisible(true);

//ORDENAMOS EL GENERO EN Y AXIS
        pgs.setLayout(new BoxLayout(pgs, BoxLayout.Y_AXIS));
        pgi.setLayout(new BoxLayout(pgi, BoxLayout.Y_AXIS));
        pgc.setLayout(new BoxLayout(pgc, BoxLayout.Y_AXIS));

        p.addNotify();

        p1.setLayout(new GridLayout(3, 6, 1, 20));
        
//AGREGAMOS EL TITULO        
        p.add(l);

//PANELES DE PRENDAS 
        pps.add(cc);
        pps.add(c);

        ppi.add(cc1);
        ppi.add(c1);

        pc.add(cc2);
        pc.add(c2);

//PANELES DE MARCAS
        pms.add(lms);
        pms.add(mps);

        pmi.add(lmi);
        pmi.add(mpi);

        pmc.add(lc);
        pmc.add(mc);

//PANELES DE COLORES
        pcs.add(ldc);
        pcs.add(jcc);

        pci.add(ldc1);
        pci.add(jcc1);

        pcc.add(ldc2);
        pcc.add(jcc2);

//PANELES DE TALLES
        pts.add(lts);
        pts.add(cbs);

        pti.add(lti);
        pti.add(cbi);

        ptc.add(ltc);
        ptc.add(cbc);

// PANELES DE GENERO
        pgs.add(ms);
        pgs.add(fs);
        pgs.add(preciosup);
        
        pgi.add(mi);
        pgi.add(fi);
        pgi.add(precioinf);
        
        pgc.add(mcc);
        pgc.add(fcc);
        pgc.add(preciocal);
// PANELES DE BOTONES
        pb.add(btn);
        pb.add(btn2);

//PANEL DE PRECIO
        ppss.add(lps);
        ppss.add(preciosup);
        
        ppii.add(lpi);
        ppii.add(precioinf);
        
        ppcc.add(lpc);
        ppcc.add(preciocal);
//PANEL DE PRECIO TOTAL
        ppt.add(jpt);
        ppt.add(lpt);

//AGREGAMOS LOS PANELES AL PANEL DEL GRID
        p1.add(pps);
        p1.add(pms);
        p1.add(pcs);
        p1.add(pts);
        p1.add(pgs);
        p1.add(ppss);
        p1.add(ppi);
        p1.add(pmi);
        p1.add(pci);
        p1.add(pti);
        p1.add(pgi);
        p1.add(ppii);
        p1.add(pc);
        p1.add(pmc);
        p1.add(pcc);
        p1.add(ptc);
        p1.add(pgc);
        p1.add(ppcc);

        p.add(p1);
        p.add(pb);
        p.add(ppt);
        Container cp = getContentPane();
        cp.add(p);

    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.btn2) {

            this.dispose();
            new Proyecto();

        } else if (e.getSource() == this.btn) {

            this.dispose();
            PrendasSeleccionadas ps = new PrendasSeleccionadas(this.c.getSelectedItem().toString(), this.c1.getSelectedItem().toString(),
                this.c2.getSelectedItem().toString(), this.mps.getSelectedItem().toString(), this.mpi.getSelectedItem().toString(), 
                this.mc.getSelectedItem().toString(), this.jcc.getSelectedItem().toString(), this.jcc1.getSelectedItem().toString(),
                this.jcc2.getSelectedItem().toString(), this.cbs.getSelectedItem().toString(), this.cbi.getSelectedItem().toString(), 
                this.cbc.getSelectedItem().toString(), this.sumasup, this.sumainf, this.sumacal);
            System.out.println(this.c.getSelectedItem().toString());
            new Proyecto3(ps);

            
        } else if (e.getSource().equals(this.mps)) {
             this.sumasup = Double.parseDouble(this.preciosup.getText()) + new TipoMarcas().modificadorPrecioS[this.mps.getSelectedIndex()];
            this.preciosup.setText(String.valueOf(sumasup));

        } else if (e.getSource().equals(this.c)) {
            this.preciosup.setText(String.valueOf(new TiposPrendas().modificadorPrecioPS[this.c.getSelectedIndex()]));
        
            
        
        } else if (e.getSource().equals(this.mpi)) {
            this.sumainf = Double.parseDouble(this.precioinf.getText()) + new TipoMarcas().modificadorPrecioI[this.mpi.getSelectedIndex()];
            this.precioinf.setText(String.valueOf(sumainf));

        } else if (e.getSource().equals(this.c1)) {
            this.precioinf.setText(String.valueOf(new TiposPrendas().modificadorPrecioPI[this.c1.getSelectedIndex()]));
        
            
            
        } else if (e.getSource().equals(this.mc)) {
            this.sumacal = Double.parseDouble(this.preciocal.getText()) + new TipoMarcas().modificadorPrecioC[this.mc.getSelectedIndex()];
            this.preciocal.setText(String.valueOf(sumacal));

        } else if (e.getSource().equals(this.c2)) {
            this.preciocal.setText(String.valueOf(new TiposPrendas().modificadorPrecioPC[this.c2.getSelectedIndex()]));
        
                   

        }else if (e.getSource().equals(this.jpt)) {
          this.lpt.setText(String.valueOf(Sumatotal()));
        }
    } public double Sumatotal(){
        double  Sumat = Double.valueOf(this.preciosup.getText()) + Double.valueOf(this.precioinf.getText()) + Double.valueOf(this.preciocal.getText());
        return Sumat;
       
    }


}