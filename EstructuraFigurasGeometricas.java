/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurafigurasgeometricas;


import javax.swing.JOptionPane;


public class EstructuraFigurasGeometricas {
    private double area;

    public void AreaCirculo(double radio) {
        area = Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + String.format("%5.5f", area));
    }

    public void AreaCuadrado(double lado) {
        area = Math.pow(lado, 2);
        JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + String.format("%5.5f", area));
    }

    public void AreaTriangulo(double base, double altura) {
        area = (base * altura) / 2;
        JOptionPane.showMessageDialog(null, "El área del triángulo es: " + String.format("%5.5f", area));
    }

    public void AreaRectangulo(double base, double altura) {
        area = base * altura;
        JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + String.format("%5.5f", area));
    }

    public void AreaEsfera(double radio) {
        area = 4 * Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El área de la esfera es: " + String.format("%5.5f", area));
    }

    public void AreaCubo(double arista) {
        area = 6 * Math.pow(arista, 2);
        JOptionPane.showMessageDialog(null, "El área del cubo es: " + String.format("%5.5f", area));
    }
}