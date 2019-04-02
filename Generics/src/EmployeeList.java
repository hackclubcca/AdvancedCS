import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeList {
	private ArrayList<HashMap> e;
	public EmployeeList() {
		 e = new ArrayList<HashMap>();
	}
	public void add(int i, String key, Object o) {
		e.get(i).put(key, o);
	}
	public void defaultTemplate(int i, String name, ArrayList<String> specialties) {
		e.get(i).put("name", name);
		e.get(i).put("traits", specialties);
	}
}
