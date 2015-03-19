package models;

import javax.persistence.Column;
import javax.persistence.Entity;

//@Entity
public class Multa extends Infracao {

	private static final long serialVersionUID = -7933006334042024L;

	@Column(nullable = false)
	private String pathFile;

	public Multa() {
	}

	public String getPathFile() {
		return pathFile;
	}

	public void setPathFile(String pathFile) {
		this.pathFile = pathFile;
	}

}
