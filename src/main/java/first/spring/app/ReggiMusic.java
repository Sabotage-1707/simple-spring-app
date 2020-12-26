package first.spring.app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReggiMusic implements  Music{

    @Override
    public List<String> getSong() {
        List<String> names = new ArrayList<>();
        names.add("Miyagi - Captain");
        names.add("Miyagi & AndyPanda - Minor");
        names.add("Miyagi & Kadi - Prayers");
        return names;
    }
}
