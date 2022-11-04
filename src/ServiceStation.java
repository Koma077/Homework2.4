import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> transports = new ArrayDeque<>();
    public ServiceStation(){
    }
    public Queue<Transport> getTransports(){
        return transports;
    }
    public void addtransportSerice(Transport transport) throws ErrorBus{
        if(transport instanceof Bus){
            System.out.println();
            throw new ErrorBus("Для автобусов диагностика не требуется");
        }
        transports.add(transport);
    }
    public void diagnostics(){
        if(!transports.isEmpty()){
            Transport t = transports.poll();
            if(t.diagnostics()){
                System.out.println("Диагностика пройдена");
            }else{
                System.out.println("Машина исправна");
            }
        }
    }
}
