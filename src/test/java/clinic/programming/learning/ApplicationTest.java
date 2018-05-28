package clinic.programming.training;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class ApplicationTest {
    private Application app;
    
    @Before
    public void setup() {
        app = new Application();
    }
    
    
    @Test
    public void testFilter() {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Visual C");
		list.add("Python");
		list.add("Scala");
		list.add("");
        int count = app.filter(list).size();
        assertTrue(count == 4);
    }

    
}