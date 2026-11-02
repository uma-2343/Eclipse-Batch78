
package Operators;

import java.util.Scanner;

public class Restuarents{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String yn = "";
        double total_price = 0;

        do {

            System.out.println("\n===== RESTAURANT MENU =====");
            System.out.println("1 - Veg");
            System.out.println("2 - Non-Veg");

            System.out.print("Enter Category: ");
            int catg = sc.nextInt();

            // OUTER SWITCH
            switch (catg) {

                // ================= VEG CATEGORY =================

                case 1 -> {

                    String vyn = "";
                    double veg_total_price = 0;

                    do {

                        System.out.println("\n--- VEG MENU ---");
                        System.out.println("1 - Paneer Butter Masala - 250");
                        System.out.println("2 - Dal Tadaka - 200");
                        System.out.println("3 - Paneer Tikka Masala - 280");
                        System.out.println("4 - Matar Paneer - 240");
                        System.out.println("5 - Palak Paneer - 230");
                        System.out.println("6 - Chilli Paneer - 220");
                        System.out.println("7 - Shahi Paneer - 270");
                        System.out.println("8 - Mix Veg Curry - 180");
                        System.out.println("9 - Malai Kofta - 250");
                        System.out.println("10 - Chana Masala - 190");
                        System.out.println("11 - Dum Veg Biriyani - 300");
                        System.out.println("12 - Veg Palav - 280");

                        System.out.print("Enter Item Number: ");
                        int veg_item = sc.nextInt();

                        // INNER SWITCH
                        switch (veg_item) {

                            case 1 -> {
                                System.out.println("Paneer Butter Masala - 250/-");
                                veg_total_price += 250;
                            }

                            case 2 -> {
                                System.out.println("Dal Tadaka - 200/-");
                                veg_total_price += 200;
                            }

                            case 3 -> {
                                System.out.println("Paneer Tikka Masala - 280/-");
                                veg_total_price += 280;
                            }

                            case 4 -> {
                                System.out.println("Matar Paneer - 240/-");
                                veg_total_price += 240;
                            }

                            case 5 -> {
                                System.out.println("Palak Paneer - 230/-");
                                veg_total_price += 230;
                            }

                            case 6 -> {
                                System.out.println("Chilli Paneer - 220/-");
                                veg_total_price += 220;
                            }

                            case 7 -> {
                                System.out.println("Shahi Paneer - 270/-");
                                veg_total_price += 270;
                            }

                            case 8 -> {
                                System.out.println("Mix Veg Curry - 180/-");
                                veg_total_price += 180;
                            }

                            case 9 -> {
                                System.out.println("Malai Kofta - 250/-");
                                veg_total_price += 250;
                            }

                            case 10 -> {
                                System.out.println("Chana Masala - 190/-");
                                veg_total_price += 190;
                            }

                            case 11 -> {
                                System.out.println("Dum Veg Biriyani - 300/-");
                                veg_total_price += 300;
                            }

                            case 12 -> {
                                System.out.println("Veg Palav - 280/-");
                                veg_total_price += 280;
                            }

                            default ->
                                System.out.println("Entered Item is not available");
                        }

                        System.out.println(
                            "Do you want to continue with Veg Items? Y/N");
                        vyn = sc.next();

                    } while (vyn.equalsIgnoreCase("y"));

                    System.out.println(
                        "Veg Total Price is: " + veg_total_price);

                    total_price += veg_total_price;
                }

                // ================= NON-VEG CATEGORY =================

                case 2 -> {

                    String nvyn = "";
                    double non_veg_total_price = 0;

                    do {

                        System.out.println("\n--- NON-VEG MENU ---");
                        System.out.println("1 - Mutton Dum Biriyani - 500");
                        System.out.println("2 - Chicken Dum Biriyani - 350");
                        System.out.println("3 - Chicken Fry Biriyani - 380");
                        System.out.println("4 - Prawns Dum Biriyani - 450");
                        System.out.println("5 - Fish Dum Biriyani - 400");
                        System.out.println("6 - Egg Biriyani - 220");
                        System.out.println("7 - Chicken 65 - 280");
                        System.out.println("8 - Chicken Fry - 300");
                        System.out.println("9 - Chicken Tikka - 320");
                        System.out.println("10 - Mutton Fry - 450");
                        System.out.println("11 - Prawns Fry - 350");
                        System.out.println("12 - Chicken Mandi - 1550");

                        System.out.print("Enter Item Number: ");
                        int non_veg_item = sc.nextInt();

                        // INNER SWITCH
                        switch (non_veg_item) {

                            case 1 -> {
                                System.out.println("Mutton Dum Biriyani - 500/-");
                                non_veg_total_price += 500;
                            }

                            case 2 -> {
                                System.out.println("Chicken Dum Biriyani - 350/-");
                                non_veg_total_price += 350;
                            }

                            case 3 -> {
                                System.out.println("Chicken Fry Biriyani - 380/-");
                                non_veg_total_price += 380;
                            }

                            case 4 -> {
                                System.out.println("Prawns Dum Biriyani - 450/-");
                                non_veg_total_price += 450;
                            }

                            case 5 -> {
                                System.out.println("Fish Dum Biriyani - 400/-");
                                non_veg_total_price += 400;
                            }

                            case 6 -> {
                                System.out.println("Egg Biriyani - 220/-");
                                non_veg_total_price += 220;
                            }

                            case 7 -> {
                                System.out.println("Chicken 65 - 280/-");
                                non_veg_total_price += 280;
                            }

                            case 8 -> {
                                System.out.println("Chicken Fry - 300/-");
                                non_veg_total_price += 300;
                            }

                            case 9 -> {
                                System.out.println("Chicken Tikka - 320/-");
                                non_veg_total_price += 320;
                            }

                            case 10 -> {
                                System.out.println("Mutton Fry - 450/-");
                                non_veg_total_price += 450;
                            }

                            case 11 -> {
                                System.out.println("Prawns Fry - 350/-");
                                non_veg_total_price += 350;
                            }

                            case 12 -> {
                                System.out.println("Chicken Mandi - 1550/-");
                                non_veg_total_price += 1550;
                            }

                            default ->
                                System.out.println("Entered Item is not available");
                        }

                        System.out.println(
                            "Do you want to continue with Non-Veg Items? Y/N");
                        nvyn = sc.next();

                    } while (nvyn.equalsIgnoreCase("y"));

                    System.out.println(
                        "Non-Veg Total Price is: " + non_veg_total_price);

                    total_price += non_veg_total_price;
                }

                // ================= INVALID CATEGORY =================

                default ->
                    System.out.println("Entered Category is not available!");
            }

            System.out.println(
                "\nDo you want to continue with Categories? Y/N");
            yn = sc.next();

        } while (yn.equalsIgnoreCase("y"));

        // ================= FINAL BILL =================

        System.out.println("\n==================================");
        System.out.println("       RESTAURANT FINAL BILL");
        System.out.println("==================================");
        System.out.println("Total Price: Rs. " + total_price);
        System.out.println("Thank You! Visit Again.");
        System.out.println("==================================");

        sc.close();
    }
}
