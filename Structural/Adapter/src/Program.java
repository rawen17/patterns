public class Program {
    public static void main(String[] args) {
        WeatherService service = new RussianWeather();
        service.setPosition("Москва");
        System.out.println("Москва");
        System.out.printf("Температура: (C) : %4.1f\n",  service.getTemperature());
        System.out.printf("Скорость ветра: (м/с) : %4.1f\n", service.getWind());
        System.out.printf("Ощущаемая температура (C) : %4.1f\n", service.getFeelsLikeTemperature());

        service.setPosition("Санкт-Петербург");
        System.out.println("Санкт-Петербург");
        System.out.printf("Температура: (C) : %4.1f\n",  service.getTemperature());
        System.out.printf("Скорость ветра: (м/с) : %4.1f\n", service.getWind());
        System.out.printf("Ощущаемая температура (C) : %4.1f\n", service.getFeelsLikeTemperature());

        service = new USWeatherAdapter(new USWeatherService());
        service.setPosition("Вашингтон");
        System.out.println("Вашингтон");
        System.out.printf("Температура: (C) : %4.1f\n",  service.getTemperature());
        System.out.printf("Скорость ветра: (м/с) : %4.1f\n", service.getWind());
        System.out.printf("Ощущаемая температура (C) : %4.1f\n", service.getFeelsLikeTemperature());

        service.setPosition("Нью Йорк");
        System.out.println("Нью Йорк");
        System.out.printf("Температура: (C) : %4.1f\n",  service.getTemperature());
        System.out.printf("Скорость ветра: (м/с) : %4.1f\n", service.getWind());
        System.out.printf("Ощущаемая температура (C) : %4.1f\n", service.getFeelsLikeTemperature());

    }
}
