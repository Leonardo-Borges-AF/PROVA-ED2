class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");


    ListaDinamica lista = new ListaDinamica();

    Pessoa p1 = new Pessoa("Joao","Engenheiro");
    Pessoa p2 = new Pessoa("Maria","Medica");
    Pessoa p3 = new Pessoa("Jacques","Professor");

    Pessoa p4 = new Pessoa("Abel","Engenheiro");
    Pessoa p5 = new Pessoa("Zenaide","Medica");
    Pessoa p6 = new Pessoa("Paulo","Professor");

    
    lista.insere_meio(new No(p1));
    lista.insere_meio(new No(p2));
    lista.insere_meio(new No(p3));
    lista.insere_meio(new No(p4));
    lista.insere_meio(new No(p5));
    lista.insere_meio(new No(p6));

    lista.imprime();

    System.out.println("Ponteiro Inicio: "+lista.inicio.hashCode());
    System.out.println("Ponteiro Fim: "+lista.fim.hashCode());

    lista.remover("Jacques");
    lista.imprime();
    
  }
}
