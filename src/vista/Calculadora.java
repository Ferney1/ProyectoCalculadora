package vista;

import java.awt.Color;
import javax.swing.*;


public class Calculadora extends JFrame  {

    // Variable
    public JButton btnSuma, btnResta, btnMult, btnDiv,
            igual, limpiar, nueve, ocho, siete, seis, cinco, cuatro, tres,
            dos, uno, btncero;
    public JLabel textfield;

   

    // Metodo
    public Calculadora() {
       
        componentes();
        // Texto

    }

    private void componentes() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);

        textfield = new JLabel();
        textfield.setHorizontalAlignment(SwingConstants.RIGHT);
        textfield.setOpaque(true);
        textfield.setBackground(Color.WHITE);
        textfield.setBounds(15, 10, 343, 50);
        panel.add(textfield);

        btnSuma = new JButton("+");
        btnSuma.setBounds(278, 70, 50, 60);  //278, 70, 50, 60    
        panel.add(btnSuma);
     

        btnResta = new JButton("-");
        btnResta.setBounds(15, 70, 50, 60);//278, 155, 50, 60
        panel.add(btnResta);
     

        btnMult = new JButton("*");
        btnMult.setBounds(103, 70, 50, 60);//278, 240, 50, 60
        panel.add(btnMult);
  

        btnDiv = new JButton("/");
        btnDiv.setBounds(191, 70, 50, 60);//278, 325, 50, 60
        panel.add(btnDiv);
        

        tres = new JButton("3");
        tres.setBounds(278, 325, 50, 60); //191, 70, 50, 60  ||  103, 70, 50, 60 || 15, 70, 50, 60
        panel.add(tres);
        

        seis = new JButton("6");
        seis.setBounds(191, 155, 50, 60); //191, 155, 50, 60
        panel.add(seis);
        

        nueve = new JButton("9");
        nueve.setBounds(191, 240, 50, 60); //191, 240, 50, 60
        panel.add(nueve);
      

        igual = new JButton("=");
        igual.setBounds(191, 325, 50, 60);//191, 325, 50, 60
        panel.add(igual);
        

        dos = new JButton("2");
        dos.setBounds(278, 240, 50, 60);//103, 70, 50, 60
        panel.add(dos);
     

        cinco = new JButton("5");
        cinco.setBounds(103, 155, 50, 60);//103, 155, 50, 60
        panel.add(cinco);
       

        ocho = new JButton("8");
        ocho.setBounds(103, 240, 50, 60);//103, 240, 50, 60
        panel.add(ocho);
  

        btncero = new JButton("0");
        btncero.setBounds(103, 325, 50, 60);//103, 325, 50, 60
        panel.add(btncero);
      

        uno = new JButton("1");
        uno.setBounds(278, 155, 50, 60);//15, 70, 50, 60
        panel.add(uno);
     

        cuatro = new JButton("4");
        cuatro.setBounds(15, 155, 50, 60);//15, 155, 50, 60
        panel.add(cuatro);
     

        siete = new JButton("7");
        siete.setBounds(15, 240, 50, 60);//15, 240, 50, 60
        panel.add(siete);
       

        limpiar = new JButton("C");
        limpiar.setBounds(15, 325, 50, 60);//15, 325, 50, 60
        panel.add(limpiar);
       

    }
}
