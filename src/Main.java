public class Main {

    /**
     * @author Alberto Vera Mateos
     *         El método main para probar nuestra clase CCuenta. Tenemos un main y
     *         un método para poder ingresar y retirar dinero de una cuenta
     * @param args Pasamos argumentos tipo String
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

        operativa_cuenta(cuenta1, 695);
        operativa_cuenta(cuenta1, 500);
        operativa_cuenta(cuenta1, 300);

    }

    /**
     * Método para probar la retirada e ingreso de una cantidad a una cuenta
     * @param cuenta Tipo CCUenta. Pasamos una cuenta para que nos haga una serie de operaciones
     * @param cantidad Tipo float. Cantidad que queremos ingresar.
     * @return Nos retorna el saldo final de nuestra cuenta una vez realizada una serie de operaciones.
     */
    public static double operativa_cuenta(CCuenta cuenta, float cantidad) {
        try {
            System.out.println("Retirada de dinero");
            cuenta.retirar(2300);
            System.out.println("El saldo después de retirar es: " + cuenta.estado());
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
            System.out.println("El saldo después de ingresar es: " + cuenta.estado());
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

        return cuenta.estado();
    }
}
