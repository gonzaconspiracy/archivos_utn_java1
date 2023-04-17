// package com.proyecto.clases;

public class Pronostico {

	// Atributos de Clase
	private Partido partido;
	private Equipo equipo;
	private ResultadoEnum resultado;

	// Constructor
	public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado) {
		super();
		this.partido = partido;
		this.equipo = equipo;
		this.resultado = resultado;
	}

	public ResultadoEnum getResultado() {
		return this.resultado;
	}

	public void setResultado(ResultadoEnum resultado) {
		this.resultado = resultado;
	}

	public int puntos() {
		ResultadoEnum resultadoReal = this.partido.resultado(this.equipo);
		if (this.resultado.equals(resultadoReal)) {
			return 1;
		} else {
			return 0;
		}

	}

}