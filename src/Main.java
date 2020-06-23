public class Main {

    public static void main(String[] args) {
        int i = 2;
        long l = 4;

        C1 c1 = new C1(l);

        C1.J1 j1 = c1.new J1(i);
        C1.J2 j2 = c1.new J2(i);

        C1.J1.X x = j1.new X(2);

        System.out.println(j1.sumar());
        System.out.println(j1.multiplicar());

        System.out.println(j2.restar());
        System.out.println(j2.dividir());

        System.out.println(x.potencia());
        System.out.println(x.potenciaSuma());
    }
}
