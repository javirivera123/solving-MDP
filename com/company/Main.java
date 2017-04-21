package com.company;

public class Main {

    public static void main(String args[]) {
        Action PARTY = new  Action(2);
        Action REST = new Action(0);
        Action STUDY = new Action(-1);

        State RUeightpm = new State("RUeightpm");
        State TUtenpm = new State("TUtenpm");
        State RUtenpm = new State("RUtenpm");
        State RDtenpm = new State("RDtenpm");
        State RUeightam = new State("RUeightam");
        State RDeightam = new State("RDeightam");
        State TUtenam = new State("TUtenam");
        State RUtenam = new State("RUtenam");
        State RDtenam = new State("RDtenam");
        State TDtenam = new State("TDtenam");
        State elevenam = new State("elevenam");



        Action [] actionSpace = {PARTY, REST, STUDY};
        State [] stateSpace = {RUeightpm, TUtenpm, RUtenpm, RDtenpm,
                               RUeightam, RDeightam, TUtenam,
                               RUtenam, RDtenam, TDtenam, elevenam};

        valueIteration(stateSpace, actionSpace);
    }

    public static void valueIteration(State[] stateSpace, Action[] actionSpace){
        float V = 0;
        for(int i=0;i<stateSpace.length; i++){

        }

    }

}