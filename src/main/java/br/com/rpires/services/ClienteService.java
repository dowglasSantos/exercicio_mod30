package main.java.br.com.rpires.services;

import main.java.br.com.rpires.dao.IClienteDAO;
import main.java.br.com.rpires.domain.Cliente;
import main.java.br.com.rpires.services.generic.GenericService;
import main.java.br.com.rpires.services.IClienteService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	//private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws br.com.rpires.exceptions.DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (br.com.rpires.exceptions.MaisDeUmRegistroException | br.com.rpires.exceptions.TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}
