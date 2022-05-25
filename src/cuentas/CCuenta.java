package cuentas;

/**
 * Está clase sirve para almacener datos de la cuenta bancaria
 *@author Anna Barcons Portet
 *@version v1.0
 *@since 24/05/2022
 */

public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * 
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

//Declaración de atributos de clase
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

 //Constructores
    public CCuenta()
    {
    }
/**
 * 
 * @param nom parámetro que define el nombre de tipo String
 * @param cue parámetroq que define la cuenta de tipo String
 * @param sal parámetro que define el saldo de tipo double
 * @param tipo parámetro que define el tipo de interés de tipo double
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    //Metodos 
    /**
     * @return saldo
     */
         public double estado()
    {
        return getSaldo();
    }
/**
 * @param cantidad
 * @throws Exception - excepción genéricas
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * @param cantidad
 * @throws Exception - excepción genéricas
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}