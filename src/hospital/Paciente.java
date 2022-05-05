package hospital;
public class Paciente extends Medico{
    public String nome, estadoSaude;
    public int diasInternado;

    public Paciente(String nome,String estadoSaude, int diasInternado, String medicoNome) {
        this.nome = nome;
        this.diasInternado = diasInternado;
        this.medicoNome= medicoNome;
        this.estadoSaude = estadoSaude;
    }
        
    public void exibirRelatorioPaciente(){
        System.out.println("========Paciente========\nNome: "+ this.getNome()+ "\nMédico responsavel: "+this.medicoNome+ "\nDoença: "+this.estadoSaude+"\nDias internado:"+ this.getDiasInternado()+"\n========================");
    }

    public String getMedicoNome() {
        return medicoNome;
    }

    public void setMedicoNome(String medicoNome) {
        this.medicoNome = medicoNome;
    }
    public void retornarDiasInternado(){
        this.getDiasInternado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiasInternado() {
        return diasInternado;
    }

    public void setDiasInternado(int diasInternado) {
        this.diasInternado = diasInternado;
    }

    public String getEstadoSaude() {
        return estadoSaude;
    }

    public void setEstadoSaude(String estadoSaude) {
        this.estadoSaude = estadoSaude;
    }
    
}
