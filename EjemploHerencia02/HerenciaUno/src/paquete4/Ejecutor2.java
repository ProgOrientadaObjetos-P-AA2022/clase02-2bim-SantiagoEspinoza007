/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author Edgar Espinoza
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        EstudiantePresencial estp1 = new EstudiantePresencial();
        
        estp1.establecerNombresEstudiante("Edgar");
        estp1.establecerApellidoEstudiante("Espinoza");
        estp1.establecerIdentificacionEstudiante("1106042185");
        estp1.establecerEdadEstudiante(18);
        estp1.establecerNumeroCreditos(5);
        estp1.establecerCostoCredito(125.50);
        estp1.calcularMatriculaPresencial();
        
        System.out.println(estp1);
    }   
}
