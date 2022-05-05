package hospital;
public class Ala{
   public int id;
   public String especialidade;

    public Ala(int id, String especialidade) {
        this.id = id;
        this.especialidade = especialidade;
    }
    public void exibirRelatorio(){
        System.out.println("\n========= ALA =========\nId: "+this.id + "\nEspecialidade: "+this.especialidade + "\n=======================\n");
    }
    

}
