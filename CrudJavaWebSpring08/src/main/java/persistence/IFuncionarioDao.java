package persistence;

import java.sql.SQLException;
import java.util.List;

import model.Funcionario;

public interface IFuncionarioDao {
	
	public String iudFuncionario (String acao, Funcionario f) throws SQLException, ClassNotFoundException;
	public List<Funcionario> listarFuncionario() throws SQLException, ClassNotFoundException;

}