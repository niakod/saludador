/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludador;
import java.util.Scanner;
/**
 *
 * @author MaR
 */
public class Saludador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese m si es mujer, h si es hombre: ");
        char sexo = s.next().charAt(0);
        System.out.print("Ingrese su nombre: ");
        String nombre = s.next();
        String saludo = new Saludo().saludar(sexo, nombre);
        System.out.println(saludo);
    }
    
}
