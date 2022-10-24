package ba.unsa.etf.rpr;

public class Faktorijel {
    private int fakt;

    public Faktorijel() {
        fakt=1;
    }

    public int vratifakt(int n)
    {
        int fakt=1;
        for(int i=2;i<=n;i++)
        {
            fakt= fakt * i;
        }
            return fakt;
    }


}
