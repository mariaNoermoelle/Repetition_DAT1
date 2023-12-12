import java.util.ArrayList;

public class Cities {
    private ArrayList<City> cities = new ArrayList<>();

    public void addCity(City city) {
        cities.add(city);
    }

    public String getBiggestCity() {
        int max = 0;
        String name = "";
        for (City city : cities) {
            if (max < (city.getPopulation())) {
                max = city.getPopulation();
                name = city.getName();
            }
        }
        return max + " " + name;
    }

    public int getTotalPopulation()
    {
        int sum = 0;
        for(City city : cities) {
            sum = sum + city.getPopulation();
        }
        return sum;
    }

    public int getAveragePopulation()
    {
        int average = 0;
        for(City city : cities)
        {
            average = getTotalPopulation() / cities.size();
        }
        return average;
    }

}