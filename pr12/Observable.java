package pr12;

import java.util.List;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
