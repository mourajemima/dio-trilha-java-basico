public class Celular implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação de métodos da interface ReprodutorMusical
    public void tocar() {
        System.out.println("Música está sendo reproduzida");
    }

    public void pausar() {
        System.out.println("Música está pausada");
    }


    public void selecionarMusica(String musica) {
        System.out.println("Selecione a música");
    }

    // Implementação de métodos da interface AparelhoTelefonico

    public void ligar(String numero) {
        System.out.println("Fazendo ligação");
    }


    public void atender() {
        System.out.println("Atendendo ligação");
    }


    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    // Implementação de métodos da interface NavegadorInternet

    public void exibirPagina(String url) {
        System.out.println("Página está sendo exibida");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }


    public void atualizarPagina() {
        System.out.println("Página está sendo atualizada");
    }
    
}
