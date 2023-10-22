package Iphone;

public class Iphone implements  AparelhoTelefonico, NavegadorInternet {
    private boolean isRinging;

    public void ligar() {
        System.out.println("Ligando o telefone.");
    }

    public void atender() {
        isRinging = false;
        System.out.println("Chamada atendida.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
