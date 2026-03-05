import java.util.*;

public class SwarmOptimizer {

    public static List<Bin> optimizeRoute(List<Bin> bins) {
        bins.sort((a, b) -> b.fillLevel - a.fillLevel);
        return bins;
    }
}