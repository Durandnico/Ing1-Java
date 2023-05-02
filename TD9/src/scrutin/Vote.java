package scrutin;

public class Vote {
    public static final Vote OUI = new Vote("OUI");

    public static final Vote NON = new Vote("NON");

    public static final Vote BLANC = new Vote("BLANC");

    public static final Vote NUL = new Vote("NUL");
    private String name;

    public Vote(String name) {
        this.name = name;
    }

    public Vote() {
        this("BLANK");
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public boolean equals(Object o)
    {
        if( o instanceof Vote)
        {
            Vote v = (Vote) o;
            return this.name.equals(v.name);
        }
        return false;
    }

    public String toString()
    {
        return "A voté " + getName();
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
