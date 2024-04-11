package escola;

public class Aluno extends Pessoa implements Secretaria{
    private int RA;
    private String curso;
    private String turno;

    //construtor
    public Aluno(int RA, String curso, String turno, String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.RA = RA;
        this.curso = curso;
        this.turno = turno;
    }
    
    //getter e setter
    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    
    public void dadosAluno() {
        super.mostrar();
        System.out.println("RA: " + this.RA
                + "\nCurso: " + this.curso
                + "\nTurno: " + this.turno);
    }

    @Override
    public void info() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
