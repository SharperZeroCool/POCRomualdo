package br.com.poc.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.poc.model.Item;
import br.com.poc.qualifier.SimpleBean;

@Named
public class SimpleView implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	@SimpleBean
	private Item item;

	private List<Item> itens = new ArrayList<Item>();

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

}
