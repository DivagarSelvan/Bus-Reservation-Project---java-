package BusReservation;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;
    Bus(int no, boolean ac, int capacity) {
        this.busNo = no;
        this.ac = ac;
        this.capacity = capacity;
    }
    public int getBusNo(){return busNo;}
    public boolean getAc() {
        return ac;
    }
    public int getCapacity() {return capacity;}
    public void setAc(boolean val) {ac = val;}
    public void setCapacity(int cap) {
        capacity = cap;
    }

        public void displayBusInfo() {
            System.out.println("Bus No: " + busNo + " Ac: " + ac + " Total Capacity: " + capacity);
        }
    }