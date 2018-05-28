package clinic.programming.training;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }
	
	public List<String> filter(List<String> list){
		return list.stream().filter(str -> !str.contains("C")).collect(Collectors.toList());
	}
    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Visual C");
		list.add("Python");
		list.add("Scala");
		list.add("");
		
		app.filter(list).stream().forEach(str -> {System.out.println(str);});
		
		list.stream().forEach(str -> {System.out.println(str + String.valueOf(StringUtils.isEmpty(str)));});
		
    }
}