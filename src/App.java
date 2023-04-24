import classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p2.setNome("Caio");
        p3.setNome("Maria");
        p4.setNome("José");


        System.out.println(p2);
        System.out.println(p3);

    }
}
