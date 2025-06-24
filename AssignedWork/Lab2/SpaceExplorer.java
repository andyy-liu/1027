public interface SpaceExplorer {
    public abstract void explore();

    public abstract void collectSamples();

    public abstract String sendReport();

    public default void prepareForMission() {
        System.out.println("Preparing for the mission. Checking all systems and supplies");
    }
}
