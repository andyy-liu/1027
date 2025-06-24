public class AsteroidExplorer implements SpaceExplorer {
    public void explore() {
        System.out.println("MoonExplorer is navigating the asteroid belt!");
    }

    public void collectSamples() {
        System.out.println("AsteroidExplorer is collecting asteroid dust samples!");
    }

    public String sendReport() {
        return "Asteroid Explorer: Exploration and sample collection on asteroids complete!";
    }
}