import iphone.Iphone;

public class SimulacaoUsuario {
    public static void main(String[] args) {
        Iphone iphone12 = new Iphone();

        // funções ipod
        iphone12.tocar();
        iphone12.pausar();
        iphone12.selecionarMusica();

        // funções telefônicas
        iphone12.ligar();
        iphone12.atender();
        iphone12.iniciarCorreioVoz();

        // funções navegador web
        iphone12.exibirPagina();
        iphone12.adicionarNovaAba();
        iphone12.atualizarPagina();
    }
}
