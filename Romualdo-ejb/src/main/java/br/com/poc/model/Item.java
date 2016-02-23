package br.com.poc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import br.com.poc.push.ItemChangeListener;

@Entity
@EntityListeners(ItemChangeListener.class)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "dtype", discriminatorType = DiscriminatorType.STRING)
public class Item extends GenericEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(length = 100, nullable = false)
	private String variavel;

	@Column(insertable = false, updatable = false)
	private String dtype;

	public String getVariavel() {
		return variavel;
	}

	public void setVariavel(String variavel) {
		this.variavel = variavel;
	}

}
