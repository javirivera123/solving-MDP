package com.company;

public class State{
    String name;
    int [] possibleActions = new int [4];
    int value;

    public State(String name){
        this.value = 0;
        this.name = name;

    }

    public void [] getPossibleActions(){
        // if array position is 1, that is evaluated as a
        // possible action for the current state
        // [0] = PARTY, [1] = REST, [2] = Study
        // [3] = PARTY split into 2 parts 8am and 10 am transition action
        int [] actions = new int[3];
        switch(name){
            case "RUeightpm" :
                for(int i=0;i<3;i++)
                    possibleActions[i] = 1;
                break;
            case "TUtenpm" :
                for(int i=0;i<2;i++)
                    possibleActions[i] = 1;
                break;
            case "RUtenpm" :
                for(int i=0;i<4;i++)
                    possibleActions[i] = 1;
                break;
            case "RDtenpm" :
                possibleActions[1] = 1;
                possibleActions[3] = 1;
                break;
            case "RUeightam" :
                for(int i=0;i<3;i++)
                    possibleActions[i] = 1;
                break;
            case "RDeightam" :
                for(int i=0;i<2;i++)
                possibleActions[i] = 1;
                break;
            case "TUtenam" :
                for(int i=0;i<4;i++)
                    possibleActions[i] = 1;
                break;
            case "RUtenam" :
                for(int i=0;i<4;i++)
                    possibleActions[i] = 1;
                break;
            case "RDtenam" :
                for(int i=0;i<4;i++)
                    possibleActions[i] = 1;
                break;
            case "TDtenam" :
                for(int i=0;i<4;i++)
                    possibleActions[i] = 1;
                break;
            case "elevenam" :
                for(int i=0;i<4;i++)
                    possibleActions[i] = 1;
                break;
        }
    }



}
