package br.com.poc.dao;

import java.io.Serializable;

import javax.ejb.Stateless;

import br.com.poc.model.Item;

@Stateless
public class ItemDAO extends GenericDAO<Item> implements Serializable {

	private static final long serialVersionUID = 1L;

}
