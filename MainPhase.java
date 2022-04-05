public class MainPhase extends AbstractPhase {

    static MainPhase instance;
    //Déclaration attributs

    private MainPhase(){}

    public static MainPhase getInstance(){
        if(instance == null){/*Instanciation des attributs*/}
        return instance;
    }

    @Override
    public AbstractPhase goToNextPhase() {return null;}

    @Override
    public boolean hasNextPhase(){return false;}

    /*@Override
    public String toString() {return "";}*/

    public void start(){};
}
