package aula08;

public class main {
    public static void main(String[] args) {
        Video v1 = new Video("aula009");
        Gafanhoto g1 = new Gafanhoto("ass3", "daniel", 18, Sexo.Homem);

        Vizualização vis =  new Vizualização(g1, v1);
        System.out.println(vis.toString());
    }
    
}
