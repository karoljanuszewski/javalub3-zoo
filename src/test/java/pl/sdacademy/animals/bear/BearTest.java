package pl.sdacademy.animals.bear;

import org.joda.time.DateTime;

import org.joda.time.Duration;
import org.junit.jupiter.api.Test;
import pl.sdacademy.food.Food;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class BearTest {

    @Test
    void bearShouldBeAliveIfHasEatenWithin10Days() {
        Bear bear = new BlackBear(1);
        bear.eat();

        assertThat(bear.isAlive()).isTrue();
    }

    @Test
    void feedingBearShouldSetTheDateOfTheLastMealForNow() {
        Bear bear = new BlackBear(1);
        bear.eat();

        assertThat(new Duration(bear.getLastMealTime(), DateTime.now()).isShorterThan(Duration.standardSeconds(1)))
                .isTrue();
    }

    @Test
    void bearShouldNotBeAliveIfItHasNotEatenForMoreThan10Days() {
        Bear bear = new BlackBear(1, new TestClock());

        boolean result = bear.isAlive();

        assertThat(result).isFalse();
    }

    @Test
    void BearShouldNotBeAliveIfItHasNotEatenForMoreThan10Days(){
        Bear bear = new BlackBear(1,new TestClock());

        boolean result = bear.isAlive();
        assertTrue(result==false);

    }

    @Test
    void BearShouldGainWeightEqualToTheAmountFoodHeHasEaten(){

        Bear bear = new BlackBear(1);

        int weightBefore = bear.getWeight();


        Food food = new Food(1);
        bear.eat(food);

        int weightAfter = bear.getWeight();

        assertTrue(weightBefore+food.getFoodWeight()==weightAfter);

    }

    @Test
    void BearShouldGainWeightEqualToThreeQuartersTheAmountHeHasDrunken(){
        Bear bear1 = new BlackBear(10);
        Bear bear2 = new BlackBear(18);




    }







}