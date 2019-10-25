import org.junit.Assert;
import org.junit.Test;

public class testDice {

    @Test
    public void diceTest(){
        //given
        boolean actual = false;
        Dice newdice = new Dice ();
        int rollingDice = 1;
        int diceResult = newdice.rollDice(rollingDice);
        boolean expected = true;

        if (newdice.rollDice(rollingDice) >=1 && newdice.rollDice(rollingDice)<=6){
            actual= true;
        }
        Assert.assertEquals(expected,actual);
        System.out.println(diceResult);


    }



}

