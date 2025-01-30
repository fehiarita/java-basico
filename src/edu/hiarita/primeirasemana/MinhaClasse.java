package edu.hiarita.primeirasemana;

//Para o nome das classes, a primeira letra de cada palavra deve ser maiuscula (Camel Case)
public class MinhaClasse {

    //método necessário para classes que vão ser executadas
    public static void main(String [] args){
        String primeiroNome = "Maria";
        String segundoNome = "Fernanda";
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);


    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método" + ": " +primeiroNome + " " + segundoNome;
    }


}
