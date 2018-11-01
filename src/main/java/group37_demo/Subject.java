package group37_demo;

public interface Subject {
	
	public void registerObserver(Observer o);    
	public void removeObserver(Observer o);    
	public void notifyObservers();
	
}
