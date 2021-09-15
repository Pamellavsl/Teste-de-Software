public class Triagem {


    public boolean Etapa1(Doador doador) {
        if ((doador.getPeso() >= 60 && doador.getSexo().equalsIgnoreCase("M")) || doador.getPeso() >= 50 && doador.getSexo().equalsIgnoreCase("F")) {
            if (doador.getIdade() >= 16 && doador.getIdade() <= 69) {
                if (doador.getIdade() >= 60 && !doador.isJaDoouAnteriormente()) {
                    System.out.println("Não é possível doar sangue: Doador com idade maior que 60 anos que nunca doou sangue anteriormente");
                    return false;
                }
                else {
                    System.out.println("Você está apto(a) para a Etapa 2");
                    return true;
                }
            }
            else {
                System.out.println("Não é possível doar sangue: Doador não está dentro da faixa-etária permitida");
                return false;

            }
        }
        else {
            System.out.println("Não é possível doar sangue: Doador não está dentro da faixa de peso permitida");
            return false;
        }
    }

    public boolean Etapa2 (Doador doador) {

            if (doador.isEstaComFebre()) {
                System.out.println("Não é possível doar sangue: Doador está com febre");
                return false;

            } else if (doador.isEstaGravida()) {
                System.out.println("Não é possível doar sangue: Doador está grávida");
                return false;
            } else if (doador.isEstaAmamentando() && doador.isTempParto()) {
                System.out.println("Não é possível doar sangue: Parto aconteceu a menos de 12 meses");
                return false;
            }
            System.out.println("Por favor, aguarde na fila de doação!");
            return true;
        }
}
