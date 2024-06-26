package Exercism;

public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actual){
        Lasagna lasagna= new Lasagna();
        int expected=lasagna.expectedMinutesInOven();
        int remain=expected-actual;
        return remain;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int timeSpent = layers*2;
        return timeSpent;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers,int ovenTime){
        Lasagna lasagna= new Lasagna();
        int prepTime=lasagna.preparationTimeInMinutes(layers);
        int totalTime=prepTime+ovenTime;
        return totalTime;
    }
}