// 2. Создадим класс `Stream` с коллекцией учебных групп и реализацией интерфейса `Iterable`:

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// import javax.swing.GroupLayout.Group;

public class Stream implements Iterable<StydentGroup> {

    List<StydentGroup> groups;

    public Stream() {
        groups = new ArrayList<>();
    }
 
    public void addGroup(StydentGroup group) {
        groups.add(group);
    }

    @Override 
    public Iterator<StydentGroup> iterator() {
        return groups.iterator();
    }
}
