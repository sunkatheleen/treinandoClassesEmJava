/* Exemplo de aplicação 1: crie um algoritmo em Java o qual possuauma
classe chamada “Retangulo” (sem acentos no nome). Instancie um objeto para esta
classe.
 */

public class Retangulo {
    // Atributos da classe = ESTADO da classe
    float altura;
    float largura;

    // Métodos da classe = COMPORTAMENTO da classe
    float calcularPerimetro() {
        float pm;                 // variável local
        pm = 2 * altura + 2 * largura;
        return pm;
    }
    void imprimirDados() {
        float p;                   // variável local
        p = calcularPerimetro();   // calcula o perímetro do retângulo
        System.out.println("Retângulo: ");
        System.out.println("- altura:    " + altura);
        System.out.println("- largura:   " + largura);
        System.out.println("- perímetro: " + p);
    }

    // Método principal – início de execução do programa

    public static void main(String[] args) {
        System.out.println("Mundo dos retângulos");

        // Objeto de Retangulo retg1
        Retangulo retg1;         // referência de objeto da classe Retangulo
        retg1 = new Retangulo(); // instanciação da classe Retangulo em objeto
        retg1.altura  = 10;      // atribuição de valor para atributo do objeto
        retg1.largura = 20;      // atribuição de valor para atributo do objeto
        retg1.imprimirDados();   // invocação de método do objeto

        // Objeto de Retangulo retg2
        Retangulo retg2;         // referência de objeto da classe Retangulo
        retg2 = new Retangulo(); // instanciação da classe Retangulo em objeto
        retg2.altura  = 5;       // atribuição de valor para atributo do objeto
        retg2.largura = 15;      // atribuição de valor para atributo do objeto
        retg2.imprimirDados();   // invocação de método do objeto

        // SUGESTÃO: o que acha de criar um terceiro objeto com o nome de retg3
        // logo após a linha 36? Mude a altura e a largura deste terceiro retângulo,
        // e teste

        Retangulo retg3;
        retg3 = new Retangulo();
        retg3.altura = 24;
        retg3.largura = 62;
        retg3.imprimirDados();
    }
}

