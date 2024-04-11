package escola;

public class Escola {

    public static void main(String[] args) {
        Professor prof = new Professor(12, "(51)98745-4567", "Ivonei", 38, "04047687090");
        System.out.println("Professor: " + prof.nome);
        System.out.println("Telefone: " + prof.getFone()); //variável private só pode ser acessada via método
        System.out.println("CPF: " + prof.getCpf());
        
        System.out.println("----------------------");
        
        Aluno aluno = new Aluno(30, "ADS", "Manhã", "Thiago", 19, "04047687090");
        aluno.dadosAluno();
    }
    
}
