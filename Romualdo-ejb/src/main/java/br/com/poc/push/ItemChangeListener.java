package br.com.poc.push;

import javax.enterprise.inject.spi.CDI;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;

import br.com.poc.model.Item;

public class ItemChangeListener {

	@PostPersist
	@PostUpdate
	@PostRemove
	public void onChange(Item item) {
		CDI.current().getBeanManager().fireEvent(new ItemChangeEvent(item));
	}

}
