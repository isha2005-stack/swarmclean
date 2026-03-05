import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Bin> bins = new ArrayList<>();

        bins.add(new Bin(1, 80));
        bins.add(new Bin(2, 45));
        bins.add(new Bin(3, 95));
        bins.add(new Bin(4, 60));

        System.out.println("Before Optimization:");
        for (Bin b : bins) {
            b.display();
        }

        System.out.println("\nOptimized Route:");

        List<Bin> optimized = SwarmOptimizer.optimizeRoute(bins);

        for (Bin b : optimized) {
            b.display();
        }
    }
}