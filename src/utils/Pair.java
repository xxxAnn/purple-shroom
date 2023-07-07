package utils;

public class Pair<L, R> {
    private L l;
    private R r;

    // immutable
    public Pair(L l, R r) {
        this.l = l;
        this.r = r;
    }

    public L first() { return l; }
    public R second() { return r; }

    @Override public String toString() {
        return String.format("(%s, %s)", first().toString(), second().toString());
    }
}
