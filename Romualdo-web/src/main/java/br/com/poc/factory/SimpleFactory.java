package br.com.poc.factory;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import com.google.common.base.Strings;

import br.com.poc.model.Item;
import br.com.poc.qualifier.SimpleBean;
import br.com.poc.service.SimpleService;
import br.com.poc.util.FacesUtil;

public class SimpleFactory {

	@Inject
	private SimpleService simpleService;

	@Produces
	@SimpleBean
	public Item produzirPessoa() {
		Item entidade = new Item();
		String idItem = FacesUtil.getRequestParameter("idItem");
		if (!Strings.isNullOrEmpty(idItem)) {
			Long idLong = new Long(idItem);
			entidade = (Item) simpleService.buscar(idLong);
		}
		
		return entidade;
	}

}
