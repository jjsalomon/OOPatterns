import java.util.ArrayList;

/**
 * Created by azkei on 09/05/2017.
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) {
        //When an observer registers, we add it at the end of the list
        observers.add(o);
    }

    public void removeObserver(Observer o){
        //when an observer wants to unregister, we just take it off the list
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        //we tell the observers about the state,
        //because they are all observers, we know they all implement update()
        //so we know how to notify them
        for(int i =0; i<observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    //we notify observers when we get updated measurements from the weather station
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
