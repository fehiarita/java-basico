package doc;

public class Comentarios {
public static void main(String[] args) {
    


     
}

/*
 * Este método foi elaborado as pressas 
 * por isso que abreviei o nome das variáveis 
 * porém o método tem a finalidade de somar ou multiplicar 
 * dois números
 */
public int somaMultiplica(int n, int x, String m){
    int r = 0;
    if (m == "M") {
        r = n * x;
    }else{
        r = n + x;

    }
    return r;
}
}
