package com.company.Factory;

import com.company.Race.FriendlyRace;
import com.company.Race.GrandPrixRace;
import com.company.Race.Race;

public class RaceFactory {
    private RaceFactory(){

    }

    public Race getRace(String raceType){
        if(raceType == null){
            return  null;
        }

        if(raceType.equalsIgnoreCase("GRANDPRIX")){
            return new GrandPrixRace();
        }else if(raceType.equalsIgnoreCase("FRIENDLY")){
            return new FriendlyRace();
        }

        return null;
    }

    private static class RaceFactoryHolder{
        private static final RaceFactory instance = new RaceFactory();
    }

    public static RaceFactory getInstance(){
        return RaceFactoryHolder.instance;
    }
}
