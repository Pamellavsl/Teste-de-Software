package main;

public class Doador {
    private String nome;
    private int idade;
    private double peso;
    private String sexo;
    private boolean estaGravida;
    private boolean estaAmamentando;
    private boolean tempParto;
    private boolean jaDoouAnteriormente;
    private boolean estaComFebre;


    public Doador(String nome, int idade, double peso, String sexo, boolean estaGravida, boolean estaAmamentando, boolean tempParto, boolean jaDoouAnteriormente, boolean estaComFebre) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.estaGravida = estaGravida;
        this.estaAmamentando = estaAmamentando;
        this.tempParto = tempParto;
        this.jaDoouAnteriormente = jaDoouAnteriormente;
        this.estaComFebre = estaComFebre;
    }

    public Doador(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isEstaGravida() {
        return estaGravida;
    }

    public void setEstaGravida(boolean estaGravida) {
        this.estaGravida = estaGravida;
    }

    public boolean isEstaAmamentando() {
        return estaAmamentando;
    }

    public void setEstaAmamentando(boolean estaAmamentando) {
        this.estaAmamentando = estaAmamentando;
    }

    public boolean isTempParto() {
        return tempParto;
    }

    public void setTempParto(boolean tempParto) {
        this.tempParto = tempParto;
    }

    public boolean isJaDoouAnteriormente() {
        return jaDoouAnteriormente;
    }

    public void setJaDoouAnteriormente(boolean jaDoouAnteriormente) {
        this.jaDoouAnteriormente = jaDoouAnteriormente;
    }

    public boolean isEstaComFebre() {
        return estaComFebre;
    }

    public void setEstaComFebre(boolean estaComFebre) {
        this.estaComFebre = estaComFebre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
