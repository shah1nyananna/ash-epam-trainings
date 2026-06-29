package lesson2;

public class SeasonsHomework {

    /**
     * Ունեք թվերի մասիվ, որոնք պետք է ունենան 1-12 արժեքներ
     * int[] months = {1, 3, 6, 9, 12};
     * <p>
     * Գրեք կոդի հատված, որը կտպի մասիվի ԲՈԼՈՐ թվերին համապատասխան ամիսների անունները
     * <p>
     * Օրինակ՝ մասիվի մեջ ունենալով 3 թիվը, պետք է ակնկալել Մարտ ամիսը ․․․
     * Խնդիրը լուծել 2 եղանակով՝
     * <p>
     * Լուծում 1:
     * for-i , if-else if
     * <p>
     * Լուծում 2:
     * foreach, switch
     */
    public static void main(String[] args) {
        int[] months = {1, 3, 6, 9, 12};
        for (int i = 0; i < months.length; i++) {
            int month = months[i];
            if (month == 1) {
                System.out.println("January");
            } else if (month == 3) {
                System.out.println("March");
            } else if (month == 6) {
                System.out.println("June");
            } else if (month == 9) {
                System.out.println("September");
            } else if (month == 12) {
               System.out.println("December");
           }
    }


        for (int m : months) {
            switch (m) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("Fabruary");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
            }
        }
    }
}





