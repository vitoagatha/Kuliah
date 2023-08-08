public class MoreVariablesAndPrinting{
	
    public static void main( String[] args )
    {
        String nameActor, eyesActor, teethActor, hairActor;
        int ageActor, heightActor, weightActor;

        nameActor = "Zed A. Shaw";
        ageActor = 35;     // not a lie
        heightActor = 74;  // inches
        weightActor = 180; // lbs
        eyesActor = "Blue";
        teethActor = "White";
        hairActor = "Brown";

        System.out.println( "Let's talk about " + nameActor + "." );
        System.out.println( "He's " + heightActor + " inches (or " + (heightActor*2.54) + " cm) tall." );
        System.out.println( "He's " + weightActor + " pounds (or " + (weightActor*0.45359237) + " kg) heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + eyesActor + " eyes and " + hairActor + " hair." );
        System.out.println( "His teeth are usually " + teethActor + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + ageActor + ", " + heightActor + ", and " + weightActor
            + " I get " + (ageActor + heightActor + weightActor) + "." );
        
    }
}

