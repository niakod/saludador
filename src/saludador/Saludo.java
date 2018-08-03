/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludador;

/**
 *
 * @author MaR
 */
public class Saludo {
    public String saludar(char vSexo, String vNombre){
        String aux;
        if (vSexo == 'm' || vSexo == 'M'){
            aux = "Bienvenida "+vNombre+"!";
        }
        else{
            aux = "Bienvenido "+vNombre+"!";
        }
        return aux;
    }
}
