public class Pessoa{
    String nome;
    String profissao;

  public Pessoa(String n, String p){
    this.nome = n;
    this.profissao = p;
  }
  
    public String toString(){
      return "nome: "+nome+" profissao "+profissao;
    }

}
