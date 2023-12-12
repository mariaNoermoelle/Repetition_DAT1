public class Main
{
    public static void main(String[] args) {

        //City city = new City("h", 0);
        Cities cities = new Cities();
        cities.addCity(new City("Kongens Lyngby", 57500));
        cities.addCity(new City("Ribe", 8257));
        cities.addCity(new City("Storvorde", 3425));
        cities.addCity(new City("Tarm", 4010));
        cities.addCity(new City("Horreby", 305));

        cities.getBiggestCity();

        System.out.println("Biggest City: " + cities.getBiggestCity());
        System.out.println("Total population: " + cities.getTotalPopulation());
        System.out.println("Average population: " + cities.getAveragePopulation());
    }
}
