public class Simulation {
    Bins diceBin;
    int numOfDice;
    int rollingDiceNum;

    public Simulation (int numOfDice,int rollingDiceNum) {
        this.numOfDice = numOfDice;
        this.rollingDiceNum = rollingDiceNum;
    }
    // constructor

    public Bins runSimulation (){
        Dice dice = new Dice(numOfDice);
        diceBin = new Bins(numOfDice*6+ 1);
        for (int i = 0 ; i <rollingDiceNum; i++){
            diceBin.incrementBin(dice.tossAndSum());
        } return diceBin;
    }
    



}
