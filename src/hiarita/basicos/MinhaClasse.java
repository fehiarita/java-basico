package hiarita.basicos;
public class MinhaClasse {
    public MinhaClasse() {
    }

    public static void main(String[] args) {
        String primeiroNome = "Maria";
        String segundoNome = "Fernanda";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome + " " + segundoNome;
    }
}