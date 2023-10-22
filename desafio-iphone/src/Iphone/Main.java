package Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone myPhone = new Iphone();

        myPhone.ligar();
        myPhone.atender();
        myPhone.exibirPagina("https://www.example.com");

        Player myPlayer = new Player();
        myPlayer.tocar();
        myPlayer.pausar();
    }
}