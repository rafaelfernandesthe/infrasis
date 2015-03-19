package models;

import javax.persistence.Column;
import javax.persistence.Entity;

//@Entity
public class AutoInfracao extends Infracao {

	private static final long serialVersionUID = -4619362112043650365L;

	@Column(nullable = false)
	private String localizacaoDaPasta;

	public AutoInfracao() {
	}

	public String getLocalizacaoDaPasta() {
		return localizacaoDaPasta;
	}

	public void setLocalizacaoDaPasta(String localizacaoDaPasta) {
		this.localizacaoDaPasta = localizacaoDaPasta;
	}

}
