public enum Planet {
    MERCURY("Mercury", 0.330, 2439),
    VENUS("Venus", 4.870, 6051),
    EARTH("Earth", 5.970, 6371),
    MARS("Mars", 0.642, 3389),
    JUPITER("Jupiter", 1898, 69911),
    SATURN("Saturn", 568, 58232),
    URANUS("Uranus", 86.8, 25362),
    NEPTUNE("Neptune", 102, 24622),
    PLUTO("Pluto", 0.015,1188);

    private String name;
    private double weight; // вес * 10^(-24) кг
    private double radius; // в км

    Planet(String name, double weight, double radius) {
        this.name = name;
        this.weight = weight;
        this.radius = radius;
    }

    public void printInfo() {
        System.out.println("Name: " + name + "\nWeight: " + weight + "*10^24 kg\nRadius: " + radius + " km");
    }
}
