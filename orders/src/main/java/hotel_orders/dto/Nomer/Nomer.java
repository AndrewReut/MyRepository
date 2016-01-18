package hotel_orders.dto.Nomer;

/**
 * Класс, описывающий номер
 *
 * Created by Andrew
 */
public class Nomer {

    /**
     * ID номера
     */
    private long idNomer;

    /**
     * Количество мест в номере
     */
    private int countSeats;

    /**
     * Класс номера
     */
    private int clsAprt;

    public int getClsAprt() {
        return clsAprt;
    }

    public void setClsAprt(int clsAprt) {
        this.clsAprt = clsAprt;
    }

    public int getCountSeats() {
        return countSeats;
    }

    public void setCountSeats(int countSeats) {
        this.countSeats = countSeats;
    }

    public long getIdNomer() {
        return idNomer;
    }

    public void setIdNomer(long idNomer) {
        this.idNomer = idNomer;
    }

}
