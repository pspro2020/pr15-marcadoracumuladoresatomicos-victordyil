import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Resultado resultados = new Resultado();
        Thread[] threads = new Thread[3];

        for (int i = 0; i < 3; i++) {
            threads[i] = new Thread(new Dado(resultados));
        }

        Arrays.stream(threads).forEach(Thread::start);

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                return;
            }
        }

        System.out.println(resultados.toString());
    }
}
