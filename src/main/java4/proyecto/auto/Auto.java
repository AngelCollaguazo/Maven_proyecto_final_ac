package proyecto.auto;

import java.time.LocalDate;

public class Auto {
	protected String estado;
	protected String placa;
	protected String modelo;
	protected String marca;
	protected String anioFabricacion;
	protected String paisFabricacion;
	protected int cilindraje;
	protected int avaluo;
	protected LocalDate fechaReserva;
	private String cedulaCliente;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAnioDeFabricacion() {
		return anioFabricacion;
	}

	public void setAnioDeFabricacion(String anioDeFabricacion) {
		this.anioFabricacion = anioDeFabricacion;
	}

	public String getPaisFabricacion() {
		return paisFabricacion;
	}

	public void setPaisFabricacion(String paisFabricacion) {
		this.paisFabricacion = paisFabricacion;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public int getAvaluo() {
		return avaluo;
	}

	public void setAvaluo(int avaluo) {
		this.avaluo = avaluo;
	}

	public LocalDate getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(LocalDate fechReserva) {
		this.fechaReserva = fechaReserva;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

}