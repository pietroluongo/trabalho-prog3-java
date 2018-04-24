package util;

import java.util.Vector;

import sistema.*;

public class ArgParse
{
	// Parsed arguments
	final String fname_Discentes;
	final String fname_Docentes;
	final String fname_Producoes;
	final String fname_Cursos;
	final String fname_Disciplinas;
	final String fname_Atividades;
	
	// Data from system
	private Data systemData;
	
	/*
	* ArgParse -> Recebe de entrada os argumentos do programa e processa eles adequadamente,
	* salvando as informações em uma instância da classe ArgParse.
	*/
	public ArgParse(String[] args)
	{
		this.systemData = new Data();
		int curPos = 0;
		String d = "";
		String a = "";
		String p = "";
		String c = "";
		String r = "";
		String o = "";
		
		while (curPos < args.length)
		{
			switch(args[curPos])
			{
				case "-d":
					d = args[curPos + 1];
					curPos += 2;
					break;
				case "-a":
					a = args[curPos + 1];
					curPos += 2;
					break;
				case "-p":
					p = args[curPos + 1];
					curPos += 2;
					break;
				case "-c":
					c = args[curPos + 1];
					curPos += 2;
					break;
				case "-r":
					r = args[curPos + 1];
					curPos += 2;
					break;
				case "-o":
					o = args[curPos + 1];
					curPos += 2;
					break;
				default:
					break;
			}
		}
		
		this.fname_Docentes = d;
		this.fname_Discentes = a;
		this.fname_Producoes = p;
		this.fname_Cursos = c;
		this.fname_Disciplinas = r;
		this.fname_Atividades = o;	
	}
	
	public void LoadData()
	{
		/*
		//Discentes
		Vector<String[]> discentes_data = CSV.load_data("/dados/gpietro/trabalho_prog3/discentes.csv");
		for (String[] line : discentes_data)
		{
			this.systemData.Adiciona_Discente(line);
		}
		*/
		this.systemData.Carrega_Discentes("/dados/gpietro/trabalho_prog3/discentes.csv");
		/*
		//Docentes
		Vector<String[]> docentes_data = CSV.load_data("/dados/gpietro/trabalho_prog3/docentes.csv");
		for(String[] line : docentes_data)
		{
			this.systemData.Adiciona_Docente(line);
		}
		*/
		this.systemData.Carrega_Docentes("/dados/gpietro/trabalho_prog3/docentes.csv");
		/*
		//Produções
		Vector<String[]> producoes_data = CSV.load_data("/dados/gpietro/trabalho_prog3/producoes.csv");
		for(String[] line : producoes_data)
		{
			this.systemData.Adiciona_Producao(line);
		}
		*/
		this.systemData.Carrega_Producoes("/dados/gpietro/trabalho_prog3/producoes.csv");
		this.systemData.DEBUG();
	}
	
	
}
