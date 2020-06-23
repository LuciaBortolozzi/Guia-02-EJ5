import static java.lang.Math.pow;

public class C1 {
    private static long num;
    private String str;

    public C1(long num) {
        C1.num = num;
    }

    public C1(String str) {
        this.str = str;
    }

    protected class J1 {
        private int num;

        public J1(int num) {
            this.num = num;
        }

        public int sumar() {
            return (int) (num + C1.num);
        }

        public int multiplicar() {
            return (int) (num * C1.num);
        }

        protected class X {
            int exp;

            public X(int exp) {
                this.exp = exp;
            }

            public int potencia() {
                return (int) pow(C1.num, exp);
            }

            public int potenciaSuma() {
                return (int) pow(sumar(), exp);
            }

            public int potenciaInterna(int e){
                class P {
                    int e;

                    public P(int e) {
                        this.e = e;
                    }

                    public int potencia() {
                        return (int) pow(C1.num, e);
                    }

                    public int potenciaSuma() {
                        return (int) pow(sumar(), e);
                    }
                }

                P p = new P(e);
                return p.potencia();
            }
        }
    }

    public class J2 {
        private int num;

        public J2(int num) {
            this.num = num;
        }

        public int restar() {
            return (int) (C1.num - num);
        }

        public int dividir() {
            return (int) (C1.num / num);
        }
    }
}
