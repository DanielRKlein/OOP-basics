package aula05;

public class aula05 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

         l[0] = new Lutador("pretty boy", "frança", 31, "1.75", 69, 11, 2, 1);
        
        l[1] = new Lutador("putscript", "brasil", 29, "1.68", 57, 14, 2, 3);

        l[2] = new Lutador("snapshadow", "EUA", 35, "1.65", 80, 12, 2, 1);

        l[1].apresentar();
        l[2].status();
    }
    
}
