
public class Bins {

    Integer[] binHolder ;
    public Bins (int binMax){
        binHolder = new Integer [binMax];
        for (int i =0 ; i<binMax; i++){
            binHolder[i]=0;
        }
    }
    public int getBins (int binCount){
        return binHolder[binCount];
    }

    public void incrementBin (int incrementing){
        binHolder [incrementing] = binHolder[incrementing]++;
    }

}
