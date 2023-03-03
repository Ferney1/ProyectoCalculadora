
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import modelo.Modelo;
import vista.Calculadora;

public class Controlador implements ActionListener{
    private Calculadora fer;
    private Modelo model;
    
    public Controlador ( Modelo model , Calculadora fer){
        this.model = model;
        this.fer = fer;
        this.fer.uno.addActionListener(this);
        this.fer.dos.addActionListener(this);
        this.fer.tres.addActionListener(this);
        this.fer.cuatro.addActionListener(this);
        this.fer.cinco.addActionListener(this);
        this.fer.seis.addActionListener(this);
        this.fer.siete.addActionListener(this);
        this.fer.ocho.addActionListener(this);
        this.fer.nueve.addActionListener(this);
        this.fer.btncero.addActionListener(this);
        this.fer.btnMult.addActionListener(this);
        this.fer.btnDiv.addActionListener(this);
        this.fer.btnSuma.addActionListener(this);
        this.fer.btnResta.addActionListener(this);
        this.fer.igual.addActionListener(this);
        this.fer.limpiar.addActionListener(this);
    }
    
    public void iniciarVista(){
        fer.setTitle(" Calculadora ");
        fer.setSize(390, 460);
        fer.setLocationRelativeTo(null);
        fer.setVisible(true);
        fer.setResizable(false);
        fer.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fer.uno) {
            model.cadenaNum += "1";
            fer.textfield.setText(model.cadenaNum);
            model.activado = true;
        }
        if (e.getSource() == fer.dos) {
            model.cadenaNum += "2";
            fer.textfield.setText(model.cadenaNum);
            model.activado = true;
        }
        if (e.getSource() == fer.tres) {
            model.cadenaNum += "3";
            fer.textfield.setText(model.cadenaNum);
            model.activado = true;
        }
        if (e.getSource() == fer.cuatro) {
           model. cadenaNum += "4";
            fer.textfield.setText(model.cadenaNum);
            model.activado = true;
        }
        if (e.getSource() == fer.cinco) {
            model.cadenaNum += "5";
            fer.textfield.setText(model.cadenaNum);
            model.activado = true;
        }
        if (e.getSource() == fer.seis) {
            model.cadenaNum += "6";
            fer.textfield.setText(model.cadenaNum);
            model.activado = true;
        }
        if (e.getSource() == fer.siete) {
            model.cadenaNum += "7";
            fer.textfield.setText(model.cadenaNum);
            model.activado = true;
        }
        if (e.getSource() == fer.ocho) {
            model.cadenaNum += "8";
            fer.textfield.setText(model.cadenaNum);
            model.activado = true;
        }
        if (e.getSource() == fer.nueve) {
            model.cadenaNum += "9";
            fer.textfield.setText(model.cadenaNum);
            model.activado = true;
        }
        
        if (e.getSource() == fer.btncero) {
                if (model.cadenaNum != "" || model.cadenaNum != model.oper && model.getNum1()> 0) {
                    model.cadenaNum += "0";
                    fer.textfield.setText(model.cadenaNum);
                    model.activado = true;
                }
            }
       if(e.getSource()== fer.limpiar){
            if(model.cadenaNum ==""){
               model.activado = false; 
            }
            model.cadenaNum ="";
            fer.textfield.setText("");
        }
        if (e.getSource() == fer.btnSuma) {
            if (model.cadenaNum == "") {
                model.activado = false;
            }
            if (model.activado == true) {
                model.num1 = Integer.parseInt(model.cadenaNum);
                fer.textfield.setText("+");
                model.cadenaNum = "";
                model.oper = "sumar";

                model.activado = false;
            }
        }
        if (e.getSource() == fer.btnResta) {
            if (model.cadenaNum == "") {
                model.activado = false;
            }
            if (model.activado == true) {
                model.num1 = Integer.parseInt(model.cadenaNum);
                fer.textfield.setText("-");
                model.cadenaNum = "";
                model.oper = "restar";

                model.activado = false;
            }
        }
        if (e.getSource() == fer.btnMult) {
            if (model.cadenaNum == "") {
                model.activado = false;
            }
            if (model.activado == true) {
                model.num1 = Integer.parseInt(model.cadenaNum);
                fer.textfield.setText("*");
                model.cadenaNum = "";
                model.oper = "multiplicar";
                model.activado = false;
            }
        }
        if (e.getSource() == fer.btnDiv) {
            if (model.cadenaNum == "") {
                model.activado = false;
            }
            if (model.activado == true) {
                model.num1 = Integer.parseInt(model.cadenaNum);
                fer.textfield.setText("/");
                model.cadenaNum = "";
                model.oper = "dividir";
                model.activado = false;
            }
        }
        if (e.getSource() == fer.igual) {
            if (model.cadenaNum == "") {
                model.activado = false;
            } else {
                int num2;
                num2 = Integer.parseInt(model.cadenaNum);
                if (model.activado == true) {
                    if (model.oper.equals("nula")) {
                        fer.textfield.setText(model.cadenaNum);
                    } else if (model.oper.equals("sumar")) {
                        model.resultado = model.getNum1() + num2;
                        fer.textfield.setText(String.valueOf(model.resultado));
                        model.cadenaNum = String.valueOf(model.resultado);
                        model.activado = true;
                        model.oper = "nula";
                    } else if (model.oper.equals("restar")) {
                        model.resultado = model.getNum1() - num2;
                        fer.textfield.setText(String.valueOf(model.resultado));
                        model.cadenaNum = String.valueOf(model.resultado);
                        model.activado = true;
                        model.oper = "nula";
                    } else if (model.oper.equals("multiplicar")) {
                        model.resultado = model.getNum1() * num2;
                        fer.textfield.setText(String.valueOf(model.resultado));
                        model.cadenaNum = String.valueOf(model.resultado);
                        model.activado = true;
                        model.oper = "nula";
                    } else if (model.oper.equals("dividir")) {
                        if (num2 != 0) {
                            model.resultado = model.getNum1() / num2;
                            fer.textfield.setText(String.valueOf(model.resultado));
                            model.activado = true;
                            model.oper = "nula";
                            model.cadenaNum = "";
                        } else {
                            String mensaje = "El segundo numero tiene que ser diferente de cero";
                            fer.textfield.setText(mensaje);
                            model.cadenaNum = "";
                        }
                    }
                }
            }

            model.activado = true;
        }
        }
       

    }
    

