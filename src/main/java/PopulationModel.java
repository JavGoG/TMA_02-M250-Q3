//(Q3)(a)
public class PopulationModel {
    /*
     * //(Q3)(b)
     * public arrays for testing purposes
     */
    public int[] numA;
    public int[] numB;
    private static final int INITIALA = 50;
    private static final int INITIALB = 60;
    private static final double KILL_RATEA = 0.2;
    private static final double KILL_RATEB = 0.1;
    private static final int NUM_WEEKS = 10;

    //(Q3)(c)
    public PopulationModel() {
        numA = new int[10];
        numB = new int[10];
        numA[0] = INITIALA;
        numB[0] = INITIALB;

    }
    //(Q3)(d)
    public int newNumA(int currentA, int currentB)
    {
        int newNumA;
        newNumA = (int) Math.floor(currentA - KILL_RATEB * currentB);
        if (newNumA>=0){
            return newNumA;
        }else{
            return 0;
        }
    }
    //(Q3) (e)
    public int newNumB(int currentA, int currentB)
    {
        int newNumB;
        newNumB = (int)Math.floor(currentB -KILL_RATEA * currentA);
        if(newNumB>=0){
            return newNumB;
        }else {
            return 0;
        }
    }


}
