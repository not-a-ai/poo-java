import utilitarios.AparelhoTelefonico;
import utilitarios.NavegadornaInternet;
import utilitarios.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadornaInternet, ReprodutorMusical{
  public void ligar(String numero){
    System.out.println("Seu iphone está ligando para " + numero);
  };
  public void iniciarCorreioVoz(){
    System.out.println("Seu iphone está iniciando um correio de voz");

  };
  public void atender(){
    System.out.println("Seu iphone está atendendo uma ligação");

  };

  public void tocar(){
    System.out.println("Seu iphone está tocando uma música");
  }
  public void pausar(){
    System.out.println("Seu iphone pausou a musica");
  }
  public void selecionarMusica(String musica){
    System.out.println("Seu iphone está tocando" + musica);
  }

  public void exibirPagina(String url){
    System.out.println("Seu iphone está abrindo a página" + url);
  }
  public void atualizarPagina(){
    System.out.println("Seu iphone está atualizando a página");
  }
  public void adicionarNovaPagina(){
    System.out.println("Seu iphone está adicionando uma nova página");
  }
}
