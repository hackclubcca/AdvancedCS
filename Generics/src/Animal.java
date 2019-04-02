import java.util.ArrayList;
import java.util.Arrays;

public class Animal<Thing> {
	private ArrayList<Thing> properties;
	public Animal() {
		properties = new ArrayList<Thing>();
	}
	public void addProperty(Thing t) {
		properties.add(t);
	}
	public void addProperties(Thing[] t) {
		for (Thing t1 : t)
			properties.add(t1);
	}
	public void removeProperty(Thing t) {
		properties.remove(t);
	}
	public String toString() {
		String output = "";
		for (Thing t : properties) {
			output+=(t + "\n");
		}
		return output;
	}
}
