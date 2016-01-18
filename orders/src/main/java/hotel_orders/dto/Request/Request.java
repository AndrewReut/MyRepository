package hotel_orders.dto.Request;

import java.util.Date;

/**
 * Класс, описывающий заявку на заказ номера
 *
 * Created by Andrew
 */
public class Request {

    /**
     * ID заявки
     */
    private long idRequest;

    /**
     * ID клиента, создавшего заявку
     */
    private long idClient;

    /**
     * ID номера
     */
    private long idNomer;

    /**
     * Дата создания заявки
     */
    private Date dateReq;

    /**
     * Количество дней прибывания в номере
     */
    private int countDayStay;

    /**
     * Статус заявки
     */
    private int statusReq;

    public int getStatusReq() {
        return statusReq;
    }

    public void setStatusReq(int statusReq) {
        this.statusReq = statusReq;
    }

    public long getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(long idRequest) {
        this.idRequest = idRequest;
    }

    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public long getIdNomer() {
        return idNomer;
    }

    public void setIdNomer(long idNomer) {
        this.idNomer = idNomer;
    }

    public Date getDateReq() {
        return dateReq;
    }

    public void setDateReq(Date dateReq) {
        this.dateReq = dateReq;
    }

    public int getCountDayStay() {
        return countDayStay;
    }

    public void setCountDayStay(int countDayStay) {
        this.countDayStay = countDayStay;
    }

}
