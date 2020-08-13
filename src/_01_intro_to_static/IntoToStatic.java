package _01_intro_to_static;

public class IntoToStatic {




    public static void main(String[] args) {
        //create two athletes
    	Athlete jack = new Athlete("jack ",  8);
    	
    	Athlete john = new Athlete("john ",  4);
        //print their names, bibNumbers, and the location of their race. 
    	System.out.println( jack.name +  jack.bibNumber + jack.raceLocation);
    	System.out.println( john.name +  john.bibNumber + john.raceLocation);
    }
}

