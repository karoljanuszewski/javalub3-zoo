package pl.sdacademy.animals.bear;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BearTest {

    @Test
    void bearShouldBeAliveIfHasEatenWithin10Days() {
        Bear bear = new BlackBear(1);
        bear.eat();

        boolean result = bear.isAlive();

        assertTrue(result == true);
    }

    @Test
    void BearShouldNotBeAliveIfItHasNotEatenForMoreThan10Days(){
        Bear bear = new BlackBear(1,new TestClock());

        boolean result = bear.isAlive();
        assertTrue(result==false);


    }






   /* @Test
    void FeedingBearShouldSetTHeDateOfTHeLastMealForNow(){
        Bear bear = new BlackBear(1);
        bear.eat();

        bear.lastMealTime=
    }*/

   /* def "Feeding bear should set the date of the last meal for now"() {
        given:
        Bear bear = new BlackBear(1)
        bear.eat()

        when:
        def result = bear.getLastMealTime()

        then:
        new Duration(result, DateTime.now()).isShorterThan(Duration.standardSeconds(1))
    }*/

}