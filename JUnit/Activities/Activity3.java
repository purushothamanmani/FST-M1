package activities;

public class Activity3 {
    public static void main(String[] args) {
        double seconds = 1000000000;
        double earthSeconds = 31557600;
        double mercurySeconds = 0.2408467;
        double venusSeconds = 0.61519726;
        double marsSeconds = 1.8808158;
        double jupiterSeconds = 11.862615;
        double saturnSeconds = 29.447498;
        double uranusSeconds = 84.016846;
        double neptuneSeconds = 164.79132;
        System.out.println("The age of earth:" + seconds / earthSeconds);
        System.out.println("The age of mercury:" + seconds / earthSeconds / mercurySeconds);
        System.out.println("The age of venus:" + seconds / earthSeconds / venusSeconds);
        System.out.println("The age of mars:" + seconds / earthSeconds / marsSeconds);
        System.out.println("The age of jupiter:" + seconds / earthSeconds / jupiterSeconds);
        System.out.println("The age of saturn:" + seconds / earthSeconds / saturnSeconds);
        System.out.println("The age of uranus:" + seconds / earthSeconds / uranusSeconds);
        System.out.println("The age of neptune:" + seconds / earthSeconds / neptuneSeconds);
    }
}
