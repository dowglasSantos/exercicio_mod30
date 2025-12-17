package main.java;

import main.java.br.com.rpires.dao.ClienteDAO;
import main.java.br.com.rpires.dao.ProdutoDAO;
import main.java.br.com.rpires.domain.Cliente;
import main.java.br.com.rpires.domain.Produto;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws br.com.rpires.exceptions.DAOException, br.com.rpires.exceptions.TipoChaveNaoEncontradaException {
        Cliente cliente = new Cliente();
        cliente.setNome("testando o novo campo");
        cliente.setCpf(4882985047l);
        cliente.setEmail("email@teste.com");
        cliente.setTel(55991796287l);
        cliente.setEnd("Rua Alagados");
        cliente.setNumero(350);
        cliente.setCidade("Santa Maria");
        cliente.setEstado("RS");

        Produto produto = new Produto();
        produto.setNome("Testando o compo novo do produto");
        produto.setCodigo("4558787441");
        produto.setDescricao("Testando o novo produto");
        BigDecimal valor = new BigDecimal("10.50");
        produto.setValor(valor);
        produto.setRaridade("raro");

        ClienteDAO dao = new ClienteDAO();
        ProdutoDAO dao2 = new ProdutoDAO();

//        dao.cadastrar(cliente);
            dao2.cadastrar(produto);
    }
}


/*
id bigint,
codigo varchar(10) not null,
nome varchar(50) not null,
descricao varchar(100) not null,
valor numeric(10,2) not null,
* */