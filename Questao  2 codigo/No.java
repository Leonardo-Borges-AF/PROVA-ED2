public class No{
  Pessoa p;
  No proximo;
  No anterior;

  public No(Pessoa pe){
    this.p = pe;

  }

  public String toString(){
    if (proximo!=null)
      return "Obj Pessoa: "+p.toString() + "| Proximo: "+proximo.hashCode() + " HASH OBJ: "+this.hashCode();
    else
      return "Obj Pessoa: "+p.toString() + "| Proximo: Vazio"+ " HASH OBJ: "+this.hashCode();
      
  }
  

}
