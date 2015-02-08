package DriveSim.Composite;

//This is component class
public abstract class GameComponent {
    public void add(GameComponent item){
        throw new UnsupportedOperationException();
    }

    public void remove(GameComponent item){
        throw new UnsupportedOperationException();
    }

    public GameComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }
}