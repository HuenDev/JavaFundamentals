
//import fundamentos.TiposDeDatos;

import fundamentos.tiposdedatos.Calculadora;
import fundamentos.tiposdedatos.Conversor;
import fundamentos.tiposdedatos.Estudiante;

public class Main {

    public static void main(String[] args) {
        //Ejercicio calculadora
        Calculadora calc = new Calculadora(10,20);
        calc.sumar();
        calc.restar();
        calc.multiplicar();
        calc.dividir();

        //Ejercicio Registro Estudiantes
        Estudiante estudiante = new Estudiante("Huendy", "huendym@gmail.com", "11", 17, 4.3f);
        estudiante.mostrarInfo();

        //Ejercicio de Conversor de unidades
        Conversor unidades = new Conversor(10);
        unidades.aCentrimetros();
        unidades.aKilometros();
        unidades.aPulgadas();
    }
}