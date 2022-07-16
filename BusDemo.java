package BusReservation;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String []args){
        ArrayList<Bus> buses = new ArrayList<Bus>();
        buses.add(new Bus(1,true, 2));
        buses.add(new Bus(2, false , 55));
        buses.add(new Bus(3, true, 60));
        for(Bus b : buses){
            b.displayBusInfo();
        }
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        int userOpt = 1;
        Scanner sc = new Scanner(System.in);
        while(userOpt == 1) {
            System.out.println("Enter 1  to book and 2 to exit");
            userOpt = sc.nextInt();
            if(userOpt == 1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                }
                else{
                    System.out.println("sorry. Bus is full. Try another bus or date");
                }
            }
        }
    }
 }
