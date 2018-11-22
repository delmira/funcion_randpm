/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random_y_funcion;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static java.sql.Types.NULL;import java.util.Scanner;
public class Random_y_funcion {

    public static void main(String[] args) {
        /*Aqui utilizando el for generamos 20 numeros*/ 
for (int i=1;i<=20;i++){
        /*Usamos la funcion Math.random para generar numeros Random*/
        /*que esten dentro del rango de -5 a 5*/
         /*int numero = (int)(Math.random()*(X-Y+1)+Y;*/
 double numero=(double) Math.random()*(5-(-5)+1)+(-5) ;System.out.println("Numero random "+i+" = "+numero);
        /*La funciÃ³n Math.pow() devuelve la base elevada al exponente , esto es, baseexponente.*/
        /*Ejemplo: 2^10= Math.pow(2,10)*/
        /*e= 2.71828*/
        double x=(Math.sin(Math.pow(2.71, numero)/Math.pow(numero,-1)));
        /*El resultado se dara en radianes*/
        System.out.println("Resultado = "+x);}}}
    
