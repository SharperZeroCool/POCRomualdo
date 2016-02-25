package br.com.poc.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import br.com.poc.model.Item;
import br.com.poc.service.SimpleService;

@ManagedBean
@ViewScoped
public class SimpleBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private SimpleView simpleView;

	@Inject
	private SimpleService service;

	public List<Item> listarItens() {
		this.atualizarView();
		return simpleView.getItens();
	}

	public String prepararEdicao() {
		return "/edicao.xhtml";
	}
	
	public String salvar() {
		service.salvar(simpleView.getItem());
		this.atualizarView();
		return "/consulta.xhtml";
	}

	public String editar() {
		service.editar(simpleView.getItem());
		this.atualizarView();
		return "/consulta.xhtml";
	}
	
	public String excluir(Item item) {
		service.excluir(item);
		this.atualizarView();
		return "/consulta.xhtml";
	}

	public void atualizarView() {
		simpleView.setItens(service.listar());
	}

	public SimpleView getSimpleView() {
		return simpleView;
	}

	public void setSimpleView(SimpleView simpleView) {
		this.simpleView = simpleView;
	}

}
