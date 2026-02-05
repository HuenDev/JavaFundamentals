package fundamentos.tiposdedatos;

public class Conversor {
    public double valor;

    public Conversor(double valor){
        this.valor = valor;
    }

    public void aCentrimetros(){
        double pulgadasACm = valor * 2.54;
        double kilomentrosACm = valor * 1000;

        System.out.println(
                "\n\n---Conversor de unidades---\n" +
                "Conversor a Centimentros\n" +
                valor + " pulgadas son " + pulgadasACm + " centimetros\n" +
                valor + " kilometros son " + kilomentrosACm + " centimetros\n"
        );
    }

    public void aPulgadas(){
        double centimetrosAInch = valor / 2.54;
        double kilomentrosAInch = valor * 39370;

        System.out.println(
                "Conversor a Pulgadas\n" +
                        valor + " centimentros son " + centimetrosAInch + " pulgadas\n" +
                        valor + " kilometros son " + kilomentrosAInch + " pulgadas\n"
        );
    }

    public void aKilometros(){
        double pulgadasAKm = valor / 39370;
        double centimetrosAKm = valor / 1000;

        System.out.println(
                "Conversor de Kilometros\n" +
                        valor + " pulgadas son " + pulgadasAKm + " kilometros\n" +
                        valor + " kilometros son " + centimetrosAKm + " kilometros\n"
        );
    }
}
