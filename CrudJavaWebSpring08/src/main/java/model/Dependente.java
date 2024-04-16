package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Dependente {
	
	private int codigo;
	private String nome;
	private double salario;
	private Funcionario funcionario;
}
