public class Cadastro {

    public static void main(String[] args) {
        Doador doador1 = new Doador("Pamela", 20, 56.7, "F", false, false,  false, false, false);
        Triagem triagem = new Triagem();
        Doador doador4 = new Doador("Patricia", 30, 60.5, "F", true, false,  false, false, false);
        Doador doador9 = new Doador("Carolina", 16, 49, "F", false, false,  false, false, false);

        Boolean retorno = triagem.Etapa1(doador9);
        System.out.println(retorno);

    }
}