package DriveSim.Composite;

import java.util.ArrayList;
import java.util.List;

public class GameItemComposite extends GameComponent {
    List<GameComponent> gameComponents = new ArrayList<GameComponent>();
    String name;

    public GameItemComposite(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    @Override
    public void add(GameComponent gameComponent){
        if(!gameComponents.contains(gameComponent))
            gameComponents.add(gameComponent);
    }

    @Override
    public void remove(GameComponent gameComponent){
        if(gameComponents.contains(gameComponent))
            gameComponents.remove(gameComponent);
    }

    @Override
    public GameComponent getChild(int i){
        return gameComponents.get(i);
    }

    @Override
    public void print(){
        System.out.println("\n" + getName() + "\n--------------------");

        for(GameComponent component : gameComponents){
            component.print();
        }
    }
}