public class Dice {
    int numOfDice = 0;

    public Integer rollDice (Integer numOfDice){
        Integer diceResult = 0 ;
        for (int i = 1 ; i <=numOfDice; i++) {
             diceResult= (int) (Math.random() * 6 + 1);

        }return diceResult;
    }

}
