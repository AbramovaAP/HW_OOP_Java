// 5. Создадим класс `Controller`, добавив в него созданный сервис:

import java.util.List;

public class Controller {

    private StreamService streamService;

    public Controller(StreamService streamService) {
        this.streamService = streamService;
    }
// добавим метод, сортирующий список потоков, путём вызова созданного сервиса
    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }
} 
