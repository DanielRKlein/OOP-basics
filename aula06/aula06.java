package aula06;

public class aula06 {
        public static void main(String[] args) {
            Pessoa person1 = new Pessoa("daniel", 18, "homem");
            Livro livro1 = new Livro(person1, "seila", "seila", 1000);
            livro1.avançarPag();
            livro1.detalhes();
        }
    
}
