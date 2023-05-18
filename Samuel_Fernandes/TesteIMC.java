public class TesteIMC {

    public static void main(String[] args) {
     System.out.println("Ola java!!\nVamos Agir com Bastante Paciência \nSaviola?");
     String nome = "Ana Lucia \nFernandes \n";
     float peso = 54.0f;
     float altura = 1.67f;
     float IMC  = (peso / (altura * altura));
     System.out.println(nome + "IMC\n" + IMC);
     System.out.printf("IMC: %.2f\n", IMC);
        if (IMC < 17 ) {
     System.out.println("Muito Abaixo do Peso");
     } else if ( IMC <= 18.49) {
     System.out.println("Abaixo do Peso");
     } else if ( IMC <= 24.99) {
     System.out.println("Peso Normal");
     } else if ( IMC <= 29.99) {
     System.out.println("Acima do Peso");
     } else if ( IMC <= 34.99) {
     System.out.println("Obesidade I");
     } else if ( IMC <= 39.99) {
     System.out.println("Obesidade II (severa)");
     } 

         }
}