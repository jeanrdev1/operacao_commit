public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World -------- 165 A DE GLORIA!");
        String nome = "Stive";
        String cor = "Preta";
        float peso = 27;
        //boolean bravo = false;
        String raca = "Vira Lata";
        String cachorro = nome;
    System.out.println("Seu Cachorro De Cor \n" + cor + " " + peso + "Kg\n" + raca);
        Scanner sc = new Scanner(System.in);
        System.out.print("Pula Quanto:\n");
        float pulaquanto = sc.nextInt();
      
        if (pulaquanto <= 50) {
           System.out.println("Seu cachorro\n" + cachorro + "\nPula baixo");
        } else if (pulaquanto < 80) {
         System.out.println("Seu cachorro\n" + cachorro + "\nPula normalmente");
        }
        else {
         System.out.println("Seu Cachorro\n" + cachorro + "\nPula Alto");
            sc.close();
    }
}
