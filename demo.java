/*
====================================
Author: Enzo
Codigo libre sin licenciamiento :)
====================================
*/

import javax.swing.*;
import java.util.*;


public class demo{

public static void main(String[] args) {

//Variable global-Tamaño Vector
int rows=0;

//Ciclo controlador de excepciones
while(true){

  try {

      //Captura Datos
      rows =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1 al 10:"));

      int [] vector = new int[rows];
      //LLlenando vector
        for (int i=0;i<vector.length;i++) {
          vector[i]=i+2*3;
      }
      //Imprimiendo valores del vector
        for (int i=0;i<vector.length;i++) {

          System.out.println(vector[i]);

      }

      //Ignora siguiente proceso si excepcion se cumple y regresa al comienzo
      break;
      }catch (NumberFormatException e) {

        //Imprime mensaje si hay una excepcion
        JOptionPane.showMessageDialog(null,"Por favor ingrese solo numeros");

  }
}






}
}
