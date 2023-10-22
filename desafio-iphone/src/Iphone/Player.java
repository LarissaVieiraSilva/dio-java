import Iphone.ReprodutorMusical;

public class Player implements ReprodutorMusical {
    private boolean isPlaying;

    public void tocar() {
        isPlaying = true;
        System.out.println("Tocando música.");
    }

    public void pausar() {
        isPlaying = false;
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
}

