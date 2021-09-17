package main;

public class Triagem {


    public boolean Etapa1(Doador doador) {
        if ((doador.getPeso() >= 60 && doador.getSexo().equalsIgnoreCase("M")) || doador.getPeso() >= 50 && doador.getSexo().equalsIgnoreCase("F")) {
            if (doador.getIdade() >= 16 && doador.getIdade() <= 69) {
                if (doador.getIdade() >= 60 && !doador.isJaDoouAnteriormente()) {
                    System.out.println("Etapa 1 -> Não é possível doar sangue: Doador "+ doador.getNome() + " com idade maior que 60 anos que nunca doou sangue anteriormente");
                    return false;
                }
                else {
                    System.out.println("Etapa 1 -> "+  doador.getNome() + " está apto(a) para a Etapa 2");
                    return true;
                }
            }
            else {
                System.out.println("Etapa 1 - > Não é possível doar sangue: Doador "+  doador.getNome() + " não está dentro da faixa-etária permitida");
                return false;

            }
        }
        else {
            System.out.println("Etapa 1 -> Não é possível doar sangue: Doador " + doador.getNome() + " não está dentro da faixa de peso permitida");
            return false;
        }
    }

    public boolean Etapa2 (Doador doador) {

        if (doador.isEstaComFebre()) {
            System.out.println("Etapa 2 -> Não é possível doar sangue: Doador " + doador.getNome() + " está com febre");
            return false;

        } else if (doador.isEstaGravida()) {
            System.out.println("Etapa 2 -> Não é possível doar sangue: Doador " + doador.getNome() + " está grávida");
            return false;
        } else if (doador.isEstaAmamentando() && doador.isTempParto()) {
            System.out.println("Etapa 2 -> Não é possível doar sangue: Parto de "+ doador.getNome() + " aconteceu a menos de 12 meses");
            return false;
        }
        return true;
    }

    public boolean autorizadoDoar (Doador doador) {
        if (Etapa1(doador) && Etapa2(doador)) {
            System.out.println(doador.getNome() + " aguarde na fila de doação");
            return true;
        }
        return false;
    }
}