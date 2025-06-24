public class MoonExplorer implements SpaceExplorer {
    public void explore() {
        System.out.println("MoonExplorer is exploring the lunar surface!");
    }

    public void collectSamples() {
        System.out.println("MoonExplorer is collecting moon rocks!");
    }

    public String sendReport() {
        return "MarsExplorer: Exploration and sample collection on the Moon complete!";
    }
}