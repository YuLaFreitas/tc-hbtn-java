public class Program {
    public static void main(String[] args) {
        int a, b;

        a = 4;
        b = 3;
        System.out.println(a + " / " + b + " = " + Numero.dividir(a,b));

        a = 9;
        b = 0;
        Numero.dividir(a, b);
    }
}