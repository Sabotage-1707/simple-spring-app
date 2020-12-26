package first.spring.app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> names = new ArrayList<>();
        names.add("Bon Jovi - It's my life");
        names.add("Quenn - We are the champions");
        names.add("Queen - Bohemian rhapsody");
        return names;
    }
}
