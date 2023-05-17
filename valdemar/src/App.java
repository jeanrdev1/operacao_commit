package src;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nValdemar no Hello, World!");

        //remove acentos do txt especificado, usando a classe tira acentos
        //deixando de usar o Scanner por erro com acentos no terminal
        String ex = "José de Araújo Magalhães";
        System.out.print("\nRemovendo acento(s) do texto: "+ex.toUpperCase());
        TiraAcento txt = new TiraAcento(ex.toUpperCase());
        System.out.println("\nResultado: "+ txt.textofinal);

        
    }
}

//  para aceitação de acentos no terminal VSCode .. 
//  Ctrl+shift+p 
//  digite:  setting.json   
//  tecle enter para adicionar as linhas abaixo no arquivo copiando e colando
// "terminal.integrated.shell.windows": "C:\\Windows\\System32\\cmd.exe",
// "terminal.integrated.shellArgs.windows": "/k chcp 1252",

