import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter fromCity: ");
        String fromCity = input.nextLine();
        System.out.print("Enter viaCity: ");
        String viaCity = input.nextLine();
        System.out.print("Enter toCity: ");
        String toCity = input.nextLine();
        
        System.out.print("Enter distance fromToVia (in miles): ");
        double fromToVia = input.nextDouble();
        System.out.print("Enter distance viaToFinalCity (in miles): ");
        double viaToFinalCity = input.nextDouble();
        
        System.out.print("Enter timeFromToVia (in minutes): ");
        int timeFromToVia = input.nextInt();
        System.out.print("Enter timeViaToFinalCity (in minutes): ");
        int timeViaToFinalCity = input.nextInt();
        
        double totalDistanceMiles = fromToVia + viaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        
        // Convert miles to km (1 mile = ~1.6 km)
        double totalDistanceKm = totalDistanceMiles * 1.6;
        
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistanceKm + " km and the Total Time taken is " + totalTime + " minutes");
        
        input.close();
    }
}