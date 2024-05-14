package net.sahet.protobuf.demo;

import com.google.protobuf.Any;
import net.sahet.tt.point.greeting.Ttpoint.Greet;
import net.sahet.tt.point.greeting.Ttpoint.Theater;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class TTPointDemo {
    public static void main(String[] args) {
        System.out.println("\n --- serialize ---");

        Greet greeting = Greet.newBuilder()
                .setGreeting("Gurgunmysyn")
                .setUserName("Merdan")
                .build();

        String filename = "greeting_protobuf_output";
        System.out.println("Saving greeting to file: " + filename);

        try (FileOutputStream output = new FileOutputStream(filename)) {
            greeting.writeTo(output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Saved greeting with following data to disk: \n" + greeting);

        System.out.println("\n --- deserialize ---");

        try (FileInputStream input = new FileInputStream(filename)) {
            Greet.Builder builder = Greet.newBuilder();
            Greet greet = builder.mergeFrom(input).build();
            System.out.println("Greeting: " + greet.getGreeting() + "\n" + "Username: " + greet.getUserName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("\n --- map usage ---");

        System.out.println("-- which map? Any implementation, YES --");
        //Map<String, Integer> ticketPrice = new HashMap<>();
        //Map<String, Integer> ticketPrice = new LinkedHashMap<>();
        Map<String, Integer> ticketPrice = new TreeMap<>();

        ticketPrice.put("Avengers Endgame", 700);
        ticketPrice.put("Captain America", 200);
        ticketPrice.put("Wonder Woman 1984", 400);
        
        List<String> snacks = new ArrayList<>();
        snacks.add("zeytun");
        snacks.add("kulce");

        Theater theater = Theater.newBuilder()
        		.addAllSnacks(snacks)
                .putAllMovieTicketPrice(ticketPrice)
                .build();

        filename = "theater_protobuf_output";
        System.out.println("Saving theater information to file: " + filename);

        try (FileOutputStream output = new FileOutputStream(filename)) {
            theater.writeTo(output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Saved theater information with following data to disk: \n" + theater);


        System.out.println("\n --- deserialize theatre ---");

        try (FileInputStream input = new FileInputStream(filename)) {
            Theater.Builder theaterB = Theater.newBuilder();
            theaterB.mergeFrom(input).build();
            System.out.println(theater);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class TheaterWriter {
    public static void main(String[] args) throws IOException {
    	Map<String, Integer> ticketPrice = new TreeMap<>();

        ticketPrice.put("Avengers Endgame", 700);
        ticketPrice.put("Captain America", 200);
        ticketPrice.put("Wonder Woman 1984", 400);
        
        List<String> snacks = new ArrayList<>();
        snacks.add("zeytun");
        snacks.add("kulce");

        Theater theater = Theater.newBuilder()
        		.setName("SilverScreen")
        		.addAllSnacks(snacks)
                .putAllMovieTicketPrice(ticketPrice)
                .build();
         

        String filename = "theater_protobuf_output2";
        System.out.println("Saving theater information to file: " + filename);

        try (FileOutputStream output = new FileOutputStream(filename)) {
            theater.writeTo(output);
        }
        System.out.println("Saved theater information with following data to disk: \n" + theater);
    }
}


class TheaterReaderExplicit {
    public static void main(String[] args) throws IOException {
        Theater.Builder builder = Theater.newBuilder();

        String filename = "theater_protobuf_output2";
        System.out.println("Reading from file " + filename);

        try (FileInputStream input = new FileInputStream(filename)) {
            Theater theater = builder.mergeFrom(input).build();
            System.out.println(
                    "Name:" + theater.getName() + "\n" +
                            "Address:" + theater.getAddress() + "\n" +
                            "Drive_In:" + theater.getDriveIn() + "\n" +
                            "Total Capacity:" + theater.getTotalCapcity() + "\n" +
                            "Base Ticket Prices: " + theater.getBaseTicketPrice() + "\n" +
                            "Owner: " + theater.getOwner() + "\n" +
                            "Snacks: " + theater.getSnacksList() + "\n" +
                            "Payment: " + theater.getPayment()+"\n"+
                            "movieTicketPrice: " + theater.getMovieTicketPriceMap()
            );

            //Map<FieldDescriptor, Object> f = theater.getAllFields();
            System.out.println("List of fields explicitly specified: " + theater.getAllFields());
        }
    }
}
