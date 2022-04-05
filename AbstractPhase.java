import java.util.*;

public abstract class AbstractPhase {
    protected List<String> OuiNon = new ArrayList<>(){};

    AbstractPhase(){
        OuiNon.add("oui");
        OuiNon.add("non");
    }

    protected String demander(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message + ": ");
        return scanner.nextLine();
    }

    protected String demander(String message, List<String> options){
        String reponse = "";
        do {
            reponse = demander(message + " -> " + Arrays.toString(options.toArray()));
        }while(!options.contains(reponse) || Objects.equals(reponse, ""));
        return reponse;
    }

    public abstract AbstractPhase goToNextPhase();

    public abstract boolean hasNextPhase();

    //public abstract String toString();

}
