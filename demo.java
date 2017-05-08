/*
====================================
@Author Enzo ER
Codigo libre sin licenciamiento :)
====================================
*/

import javax.swing.*;
import java.util.*;


public class demo{

public static void main(String[] args) {

//Variable global-Tamaño Vector
int rows=0;
int col=0;

//Ciclo controlador de excepciones
while(true){

  try {

      //Captura Datos
      rows =Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de filas:"));
      col =Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de columnas:"));

      int [][] vector = new int[rows][col];
      //LLlenando vector
        for (int i=0;i<vector.length;i++) {
          for (int j=0;j<vector[0].length;j++) {
              vector[i][j]=i+2*3;
          }
        }
      //Imprimiendo valores del vector
        for (int i=0;i<vector.length;i++) {
          for (int j=0;j<vector[0].length;j++) {
                System.out.print(vector[i][j]);
          }
            System.out.println(" ");
        }

      //Ignora siguiente proceso si excepcion se cumple y regresa al comienzo
      break;
      }catch (NumberFormatException e) {

        //Imprime mensaje si hay una excepcion
        JOptionPane.showMessageDialog(null,"Por favor ingrese solo numeros");

      }finally{
        System.out.println("El Programa se cerrara!!!");
      }
}






}
}
