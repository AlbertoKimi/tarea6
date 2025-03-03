
public class CCuenta {
    /**
     * @author Alberto Vera Mateos
     *         Esta clase simula la cuenta de un usuario, mostrando atributos de su
     *         cuenta y con dos métodos: uno para retirar dinero y otro para
     *         ingresar dinero
     */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    /**
     * Constructor de la clase CCuenta
     * 
     * @param nom  Es el nombre del usuario de la cuenta
     * @param cue  Es el nombre del usuario de la cuenta
     * @param sal  Es el salario de la cuenta
     * @param tipo Es el tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método para darnos el estado de la cuenta.
     * 
     * @return double retorna el saldo de la cuenta
     */
    public double estado() {
        return saldo;
    }

    /**
     * Get del nombre del usuario de la cuenta
     * 
     * @return retorna el nombre del usuario de la cuenta
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Set del nombre del usuario de la cuenta. Cambia el nombre del usuario de la
     * cuenta
     * 
     * @param nombre Tipo String. Introducimos un nuevo nombre de usuario de la
     *               cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get del nombre de la cuenta
     * 
     * @return retorna el nombre de la cuenta
     */
    public String getCuenta() {
        return this.cuenta;
    }

    /**
     * Set del nombre de la cuenta. Cambia el nombre de la cuenta
     * 
     * @param cuenta Tipo String. Introducimos un nuevo nombre de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Get del nombre del saldo de la cuenta
     * 
     * @return el saldo de la cuenta.
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Set del saldo de la cuenta. Cambia el saldo de la cuenta
     * 
     * @param saldo Tipo double. Introducimos un nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Get del tipo de interés de la cuenta
     * 
     * @return el tipo de interés de la cuenta
     */
    public double getTipoInterés() {
        return this.tipoInterés;
    }

    /**
     * Set del tipo de interés de la cuenta. Cambia el tipo de interés de la cuenta
     * 
     * @param tipoInterés Tipo double. Introducimos un nuevo tipo de interés de la
     *                    cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Método para ingresar dinero en la cuenta
     * 
     * @param cantidad Tipo double. Introducimos la cantidad a ingresar
     * @throws Exception Salta cuando introducimos una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Método para retirar dinero de la cuenta.
     * 
     * @param cantidad Tipo double. Introducimos la cantidad a retirar
     * @throws Exception Hay dos excepciones: una cuando intentamos introducir una
     *                   cantidad negativa y otra cuando no hay saldo suficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
