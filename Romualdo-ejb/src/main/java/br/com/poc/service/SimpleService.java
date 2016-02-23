package br.com.poc.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.poc.dao.ItemDAO;
import br.com.poc.model.GenericEntity;
import br.com.poc.model.Item;

public class SimpleService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	ItemDAO ItemDAO;

	public void salvar(GenericEntity entidade) {
		ItemDAO.salvar((Item) entidade);
	}

	public GenericEntity salvarERetornar(GenericEntity entidade) {
		ItemDAO.salvarERetornar((Item) entidade);
		return (Item) entidade;
	}

	public void editar(GenericEntity entidade) {
		ItemDAO.editar((Item) entidade);
	}

	public void excluir(Long id) {
		Item Item = ItemDAO.buscar(id);
		excluir(Item);
	}

	public void excluir(GenericEntity entidade) {
		ItemDAO.excluir((Item) entidade);
	}

	public GenericEntity buscar(Long id) {
		return ItemDAO.buscar(id);
	}

	public List<Item> listar() {
		return ItemDAO.listar();
	}

}
