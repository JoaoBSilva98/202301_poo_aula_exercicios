public class Impressora{
    public void exibir(float num){
        System.out.println(num);
    }
    public void exibir(float num, float num2){
        System.out.println(num + "," + num2);
    }
    public void exibir(float num, String texto){
        System.out.println(num + "," + texto);
    }
    public void exibir(String texto, float num){
        System.out.println(texto + "," + num);
    }
    public void exibir(String texto, String texto2, String texto3){
        System.out.println(texto + "," + texto2 + "," + texto3);
    }
    public void exibir(int num, int num2, String texto){
        System.out.println(num + "," + num2 + "," + texto);
    }
}