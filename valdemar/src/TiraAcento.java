package src;

public class TiraAcento {
    
    String texto;
    String textofinal="";

    TiraAcento(String texto){
        this.texto = texto;
        
        for (int i=0;texto.length()>i;i++){            
            String letra = Character.toString(texto.charAt(i));
        
                                   
            switch (letra){
                case " ", "B", "C", "D", "F", "G", "J", "M", "N", "K", "L", "H", "P", "Q", "R", "S", "T", "V", "X", "Y", "Z":
                  //System.out.println(letra+" - não analisada: ");
                  break;
                case "Á","Â","Ã":
                  //System.out.println(letra+" - acento removido: ");
                  letra = "A";
                  break;
                case "É","Ê":
                  //System.out.println(letra+" - acento removido: ");
                  letra = "E";
                  break;
                case "Í":
                  //System.out.println(letra+" - acento removido: ");
                  letra = "i";
                  break;
                case "Ó","Ô","Õ":
                  //System.out.println(letra+" - acento removido: ");
                  letra = "O";
                  break;
                case "Ú":
                  //System.out.println(letra+" - acento removido: ");
                  letra = "U";
                  break;
                  
                default:
                  //System.out.println(letra+" - sem acento"); 
            }
        
            textofinal = textofinal + letra;
        }
    }


    
}


