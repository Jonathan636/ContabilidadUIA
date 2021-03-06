package uia.com.contabilidad.cheques;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import uia.com.contabilidad.clientes.InfoUIA;

public class NotaDesembolsoCheque extends InfoUIA {
	String fecha = "";

	public NotaDesembolsoCheque() {
	}

	public NotaDesembolsoCheque(@JsonProperty("id") int id, @JsonProperty("name") String name,
			@JsonProperty("estado") String status, @JsonProperty("fecha") String fecha,
			@JsonProperty("concepto") String concepto) {
		super(id, name);
		this.setEstado(status);
		super.type = this.getClass().getSimpleName();
		this.setFecha(fecha);
	}

	public NotaDesembolsoCheque(int id, String name, String p1) {
		super(id, name);
		this.fecha = p1;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void validaCobranza() {
		System.out.println("Ejecutando validaCobranza() de  " + this.getId() + "  " + this.getName());
	}

}