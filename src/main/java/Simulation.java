public class Simulation {
    private Bins diceBin;
    int numOfDice;
    int rollingDiceNum;


    public Simulation (int numOfDice,int rollingDiceNum) {
        this.numOfDice = numOfDice;
        this.rollingDiceNum = rollingDiceNum;
        diceBin = new Bins(numOfDice*6+ numOfDice);
    }
    // constructor

    public void runSimulation (){
        Dice dice = new Dice(numOfDice);
        for (int i = 0 ; i <rollingDiceNum; i++){
            diceBin.incrementBin(dice.tossAndSum());
        }
    }
    public void printResult() {
        for (int i=0 ; i <= numOfDice*6 ; i++ ){
            System.out.println( diceBin.getBins(i));
        }

    }




}
