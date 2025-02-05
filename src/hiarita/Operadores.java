package hiarita;

public class Operadores {
public static void main(String[] args) {

     String nomeum = "fer";
     // String nomedois = "hia";
     String nomedois = new String("hia");
     System.out.println(nomeum.equals(nomedois));
     // System.out.println(nomeum == nomedois );
     int numero1 = 1;
     int numero2 = 2;

     boolean simnao = numero1 == numero2;

     System.out.println("numeroUm é igual a numerodois?"+ simnao);

     simnao = numero1 != numero2;
     System.out.println("numeroUm é diferente de numerodois?" + simnao);

     simnao = numero1 > numero2;
     System.out.println("numeroUm é maior que numerodois?" + simnao);

     simnao = numero1 < numero2;
     System.out.println("numeroUm é menor que numerodois?" + simnao);
}
}
