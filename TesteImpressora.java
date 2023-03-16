public class TesteImpressora {
    public static void main(String [] args){
        Impressora imp = new Impressora();
        imp.exibir(2);
        imp.exibir(2, 3);
        imp.exibir(2, "U");
        imp.exibir("A", 2);
        imp.exibir("A", "B", "C");
        imp.exibir(2, 3, "ABC");
    }
    

}
