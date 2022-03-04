package com.test.refactoring.Business;

public class Coche {

	private String matricula;
	private String color;
	private String combustible;
	private Integer numPlazas;
	private String nombreConductor;
	private String dniConductor;

	public Coche() {
		super();
	}

	/**
	 * 
	 * @param matricula
	 * @param color
	 * @param combustrible
	 * @param numPlazas
	 * @param nombreConductor
	 * @param dniConductor
	 */

	public Coche(String matricula, String color, String combustrible, Integer numPlazas, String nombreConductor,
			String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustrible;
		this.numPlazas = numPlazas;
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
	 * Recibe la matricula del coche
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
	 * Recibe el color del coche
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
	 * Recibe el tipo de combustible del coche
	 * 
	 * @param combustible
	 */

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	/**
	 * 
	 * @return Integer numPlazas
	 */

	public Integer getNumPlazas() {
		return numPlazas;
	}

	/**
	 * Recibe el número de plazas del coche
	 * 
	 * @param numPlazas
	 */

	public void setNumPlazas(Integer numPlazas) {
		this.numPlazas = numPlazas;
	}

	/**
	 * 
	 * @return String nombre del conductor
	 */

	public String getNombreConductor() {
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
	 * @return String dniconductor
	 */

	public String getDniConductor() {
		return dniConductor;
	}

	/**
	 * Recibe el Dni del conductor
	 * 
	 * @param dniConductor
	 */

	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}

	/**
	 * Recibe un método void de acelerar para ver si esta acelerando o si la
	 * velocidad no es adecuada
	 * 
	 * @param velocidad
	 */

	public void acelerar(Integer velocidad) {
		if (velocidad > 0 && velocidad < 120) {
			System.out.println("El coche est� acelerando y llegar� la velocidad de " + velocidad.intValue() + " km/h");
		} else {
			System.out.println("La velocidad indicada no est� permitida en un coche seg�n la DGT");
		}
	}

	/**
	 * Recibe como método void detener para decir cuando el coche se detendra y
	 * buscar un lugar para estacionar
	 */

	public void detener() {
		System.out.println("El coche se detendr� en breve, aseg�rese de buscar un lugar adecuado para estacionar");
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", numPlazas="
				+ numPlazas + ", nombre_conductor=" + nombreConductor + ", dniConductor=" + dniConductor + "]";
	}

}
