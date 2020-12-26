package first.spring.app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> names = new ArrayList<>();
        names.add("Ellie Goulding - Burn");
        names.add("Линник, АЗА#ZLO - SSC Tuatara");
        names.add("Sepha. - 2Brides");
        return names;
    }
}
