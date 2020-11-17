import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

public class Resultado {
    private LongAdder longAd1 = new LongAdder();
    private LongAdder longAd2 = new LongAdder();
    private LongAdder longAd3 = new LongAdder();
    private LongAdder longAd4 = new LongAdder();
    private LongAdder longAd5 = new LongAdder();
    private LongAdder longAd6 = new LongAdder();

    public Resultado() {
        longAd1.add(0);
        longAd2.add(0);
        longAd3.add(0);
        longAd4.add(0);
        longAd5.add(0);
        longAd6.add(0);
    }

    public void increment(int num) {
        switch (num) {
            case 0 -> longAd1.increment();
            case 1 -> longAd2.increment();
            case 2 -> longAd3.increment();
            case 3 -> longAd4.increment();
            case 4 -> longAd5.increment();
            case 5  -> longAd6.increment();
        }
    }

    private int total() {
        int v = 0;
        v += longAd1.intValue();
        v += longAd2.intValue();
        v += longAd3.intValue();
        v += longAd4.intValue();
        v += longAd5.intValue();
        v += longAd6.intValue();
        return v;
    }

    private int getMarcador(int num) {
        return switch (num) {
            case 0 -> longAd1.intValue();
            case 1 -> longAd2.intValue();
            case 2 -> longAd3.intValue();
            case 3 -> longAd4.intValue();
            case 4 -> longAd5.intValue();
            case 5 -> longAd6.intValue();
            default -> 0;
        };
    }

    @Override
    public String toString() {
        return String.format("Resultados:\n" +
                        "\t1: %d\n" +
                        "\t2: %d\n" +
                        "\t3: %d\n" +
                        "\t4: %d\n" +
                        "\t5: %d\n" +
                        "\t6: %d\n" +
                        "Total de la suma: %d\n",
                longAd1.intValue(), longAd2.intValue(),
                longAd3.intValue(), longAd4.intValue(),
                longAd5.intValue(), longAd6.intValue(), total());
    }
}
