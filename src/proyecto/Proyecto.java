package proyecto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javafx.scene.input.KeyCode;

public class Proyecto extends JFrame implements ActionListener, KeyListener {

    JPanel j = new JPanel();
    JPanel j1 = new JPanel();

    JLabel l = new JLabel("Nombre: ");
    JTextField t = new JTextField(15);

    JButton b = new JButton("Ingresar");

    public Proyecto() {
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(600, 200);
        this.setVisible(true);
        this.b.addActionListener(this);
        this.t.addKeyListener(this);

        j1.setLayout(new BoxLayout(j1, BoxLayout.Y_AXIS));
        j.add(l);
        j.add(t);
        j.add(b);
        j.add(j1);
        add(j);

        ImageIcon logo = new ImageIcon("Logo.png");

    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if (this.t.getText().equals("")) {
            System.out.println("error");
        } else {
            if (e.getSource() == this.b) {
                this.dispose();
                new Proyecto2();
            }
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (this.t.getText().equals("")) {
                System.out.println("error");
            } else {
                if (e.getSource() == this.t) {
                    this.dispose();
                    new Proyecto2();
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
