public class ejercicio1 {
    public static void cadena() {
        String cadena="La lluvia en Sevilla es una maravilla";
        int contador=0;
        for (int i=1;i<cadena.length();i++){
        //Comprobamos si el caracter es una vocal
        if(cadena.charAt(i)='a' || cadena.charAt(i)='e' || cadena.charAt(i)='i' || cadena.charAt(i)='o' || cadena.charAt(i)='u') {
        System.out.println("Encontramos una vocal");
        }
        contador++;
        }
        System.out.println("Hay " + contador + " vocales");
        }
        
}
