import java.util.Random;

public class Subsecuencia {
    private int[] a;
    private int primer, ultimo, valorSuma;

    public Subsecuencia(int numElementos) {
        a = new int[numElementos];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(-99, 99);
        }
    }

    public Subsecuencia(int[] arrayEnteros) {
        System.arraycopy(arrayEnteros, 0, a, 0, arrayEnteros.length);
    }

    public int getPrimer() {
        return primer;
    }

    public int getUltimo() {
        return ultimo;
    }

    public int getSuma() {
        return valorSuma;
    }

    public int subsecuenciaFuerzaBruta() {
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int thisSum = 0;
                for (int k = i; k <= j; k++)
                    thisSum += a[k];
                if (thisSum > maxSum)
                    maxSum = thisSum;
                primer = i;
                ultimo = j;
            }
        }
        return maxSum;
    }

    public int subsecuenciaMejorado() {
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            int thisSum = 0;
            for (int j = i; j < a.length; j++) {
                thisSum += a[j];
                if (thisSum > maxSum)
                    maxSum = thisSum;
                primer = i;
                ultimo = j;
            }
        }
        return maxSum;
    }

    public int subsecuenciaLineal() {
        int maxSum = 0;
        int thisSum = 0;
        for (int i = 0, j = 0; j < a.length; j++) {
            thisSum += a[j];
            if (thisSum > maxSum) {
                maxSum = thisSum;
                primer = i;
                ultimo = j;
            } else if (thisSum < 0) {
                i = j + 1;
                thisSum = 0;
            }
        }
        return maxSum;
    }
}
