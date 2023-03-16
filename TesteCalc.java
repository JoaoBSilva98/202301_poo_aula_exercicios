public class TesteCalc {
    public static void main(String [] args){
        CalculadoraCientifica calc = new CalculadoraCientifica();
        System.out.println(calc.raiz(2));
        System.out.println(calc.raiz(2.5));
        System.out.println(calc.raiz("49"));
        System.out.println(calc.potencia(4, 2));
        System.out.println(calc.potencia("2", "2"));
        System.out.println(calc.potencia(2, 2.5));
    }
    
}
