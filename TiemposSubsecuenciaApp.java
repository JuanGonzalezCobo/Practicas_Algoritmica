public class TiemposSubsecuenciaApp {
    private static final int NUM_ITERACIONES = 10;

    public static void main(String[] args) {
        // Creamos el objeto de la Subsecuencia
        Subsecuencia subsecuencia;
        long tiempoInicio, tiempoFinal;

        for (int n = 64; n <= 8192; n *= 2) {
            subsecuencia = new Subsecuencia(n);
            long[] tiemposPrueba = new long[3];

            // * SUBSECUENCIA FUERZA BRUTA
            // ********************************
            for (int i = 0; i < NUM_ITERACIONES; i++) {

                tiempoInicio = System.nanoTime();
                subsecuencia.subsecuenciaFuerzaBruta();
                tiempoFinal = System.nanoTime();

                tiemposPrueba[0] = tiempoFinal - tiempoInicio;
            }

            // * SUBSECUENCIA MEJORADA
            // ********************************
            for (int i = 0; i < NUM_ITERACIONES; i++) {

                tiempoInicio = System.nanoTime();
                subsecuencia.subsecuenciaMejorado();
                tiempoFinal = System.nanoTime();

                tiemposPrueba[1] = tiempoFinal - tiempoInicio;
            }

            // * SUBSECUENCIA LINEAL
            // ********************************
            for (int i = 0; i < NUM_ITERACIONES; i++) {

                tiempoInicio = System.nanoTime();
                subsecuencia.subsecuenciaLineal();
                tiempoFinal = System.nanoTime();

                tiemposPrueba[2] = tiempoFinal - tiempoInicio;
            }

            System.out.printf("""
                    --- TIEMPOS MEDIOS DE LA SUBSECUENCIA CON %d ELEMENTOS ---
                    Subsecuencia con fuerza bruta: %.2f
                    Subsecuencia mejorada: %.2f
                    Subsecuencia lineal: %.2f
                    """,
                    n,
                    (double) tiemposPrueba[0] / NUM_ITERACIONES,
                    (double) tiemposPrueba[1] / NUM_ITERACIONES,
                    (double) tiemposPrueba[2] / NUM_ITERACIONES);
        }

    }
}
