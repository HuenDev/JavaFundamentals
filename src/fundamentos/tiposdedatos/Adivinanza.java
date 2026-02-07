package fundamentos.tiposdedatos;

public class Adivinanza {
    public int numeroSecreto = 5;

    public String intentar(int num){
        if (num > numeroSecreto) return num + " Es mayor";
        else if (num < numeroSecreto)  return num + " Es menor";
        else return " ¡Es correcto!";
    }
}
