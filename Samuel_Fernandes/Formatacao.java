public class Formatacao {
    public static void main(String[] args) {
        // Estrutura algoritmo

        // 1-Declarar as variaveis
        // 2-Executar funções
        // 3-Retornar Resultado

        float valor = 12.547f;
        double valorTotal = 128.897;

        System.out.println(valor);
        System.out.println(valorTotal);

        // Formatação
        // %s - String
        // %d - int
        // %f - float/double
        // %b - boolean

        String name = "Samuel Fenandes";
        int idade = 43;
        float altura = 1.68f;
        boolean casado = true;

        System.out.printf("Nome: %s  Idade: %d  Altura: %f  Casado: %b %n", name, idade, altura, casado);
        System.out.println("");
        System.out.println(String.format("Nome: %s  Idade: %d  Altura: %.2f  Casado: %b", name, idade, altura, casado));
        System.out.println("");
        System.out.println("TESTE");
    }
}