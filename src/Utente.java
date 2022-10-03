/**
 *
 * @author Rodrigo Magalhães 43202
 * A classe Utente vai ser a classe de criação de objetos utentes
 */

public class Utente {
    private String nome;
    private String genero;
    private int idade;
    private float altura;
    private int peso;

    public Utente(String nome, String genero, int idade, float altura, int peso) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }


    @Override
    public String toString() {
        return "Utente [nome=" + nome + ", genero=" + genero + ", idade=" + idade + ", altura=" + altura + ", peso="
                + peso + "]";
    }

    /**
     * método para calcular o imc, e indicar se qual a margem de peso e o peso ideal
     */
    public void calcularIMC() {
        float imc;
        float pesoI;
        float pesoIMin;
        float pesoIMax;
        imc = peso / (altura * altura);
        if (imc <= 19) {
            System.out.println("Abaixo do peso normal");
            pesoI = imc * (altura * altura);
            System.out.println("O peso ideal deve ser: " + pesoI);
        } else if (imc <= 25) {
            System.out.println("Peso normal");
            pesoIMin = Math.round(19 * (altura * altura));
            pesoIMax = Math.round(25 * (altura * altura));
            System.out.println("O peso deve manter-se entre " + pesoIMin + " e " + pesoIMax);
        } else if (imc <= 30) {
            System.out.println("Excesso de peso");
            pesoI = imc * (altura * altura);
            System.out.println("O peso ideal deve ser: " + pesoI);
        } else {
            System.out.println("Obeso");
            pesoI = imc * (altura * altura);
            System.out.println("O peso ideal deve ser: " + pesoI);
        }
    }
}
