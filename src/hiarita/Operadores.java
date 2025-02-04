package hiarita;

public class Operadores {
public static void main(String[] args) {
    int numero = 5;
    numero = - numero;
    //esse operador de negação não alterou o valor da variável numero
    System.out.println(numero);
    //mlehor forma de deixar a variável positiva
    numero = numero * -1;

    System.out.println(numero);

}
}
