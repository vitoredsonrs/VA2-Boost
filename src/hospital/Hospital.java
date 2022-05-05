package hospital;
/**
 * @author Vitor Edson
 */
public class Hospital {
     public static void main(String[] args) {
         
         Ala a1 = new Ala(22, "Covid");
         Ala a2 = new Ala(21, "Sindrome Gripal");
         
         Quarto q1 = new Quarto(10);
         Quarto q2 = new Quarto(27);
         
         Paciente p1 = new Paciente("João Gomez", "Covid", 15, "Getúlio Silva");
         Paciente p2 = new Paciente("Pedro Carvalho","Dengue",  8, "José maria");
         Paciente p3 = new Paciente("Joaquim Borges","Tosse aguda", 2, "Henrique Rodrigues");
         Paciente p4 = new Paciente("Danilo Gonçalves", "Remoção do figado", 28, "Rodrigo Souza");

         p1.exibirRelatorioPaciente();
         p2.exibirRelatorioPaciente();
         p3.exibirRelatorioPaciente();
         p4.exibirRelatorioPaciente();
     }
    
}
