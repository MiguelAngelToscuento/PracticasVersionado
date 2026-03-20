public class calculadora2digitos {
    public static void main(String[] args) {
        System.out.println("la suma es: " +suma(5000, 12394));
        System.out.println("La resta es: "+resta(5000, 12394));
        System.out.println("La multiplicación es: "+multiplicacion(5000, 12394));
        System.out.println("la division es: "+division(5000, 12394));
        System.out.println("La potencia es: "+potencia(5000, 12394));
    }
    public void calculadora2digitos() {
    }

    public static void mensaje(String texto){
        System.out.println(texto);
    }

    public static double suma(double a, double b){
        return a + b;
    }

    public static double resta(double a, double b){
        return a - b;
    }

    public static double multiplicacion(double a, double b){
        return a * b;
    }

    public static double division(double a, double b){
        return a / b;
    }

    public static double potencia(double a, double b){
        return Math.pow(a, b);
    }
}
