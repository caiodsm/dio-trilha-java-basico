package escola;

//arquivo Escola.java
public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(8);
        felipe.setSexo("indefinido");
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos, do sexo " + felipe.getSexo());	
	}
}