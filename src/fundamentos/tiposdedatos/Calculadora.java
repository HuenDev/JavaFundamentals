package fundamentos.tiposdedatos;

public class Calculadora {
    //Atributos
    public  int num1;
    public  int num2;

    //Constructor
    public Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    //Métodos
    public void sumar(){

        int suma = num1 + num2;
        System.out.println("---Calculadora--- \nSuma: " + num1 + " + " + num2 + " = " + suma);
    }

    public void restar(){

        int resta = num1 - num2;
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);

    }

    public void multiplicar(){
        int multiplicar = num1 * num2;
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + multiplicar);

    }

    public void dividir(){
        double dividir = (double) num1 / num2;
        System.out.println("División: " + num1 + " / " + num2 + " = " + dividir);
    }
}
