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
    private static int currentWeek = 0;
    private static int currentWeekA = 0;
    private static int currentWeekB = 0;


    //(Q3)(c)
    public PopulationModel() {
        numA = new int[NUM_WEEKS];
        numB = new int[NUM_WEEKS];
        numA[0] = INITIALA;
        numB[0] = INITIALB;

    }
    //(Q3) (d)
    public int newNumA(int currentA, int currentB)
    {
        int newNumA;
        newNumA = (int) Math.floor(currentA - KILL_RATEB * currentB);
        currentWeekA++;
        if (newNumA>=0){
            //            numA[++currentWeekA] = newNumA;
            return newNumA;
        }else{
            //            numA[++currentWeekA] = newNumA;
            return 0;
        }
    }
    //(Q3) (e)
    public int newNumB(int currentA, int currentB)
    {
        int newNumB;
        newNumB = (int)Math.floor(currentB -KILL_RATEA * currentA);
        currentWeekB++;
        if(newNumB>=0){
//            numB[currentWeekB++] = newNumB;
            return newNumB;
        }else {
//            numB[currentWeekB++] = newNumB;
            return 0;
        }
    }
    //(Q3) (f)
    public void storeNewPopulations(int thisWeek)
    {
        int nextA = newNumA(INITIALA, INITIALB);
        int nextB = newNumB(INITIALA, INITIALB);
        if(thisWeek <= NUM_WEEKS){
            int colonyA = numA[thisWeek];
            int colonyB = numB[thisWeek];
        }
    }

//    (Q3) (g)
    public void createData()
    {
        for (int i = 0; i < NUM_WEEKS; i++) {
            storeNewPopulations(i);
        }
    }


}
