public class Dice {

    //    public Integer tossAndSum (Integer numOfDice){
//        Integer diceResult = 0 ;
//        for (int i = 1; i <= numOfDice; i++) {
//             Integer singleDie = (int) (Math.random() * 6 + 1);
//             diceResult += singleDie;
//            System.out.println(singleDie);
//        }return diceResult;
    int numOfDice = 0;

    public Dice (int numOfDice){
        this.numOfDice = numOfDice;
    }


    public int tossAndSum() {
        int diceResult = 0;
        for (int i = 1; i <= numOfDice; i++) {
            diceResult += (int) (Math.random() * 6 + 1);
        }
        System.out.println(diceResult);

        return diceResult;


    }

}


