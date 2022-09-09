public class ListaDinamica{
  No inicio;
  No fim;

  public void insere(No n){
    if (inicio == null){
        inicio = n;
        fim = n;
    }
    else{
      fim.proximo = n;
      fim.anterior = n;
      fim = n;
    }
  }

  public void insere_meio(No inserir){

    if (inicio == null){
      inicio = inserir;
      fim = inserir;
    }
    else {
      //localizar posicao de insercao
      No aux = inicio;
      No pontoIns = inicio;
      while (aux != null) {
        if (inserir.toString().compareTo(aux.toString()) < 0) {
          pontoIns = aux;
          break;
        }
        aux = aux.proximo;
      }
      if (aux == null && pontoIns == inicio){
        //inserir no final
        fim.proximo = inserir;
        inserir.anterior = fim;
        fim = inserir;
      }else {

        if (inserir.toString().compareTo(pontoIns.toString()) > 0) {
          //inserir apos ponto de insercao
          inserir.proximo = pontoIns.proximo;
          inserir.anterior = pontoIns;
          pontoIns.proximo = inserir;
          if (pontoIns == fim) {
            fim = inserir;
          }
        } else {
          //inserir antes do ponto de insercao
          inserir.proximo = pontoIns;
          inserir.anterior = pontoIns.anterior;
          pontoIns.anterior = inserir;
          if (pontoIns == inicio)
            inicio = inserir;
        }
      }
    }
  }


  public void imprime(){
    No aux = inicio;
    while (aux!=null){
      System.out.println(aux.toString());
      aux = aux.proximo;
    }

  }

  public No remover(String conteudo){
    //localizar elemento a ser removido
    No aux = inicio;
    No remover = null;
    No anterior = null;
    while(aux!=null){
      if (aux.toString().contains(conteudo)){
        remover = aux;
        break;
      }
      anterior = aux;
      aux = aux.proximo;
    }
    //verificar se o elemento a ser removido e o inicio
    if (remover == inicio){
      inicio = remover.proximo;
      remover.proximo = null;
      if (remover == fim)
        fim = null;
      return remover;
    }
    else if (remover!=null && anterior!=null){
      //se o elemento esta no meio da estrutura
      anterior.proximo = remover.proximo;
      remover.proximo = null;
      //se o elmento esta no final da estrutura
      if (remover == fim){
        fim = anterior;
      }
      return remover;
    }
    else{
      //nao tem elementos para remover
      return null;
    }

  }
  

}
