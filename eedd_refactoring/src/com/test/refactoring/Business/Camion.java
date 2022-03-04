package com.test.refactoring.Business;

public class Camion {

	private String matricula;
	private String color;
	private String combustible;
	private String tipoCarnet;
	private String nombreConductor;
	private String dniConductor;

	public Camion() {
		super();
	}

	/**
	 * 
	 * @param matricula
	 * @param color
	 * @param combustible
	 * @param tipoCarnet
	 * @param nombreConductor
	 * @param dniConductor
	 */

	public Camion(String matricula, String color, String combustible, String tipoCarnet, String nombreConductor,
			String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustible;
		this.tipoCarnet = tipoCarnet;
		this.nombreConductor = nombreConductor;
		this.dniConductor = dniConductor;
	}

	/**
	 * 
	 * @return String matricula
	 */

	public String getMatricula() {
		return matricula;
	}

	/**
	 * Recibe la matrícula del camion
	 * 
	 * @param matricula
	 */

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * 
	 * @return String color
	 */

	public String getColor() {
		return color;
	}

	/**
	 * Recibe el color del camion
	 * 
	 * @param color
	 */

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * 
	 * @return String combustible
	 */

	public String getCombustible() {
		return combustible;
	}

	/**
	 * Recibe el tipo de combustible que se trata
	 * 
	 * @param combustible
	 */

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	/**
	 * 
	 * @return String Tipo Carnet
	 */

	public String getTipoCarnet() {
		return tipoCarnet;
	}

	/**
	 * Recibe el tipo de carnet que se trata
	 * 
	 * @param tipoCarnet
	 */

	public void setTipoCarnet(String tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}

	/**
	 * 
	 * @return String nombre conductor
	 */

	public String getNombreconductor() {
		return nombreConductor;
	}

	/**
	 * Recibe el nombre del conductor
	 * 
	 * @param nombreConductor
	 */

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	/**
	 * 
	 * @return String dni conductor
	 */

	public String getDniConductor() {
		return dniConductor;
	}

	/**
	 * Recibe el dni del conductor
	 * 
	 * @param dniConductor
	 */

	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}

	/**
	 * Recibe como Integer el método acelerar para decir que el camión está
	 * acelerando adecuadamente.
	 * 
	 * @param velocidad
	 */

	public void acelerar(Integer velocidad) {
		System.out.println("La aceleraci�n del cami�n se realizar� progresivamente para conservar sus neum�ticos");

		// TO DO
		// Incluir l�gica de movimiento
	}

	/**
	 * Recibe como void el método detener para decir que el camión se detendrá y
	 * puede ocasionar accidentes.
	 */

	public void detener() {
		System.out
				.println("CUIDADO!! La detenci�n de un veh�culo de gran tama�o puede ocasionar accidentes de tr�fico");
	}

	@Override
	public String toString() {
		return "Camion [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", tipoCarnet="
				+ tipoCarnet + ", nombre_conductor=" + nombreConductor + ", dniConductor=" + dniConductor + "]";
	}

}
