public class newswitch {
    public static void main (String [] arg) {

        String day = "sunday";
        String result = switch (day) {
            case "sunday", "monday" -> "6am";
            case "friday" -> "7am";
            default -> "8am";
        };
        System.out.println(result);
    }

}
