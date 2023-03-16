import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class CalculadoraCientifica {
    public double raiz(int num){
        return sqrt(num);
    }
    public double raiz(double num){
        return sqrt(num);
    }
    public double raiz(String numStr){
        double num = Double.parseDouble(numStr);
        return sqrt(num);
    }
    public double potencia(byte a, byte b){
        return pow(a, b);
    }
    public double potencia(String s1, String s2){
        double num1 = Double.parseDouble(s1);
        double num2 = Double.parseDouble(s2);
        return pow(num1, num2);
    }
    public double potencia(int a, double b){
        return pow(a, b);
    }

    
}
