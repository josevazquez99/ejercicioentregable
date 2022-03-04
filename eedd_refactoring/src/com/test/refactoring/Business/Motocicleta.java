package com.test.refactoring.Business;

public class Motocicleta {

	private String matricula;
	private String color;
	private String combustible;
	private Integer cilindrada;
	private String nombreConductor;
	private String dniConductor;

	/**
	 * 
	 * @param matricula
	 * @param color
	 * @param combustible
	 * @param cilindrada
	 * @param nombreConductor
	 * @param dniConductor
	 */

	public Motocicleta(String matricula, String color, String combustible, Integer cilindrada, String nombreConductor,
			String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustible;
		this.cilindrada = cilindrada;
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
	 * Recibe la matricula de la motocicleta
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
	 * Recibe el color de la motocicleta
	 * 
	 * @param color
	 */

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * 
	 * @return String Combustible
	 */

	public String getCombustible() {
		return combustible;
	}

	/**
	 * Recibe el tipo de combustible de la motocicleta
	 * 
	 * @param combustible
	 */

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	/**
	 * 
	 * @return Integer cilindrada
	 */

	public Integer getCilindrada() {
		return cilindrada;
	}

	/**
	 * Recibe el número de cilindrada de la motocicleta
	 * 
	 * @param cilindrada
	 */

	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	/**
	 * 
	 * @return String Nombre del conductor
	 */

	public String getNombreConductor() {
		return nombreConductor;
	}

	/**
	 * Recibe del nombre del conductor de la motocicleta
	 * 
	 * @param nombreConductor
	 */

	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	/**
	 * 
	 * @return String Dni Condcutor
	 */

	public String getDniConductor() {
		return dniConductor;
	}

	/**
	 * Recibe el dni del conductor de la motocicleta
	 * 
	 * @param dniConductor
	 */

	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}

	/**
	 * Recibe el método acelerar que está por hacer
	 * 
	 * @param velocidad
	 */

	public void acelerar(Integer velocidad) {
		// TO DO
	}

	/**
	 * Recibe el método detener que está por hacer
	 */

	public void detener() {
		// TO DO
	}

	@Override
	public String toString() {
		return "motocicleta [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible
				+ ", cilindrada=" + cilindrada + ", nombre_conductor=" + nombreConductor + ", dniConductor="
				+ dniConductor + "]";
	}

}
