package hw3methods;
public class LongD {
    private long d;
    public LongD(long d) {
        this.d = d;
    }
    public final static long MIN_LONG = Long.MIN_VALUE;
    public final static long MAX_LONG = Long.MAX_VALUE;

    public void incrementL() {
        this.d++;
    }

    public void decrementL() {
        this.d--;
    }

    public long getParamL(){
        return this.d;
    }
}
