public class PrisonTest {
    public static void main(String[] args) {
        Prisoner bubba = new Prisoner();
        bubba.name="tasya";
        bubba.height = 2.08;
        bubba.sentence=4;
        System.out.println(bubba);

        Prisoner twitch = new Prisoner();
        twitch.name= "valent";
        twitch.height=1.73;
        twitch.sentence=3;
        System.out.println (twitch);

        System.out.println( bubba == twitch);

        bubba = twitch;
        System.out.println(bubba == twitch);
    }
    }

    

    
