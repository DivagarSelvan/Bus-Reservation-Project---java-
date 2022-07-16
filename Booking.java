package BusReservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Passenger Name: ");
        passengerName = sc.next();
        System.out.println("Enter Bus Name: ");
        busNo = sc.nextInt();
        System.out.println("Enter Date: dd-mm-yyyy");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCapacity();
            }
        }
            int booked = 0;
            for (Booking b : bookings) {
                if (b.busNo == busNo && b.date.equals(date)) {
                    booked++;
                }
            }
            return booked < capacity ? true : false;
        }
    }

