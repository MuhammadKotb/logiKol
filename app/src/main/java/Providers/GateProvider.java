package Providers;

import Gates.AND;
import Gates.BasicGate;
import Gates.Input;
import Gates.NOT;
import Gates.Node;
import Gates.OR;

public class GateProvider {
    

    private static GateProvider instance = null;

    private GateProvider()
    {
    }
    public static GateProvider getInstnace()
    {
        if(instance == null)
        {
            instance = new GateProvider();
        }
        return instance;
    }


    public BasicGate buildGate(String gate) throws Exception
    {
        if(gate != null)
        {
            gate = gate.toLowerCase();
        }
        switch(gate.toLowerCase())
        {
            case "g-and" : {

                return new AND();
            } 
            case "g-or" : {
                return new OR();
            }
            case "g-not" : {
                return new NOT();
            }
            case "g-out" : { 
                return new Node();
            }
            case "g-in" : {
                return new Input();
            }
            default: break;
        }

        return null;
    } 

}
