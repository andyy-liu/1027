public class MarsExplorer implements SpaceExplorer {
    public void explore() {
        System.out.println("MarsExplorer is exploring the red planet!");
    }

    public void collectSamples() {
        System.out.println("MarsExplorer is collecting Martian soil samples!");
    }

    public String sendReport() {
        return "MarsExplorer: Exploration and sample collection on Mars complete!";
    }
}