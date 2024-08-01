public class Iphone {
    public static void main(String[] args) {
        Celular novoIphone = new Celular();

        novoIphone.tocar();
        novoIphone.pausar();
        novoIphone.selecionarMusica("One Spark - Twice");


        novoIphone.ligar("123456789");
        novoIphone.atender();
        novoIphone.iniciarCorreioVoz();

        novoIphone.exibirPagina("http://www.dio.com");
        novoIphone.adicionarNovaAba();
        novoIphone.atualizarPagina();

    }

}