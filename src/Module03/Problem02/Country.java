package Module03.Problem02;

import java.util.HashMap;

public class Country {
    private String countryName;
    private String leadershipType;
    private String leaderName;
    private int independenceDate;
    private int independenceMonth;
    private int independenceYear;

    public Country(String countryName, String leadershipType, String leaderName, int independenceMonth, int independenceYear, int independenceDate) {
        this.countryName = countryName;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
        this.independenceDate = independenceDate;
        this.independenceMonth = independenceMonth;
        this.independenceYear = independenceYear;
    }

    public Country(String countryName, String leadershipType, String leaderName) {
        this.countryName = countryName;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
    }

    public void printInfo() {
        HashMap<Integer, String> monthNames = new HashMap<>();
        monthNames.put(1, "January");
        monthNames.put(2, "February");
        monthNames.put(3, "March");
        monthNames.put(4, "April");
        monthNames.put(5, "May");
        monthNames.put(6, "June");
        monthNames.put(7, "July");
        monthNames.put(8, "August");
        monthNames.put(9, "September");
        monthNames.put(10, "October");
        monthNames.put(11, "November");
        monthNames.put(12, "December");

        String leaderTitle = switch (this.leadershipType.toLowerCase()) {
            case "monarki" -> "Raja";
            case "presiden" -> "Presiden";
            case "perdana mentri" -> "Perdana Mentri";
            default -> this.leadershipType;
        };

        System.out.println("Negara " + this.countryName
                + " mempunyai " + (this.leadershipType.equals("monarki") ? "Raja" : (this.leadershipType.substring(0, 1).toUpperCase() + this.leadershipType.substring(1)))
                + " bernama " + this.leaderName
        );

        System.out.println("Deklarasi Kemerdekaan pada Tanggal "
                + this.independenceDate + " "
                + monthNames.get(independenceMonth) + " "
                + this.independenceYear
        );
    }
}