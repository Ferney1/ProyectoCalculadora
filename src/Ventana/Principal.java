package Ventana;

import controlador.Controlador;
import modelo.Modelo;
import vista.Calculadora;

public class Principal {
    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Calculadora fer = new Calculadora();
        Controlador con = new Controlador (mod,fer);
        con.iniciarVista();
        fer.setVisible(true);
    }
}