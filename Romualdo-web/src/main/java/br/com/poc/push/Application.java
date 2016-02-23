package br.com.poc.push;

import javax.enterprise.event.Observes;
import javax.faces.bean.ApplicationScoped;

@ApplicationScoped
public class Application {

	public void onMenuChange(@Observes ItemChangeEvent event) {
		Push.sendAll("updateTable");
	}

}
