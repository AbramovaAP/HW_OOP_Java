// 6. Создадим пример использования:

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Stream stream1 = new Stream();
        stream1.addGroup(new StydentGroup("Group 1"));
        stream1.addGroup(new StydentGroup("Group 2"));

        Stream stream2 = new Stream();
        stream2.addGroup(new StydentGroup("Group 3"));

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1); 
        streams.add(stream2);

        StreamService streamService = new StreamService();
        Controller controller = new Controller(streamService);

        System.out.println("Before sorting:");
        for (Stream stream : streams) {
            for (StydentGroup group : stream) {
                System.out.println(group.getName());
            }
        }

        controller.sortStreams(streams);

        System.out.println("After sorting:");
        for (Stream stream : streams) {
            for (StydentGroup group : stream) {
                System.out.println(group.getName());
            }
        }
    }
}
/*Вывод:
Before sorting:
Group 1
Group 2
Group 3
After sorting:
Group 3
Group 1
Group 2 
*/