public class Simulation {
    Bins diceBin;
    int numOfDice;
    int rollingDiceNum;

    public Simulation (int numOfDice,int rollingDiceNum) {
        this.numOfDice = numOfDice;
        this.rollingDiceNum = rollingDiceNum;
    }
    // constructor

    public void diceSim (){
        Dice dice = new Dice(numOfDice);
        for (int i = 0 ; i <rollingDiceNum; i++){
            diceBin.incrementBin(dice.tossAndSum());
        }
    }
    


}
