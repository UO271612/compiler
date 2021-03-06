/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	if:sentencia -> condicion:expresion  cierto:sentencia*  falso:sentencia*

public class If extends AbstractSentencia {

	public If(Expresion condicion, List<Sentencia> cierto, List<Sentencia> falso) {
		this.condicion = condicion;
		this.cierto = cierto;
		this.falso = falso;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, cierto, falso);
	}

	public If(Object condicion, Object cierto, Object falso) {
		this.condicion = (Expresion) getAST(condicion);
		this.cierto = this.<Sentencia>getAstFromContexts(cierto);
		this.falso = this.<Sentencia>getAstFromContexts(falso);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, cierto, falso);
	}

	public Expresion getCondicion() {
		return condicion;
	}
	public void setCondicion(Expresion condicion) {
		this.condicion = condicion;
	}

	public List<Sentencia> getCierto() {
		return cierto;
	}
	public void setCierto(List<Sentencia> cierto) {
		this.cierto = cierto;
	}

	public List<Sentencia> getFalso() {
		return falso;
	}
	public void setFalso(List<Sentencia> falso) {
		this.falso = falso;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion condicion;
	private List<Sentencia> cierto;
	private List<Sentencia> falso;

	public String toString() {
       return "{condicion:" + getCondicion() + ", cierto:" + getCierto() + ", falso:" + getFalso() + "}";
   }
}
