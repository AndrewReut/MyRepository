package hotel_orders.dto.Client;

/**
 * Класс, описывающий одного клиента
 *
 * Created by Andrew
 */
public class Client {

    /**
     * ID клиента
     */
    private long idClient;

    /**
     * Имя клиента
     */
    private String nameClient;

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public long getIdClient() {
        return idClient;
    }

}
