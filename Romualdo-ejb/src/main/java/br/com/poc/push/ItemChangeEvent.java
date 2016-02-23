package br.com.poc.push;

import br.com.poc.model.Item;

public class ItemChangeEvent {
	
	private Item item;

    public ItemChangeEvent(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

}
