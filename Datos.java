/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurafigurasgeometricas;


import javax.swing.JOptionPane;


public class Datos {
    private int opcion;

    public void Menu() {
        EstructuraFigurasGeometricas figura = new EstructuraFigurasGeometricas();

        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Elija la figura a la cual desea calcular su área:\n1. Círculo\n2. Cuadrado\n3. Triángulo\n4. Rectángulo\n5. Esfera\n6. Cubo"));

        if (opcion == 1) {
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo:"));
            figura.AreaCirculo(radio);
        } else if (opcion == 2) {
            double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado:"));
            figura.AreaCuadrado(lado);
        } else if (opcion == 3) {
            double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triángulo:"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triángulo:"));
            figura.AreaTriangulo(base, altura);
        } else if (opcion == 4) {
            double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectángulo:"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectángulo:"));
            figura.AreaRectangulo(base, altura);
        } else if (opcion == 5) {
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de la esfera:"));
            figura.AreaEsfera(radio);
        } else if (opcion == 6) {
            double arista = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la arista del cubo:"));
            figura.AreaCubo(arista);
        } else {
            JOptionPane.showMessageDialog(null, "Opción inválida, por favor seleccione una opción válida.");
        }
    }
}