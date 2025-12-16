package main.java.br.com.rpires.dao;

import main.java.br.com.rpires.dao.generic.IGenericDAO;
import main.java.br.com.rpires.domain.Venda;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws br.com.rpires.exceptions.TipoChaveNaoEncontradaException, br.com.rpires.exceptions.DAOException;
	
	public void cancelarVenda(Venda venda) throws br.com.rpires.exceptions.TipoChaveNaoEncontradaException, br.com.rpires.exceptions.DAOException;
}
