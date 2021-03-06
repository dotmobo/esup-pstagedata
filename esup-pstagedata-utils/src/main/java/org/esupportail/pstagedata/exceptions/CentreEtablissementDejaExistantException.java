package org.esupportail.pstagedata.exceptions;

/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class CentreEtablissementDejaExistantException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public CentreEtablissementDejaExistantException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public CentreEtablissementDejaExistantException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}
