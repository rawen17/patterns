public class RussianWeather implements WeatherService {

    String city;

    @Override
    public double getTemperature() {
        switch (city) {
            case "Москва":
                return 25;
            case "Санкт-Петербург":
                return 18;
            default: return 20;
        }
    }

    @Override
    public double getWind() {
        switch (city) {
            case "Москва":
                return 5;
            case "Санкт-Петербург":
                return 13;
            default: return 1;
        }
    }

    @Override
    public double getFeelsLikeTemperature() {
        switch (city) {
            case "Москва":
                return 23;
            case "Санкт-Петербург":
                return 16;
            default:
                return 20;
        }
    }

    @Override
    public void setPosition(String city) {
        this.city = city;
    }
}
