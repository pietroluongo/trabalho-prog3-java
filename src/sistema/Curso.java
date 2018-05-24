package sistema;

import java.util.HashMap;
import java.util.Map;

public class Curso
{
	private final int codigo;
	private final String nome;
	private final boolean graduacao;
	
	// Mapa que relaciona o id do docente com o total de horas aula dele nesse curso
	private Map<Integer, Integer> MapaDocenteTotalHoras = new HashMap<>();
	
	public int getCodigo() { return this.codigo; }
	
	public Curso(int codigo, String nome, String graduacao, String posGraduacao)
	{
		this.codigo = codigo;
		this.nome = nome;
		//TODO refatorar isso
		//TODO checar casos de contorno (as duas strings vazias, as duas strings diferentes de "X")
		if(graduacao == "X")
		{
			this.graduacao = true;
		}
		else
		{
			this.graduacao = false;
		}
	}
	
	public Curso(int codigo, String nome, boolean grad)
	{
		this.codigo = codigo;
		this.nome = nome;
		this.graduacao = grad;
	}
	
	@Override
	public String toString()
	{
		return "Nome do curso: " + this.nome + "\nCódigo do curso: " + this.codigo + "\nÉ graduação: " + this.graduacao;
	}
	
	public void adicionaHorasADocente(int codigoDocente, int horas)
	{
		if (this.MapaDocenteTotalHoras.containsKey(codigoDocente))
		{
			this.MapaDocenteTotalHoras.put(codigoDocente, this.MapaDocenteTotalHoras.get(codigoDocente) + horas);
		}
		else
		{
			this.MapaDocenteTotalHoras.put(codigoDocente, horas);
		}
	}
	
}
