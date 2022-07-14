public class Main {
    public static void main (String [ ] args) {

        int ifNumber = 2;
        System.out.println(esPositivo(ifNumber));
        ifNumber = -1;
        System.out.println(esPositivo(ifNumber));
        ifNumber = 0;
        System.out.println(esPositivo(ifNumber));
        System.out.println("---------------------");
        //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        // el bloque de código que tendrá el bucle deberá:
        // Incrementar el valor de la variable en uno cada vez que se ejecute.
        // Mostrarlo por pantalla cada vez que se ejecute.
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile ++;
        }
        System.out.println("---------------------");
        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        do {
            numeroWhile=2;
            System.out.println(numeroWhile);
            numeroWhile ++;
        }while (numeroWhile < 3);
        System.out.println("---------------------");

        for(int numeroFor = 0 ; numeroFor <= 3 ; numeroFor ++){
            System.out.println(numeroFor);
        }
        System.out.println("---------------------");
        String estacion = "Verano";
        estacion(estacion);
        System.out.println("---------------------");
        estacion = "Invierno";
        estacion(estacion);
        System.out.println("---------------------");
        estacion = "Otoño";
        estacion(estacion);
        System.out.println("---------------------");
        estacion = "Primavera";
        estacion(estacion);
        System.out.println("---------------------");
        estacion = "asdasdasd";
        estacion(estacion);
        System.out.println("---------------------");
    }


    public static String esPositivo (int numero) {
        // La función va a recibir un entero. Devuelve como resultado una cadena de texto que indica si el número es positivo o negativo.
        // Si el número es positivo, devolver ---> "Es positivo"
        // Si el número es negativo, devolver ---> "Es negativo"
        // Si el número es 0, devuelve "0"
        if (numero == 0) {
            return "0";
        } else if (numero > 0) {
            return "Es positivo";
        } else {
            return "Es negativo";
        }
    }

    public static void estacion (String estacion) {
        /*Por último, para el Switch, deberás crear la variable estacion,
        y distintos case para las cuatro estaciones del año.
        Dependiendo del valor de la variable estacion se
        deberá mandar un mensaje por consola informando de la estación en la que está.
        También habrá que poner un default para cuando el valor de la variable no sea una estación.66*/

        switch (estacion){
            case "Verano":{
                System.out.println("Verano");
                break;
            }
            case "Invierno":{
                System.out.println("Invierno");
                break;
            }
            case "Primavera":{
                System.out.println("Primavera");
                break;
            }
            case "Otoño":{
                System.out.println("Otoño");
                break;
            }
            default: {
                System.out.println("El valor ingresado no es una estacion.");
            }

        }

    }



}
