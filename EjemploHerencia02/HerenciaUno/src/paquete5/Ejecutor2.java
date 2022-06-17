/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author Edgar Espinoza
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        String nom = "Edgar";
        String ape = "Espinoza";
        String dni = "1106042185";
        int edad = 18;
        int numC = 5;
        double costo = 225.75;
        EstudiantePresencial estp1 = new EstudiantePresencial(nom, ape, dni, edad,
        numC, costo);
      
        estp1.calcularMatriculaPresencial();
        
        System.out.println(estp1);
    }   
}
