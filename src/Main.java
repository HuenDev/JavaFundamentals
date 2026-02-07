
import fundamentos.tiposdedatos.Adivinanza;
import fundamentos.tiposdedatos.Calculadora;
import fundamentos.tiposdedatos.Conversor;
import  fundamentos.tiposdedatos.Estudiante;
import fundamentos.tiposdedatos.Producto;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ejercicio calculadora
        Calculadora calc = new Calculadora(10,20);

        calc.sumar();
        calc.restar();
        calc.multiplicar();
        calc.dividir();

        //Ejercicio Registro Estudiantes
        Estudiante estudiante = new Estudiante("Vane", "vanem@gmail.com", "11", 17, 4.3f);

        estudiante.mostrarInfo();

        //Ejercicio de Conversor de unidades
        Conversor unidades = new Conversor(10);

        unidades.aCentrimetros();
        unidades.aKilometros();
        unidades.aPulgadas();

        //Ejercicio Adivinanza
        Adivinanza adivinanza = new Adivinanza();
        Scanner numPrint = new Scanner(System.in);
        int number = 0;

        while (adivinanza.numeroSecreto != number){
            System.out.println("Ingrese un número entero: ");
            number = numPrint.nextInt();
            System.out.println(adivinanza.intentar(number));
        }

        //Ejercicio Producto
        Producto productoUno = new Producto("Celular", 10, 1500000);
        Producto productoDos = new Producto("Computador", 2, 3000000);
        Producto productoTres = new Producto("Teclado", 20,400000);

        productoUno.mostrarInfo();
        productoDos.mostrarInfo();
        productoTres.mostrarInfo();

    }
}