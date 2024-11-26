/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_proyecto;

import javax.swing.*;

/**
 *
 * @author Alumno
 */


public class Calculadora extends JFrame {
    
        private JTextField Cajadetexto = new JTextField("");

        private JButton boton1 = new JButton("1");
        private JButton boton2 = new JButton("2");
        private JButton boton3 = new JButton("3");
        private JButton boton4 = new JButton("4");
        private JButton boton5 = new JButton("5");
        private JButton boton6 = new JButton("6");
        private JButton boton7 = new JButton("7");
        private JButton boton8 = new JButton("8");
        private JButton boton9 = new JButton("9");
        private JButton boton0 = new JButton("0");
        private JButton botonsumar = new JButton("+");
        private JButton botonRestar = new JButton("-");
        private JButton botonMultiplicar = new JButton("*");
        private JButton botonDivision = new JButton("/");
        private JButton botonBorrar = new JButton("Ce");
        private JButton botonResultado = new JButton("=");
        
        public Calculadora(){
            setTitle("Calculadora"); //titulo de la ventana
             // alto ancho
            setSize(550, 300); //tamaño de ventana
            setLocationRelativeTo(null); //centrar la ventana
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
        
        public static void main(String[] args){
            
            Calculadora ventana = new Calculadora();
            
            ventana.setVisible(true);
            
        }
        
}



