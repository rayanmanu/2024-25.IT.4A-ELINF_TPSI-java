
public class Cronometro {
    private long start, end;
    public Cronometro() {
        this.start = 0;
        this.end = 0;
    }
    public void start() {
        this.start = System.currentTimeMillis();
    }

    public void stop() {
        this.end = System.currentTimeMillis();
    }

    public long elapsed() {
        return end - start;
    }

    public double secondi() {
        return elapsed() / 1000.0;
    }
}
