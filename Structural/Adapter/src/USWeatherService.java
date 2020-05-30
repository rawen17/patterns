public class USWeatherService {

    // fahrenheit
    public double getTemperature(double latitude, double longitude) {
        if (latitude == 37.53 && longitude == 77.02) { // Washington
            return 86;
        } else if (latitude == 40.43 && longitude == 73.59) { // New York
            return 95;
        } else {
            return 80;
        }
    }

    // ft/min
    public double getWind(double latitude, double longitude) {
        if (latitude == 37.53 && longitude == 77.02) { // Washington
            return 1000;
        } else if (latitude == 40.43 && longitude == 73.59) { // New York
            return 2000;
        } else {
            return 1500;
        }
    }
}
