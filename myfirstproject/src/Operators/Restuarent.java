
package Operators;

import java.util.Scanner;

public class Restuarent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String yn = "";
        double total_price = 0;

        do {

            System.out.println("\nEnter Category like Veg/Non-veg/Starters/Drinks:");
            String catg = sc.next().toLowerCase();

            switch (catg) {

            // ================= VEG CATEGORY =================

            case "veg" -> {

                String vyn = "";
                double veg_total_price = 0;

                do {

                    System.out.println("\n--- VEG MENU ---");
                    System.out.println("pbm - Paneer Butter Masala - 250");
                    System.out.println("dal - Dal Tadaka - 200");
                    System.out.println("pvm - Paneer Tikka Masala - 280");
                    System.out.println("mtr - Matar Paneer - 240");
                    System.out.println("pal - Palak Paneer - 230");
                    System.out.println("chp - Chilli Paneer - 220");
                    System.out.println("shp - Shahi Paneer - 270");
                    System.out.println("mix - Mix Veg Curry - 180");
                    System.out.println("kof - Malai Kofta - 250");
                    System.out.println("chm - Chana Masala - 190");
                    System.out.println("dum - Dum Veg Biriyani - 300");
                    System.out.println("veg - Veg Palav - 280");

                    System.out.println("Enter the Item:");
                    String veg_item = sc.next().toLowerCase();

                    switch (veg_item) {

                    case "pbm" -> {
                        System.out.println("Paneer Butter Masala - 250/-");
                        veg_total_price += 250;
                    }

                    case "dal" -> {
                        System.out.println("Dal Tadaka - 200/-");
                        veg_total_price += 200;
                    }

                    case "pvm" -> {
                        System.out.println("Paneer Tikka Masala - 280/-");
                        veg_total_price += 280;
                    }

                    case "mtr" -> {
                        System.out.println("Matar Paneer - 240/-");
                        veg_total_price += 240;
                    }

                    case "pal" -> {
                        System.out.println("Palak Paneer - 230/-");
                        veg_total_price += 230;
                    }

                    case "chp" -> {
                        System.out.println("Chilli Paneer - 220/-");
                        veg_total_price += 220;
                    }

                    case "shp" -> {
                        System.out.println("Shahi Paneer - 270/-");
                        veg_total_price += 270;
                    }

                    case "mix" -> {
                        System.out.println("Mix Veg Curry - 180/-");
                        veg_total_price += 180;
                    }

                    case "kof" -> {
                        System.out.println("Malai Kofta - 250/-");
                        veg_total_price += 250;
                    }

                    case "chm" -> {
                        System.out.println("Chana Masala - 190/-");
                        veg_total_price += 190;
                    }

                    case "dum" -> {
                        System.out.println("Dum Veg Biriyani - 300/-");
                        veg_total_price += 300;
                    }

                    case "veg" -> {
                        System.out.println("Veg Palav - 280/-");
                        veg_total_price += 280;
                    }

                    default -> System.out.println("Entered Item is not available");
                    }

                    System.out.println("Do you want to continue with Veg Items? Y/N");
                    vyn = sc.next();

                } while (vyn.equalsIgnoreCase("y"));

                System.out.println("Veg Total Price is: " + veg_total_price);

                total_price += veg_total_price;
            }

            // ================= NON-VEG CATEGORY =================

            case "non-veg" -> {

                String nvyn = "";
                double non_veg_total_price = 0;

                do {

                    System.out.println("\n--- NON-VEG MENU ---");
                    System.out.println("mdb - Mutton Dum Biriyani - 500");
                    System.out.println("cdb - Chicken Dum Biriyani - 350");
                    System.out.println("cfb - Chicken Fry Biriyani - 380");
                    System.out.println("pdb - Prawns Dum Biriyani - 450");
                    System.out.println("fdb - Fish Dum Biriyani - 400");
                    System.out.println("egb - Egg Biriyani - 220");
                    System.out.println("ch65 - Chicken 65 - 280");
                    System.out.println("cfr - Chicken Fry - 300");
                    System.out.println("tka - Chicken Tikka - 320");
                    System.out.println("mfr - Mutton Fry - 450");
                    System.out.println("pfr - Prawns Fry - 350");
                    System.out.println("cmd - Chicken Mandi - 1550");

                    System.out.println("Enter the Item:");
                    String non_veg_item = sc.next().toLowerCase();

                    switch (non_veg_item) {

                    case "mdb" -> {
                        System.out.println("Mutton Dum Biriyani - 500/-");
                        non_veg_total_price += 500;
                    }

                    case "cdb" -> {
                        System.out.println("Chicken Dum Biriyani - 350/-");
                        non_veg_total_price += 350;
                    }

                    case "cfb" -> {
                        System.out.println("Chicken Fry Biriyani - 380/-");
                        non_veg_total_price += 380;
                    }

                    case "pdb" -> {
                        System.out.println("Prawns Dum Biriyani - 450/-");
                        non_veg_total_price += 450;
                    }

                    case "fdb" -> {
                        System.out.println("Fish Dum Biriyani - 400/-");
                        non_veg_total_price += 400;
                    }

                    case "egb" -> {
                        System.out.println("Egg Biriyani - 220/-");
                        non_veg_total_price += 220;
                    }

                    case "ch65" -> {
                        System.out.println("Chicken 65 - 280/-");
                        non_veg_total_price += 280;
                    }

                    case "cfr" -> {
                        System.out.println("Chicken Fry - 300/-");
                        non_veg_total_price += 300;
                    }

                    case "tka" -> {
                        System.out.println("Chicken Tikka - 320/-");
                        non_veg_total_price += 320;
                    }

                    case "mfr" -> {
                        System.out.println("Mutton Fry - 450/-");
                        non_veg_total_price += 450;
                    }

                    case "pfr" -> {
                        System.out.println("Prawns Fry - 350/-");
                        non_veg_total_price += 350;
                    }

                    case "cmd" -> {
                        System.out.println("Chicken Mandi - 1550/-");
                        non_veg_total_price += 1550;
                    }

                    default -> System.out.println("Entered Item is not available");
                    }

                    System.out.println("Do you want to continue with Non-Veg Items? Y/N");
                    nvyn = sc.next();

                } while (nvyn.equalsIgnoreCase("y"));

                System.out.println("Non-Veg Total Price is: " + non_veg_total_price);

                total_price += non_veg_total_price;
            }

            // ================= STARTERS CATEGORY =================

            case "starters" -> {

                String syn = "";
                double starter_total_price = 0;

                do {

                    System.out.println("\n--- STARTERS MENU ---");
                    System.out.println("vman - Veg Manchurian - 180");
                    System.out.println("ptk - Paneer Tikka - 250");
                    System.out.println("c65 - Chicken 65 - 280");
                    System.out.println("vsp - Veg Spring Roll - 160");
                    System.out.println("cmt - Chicken Manchurian - 300");
                    System.out.println("frf - French Fries - 120");
                    System.out.println("gch - Gobi Chilli - 170");
                    System.out.println("pfr - Prawns Fry - 350");

                    System.out.println("Enter the Item:");
                    String starter_item = sc.next().toLowerCase();

                    switch (starter_item) {

                    case "vman" -> {
                        System.out.println("Veg Manchurian - 180/-");
                        starter_total_price += 180;
                    }

                    case "ptk" -> {
                        System.out.println("Paneer Tikka - 250/-");
                        starter_total_price += 250;
                    }

                    case "c65" -> {
                        System.out.println("Chicken 65 - 280/-");
                        starter_total_price += 280;
                    }

                    case "vsp" -> {
                        System.out.println("Veg Spring Roll - 160/-");
                        starter_total_price += 160;
                    }

                    case "cmt" -> {
                        System.out.println("Chicken Manchurian - 300/-");
                        starter_total_price += 300;
                    }

                    case "frf" -> {
                        System.out.println("French Fries - 120/-");
                        starter_total_price += 120;
                    }

                    case "gch" -> {
                        System.out.println("Gobi Chilli - 170/-");
                        starter_total_price += 170;
                    }

                    case "pfr" -> {
                        System.out.println("Prawns Fry - 350/-");
                        starter_total_price += 350;
                    }

                    default -> System.out.println("Entered Starter is not available");
                    }

                    System.out.println("Do you want to continue with Starters? Y/N");
                    syn = sc.next();

                } while (syn.equalsIgnoreCase("y"));

                System.out.println("Starters Total Price is: " + starter_total_price);

                total_price += starter_total_price;
            }

            // ================= DRINKS CATEGORY =================

            case "drinks" -> {

                String dyn = "";
                double drinks_total_price = 0;

                do {

                    System.out.println("\n--- DRINKS MENU ---");
                    System.out.println("coc - Coca Cola - 60");
                    System.out.println("pep - Pepsi - 50");
                    System.out.println("moj - Mojito - 120");
                    System.out.println("lem - Lemon Juice - 80");
                    System.out.println("man - Mango Juice - 100");
                    System.out.println("ora - Orange Juice - 90");
                    System.out.println("cof - Cold Coffee - 130");
                    System.out.println("mil - Milkshake - 150");

                    System.out.println("Enter the Item:");
                    String drink_item = sc.next().toLowerCase();

                    switch (drink_item) {

                    case "coc" -> {
                        System.out.println("Coca Cola - 60/-");
                        drinks_total_price += 60;
                    }

                    case "pep" -> {
                        System.out.println("Pepsi - 50/-");
                        drinks_total_price += 50;
                    }

                    case "moj" -> {
                        System.out.println("Mojito - 120/-");
                        drinks_total_price += 120;
                    }

                    case "lem" -> {
                        System.out.println("Lemon Juice - 80/-");
                        drinks_total_price += 80;
                    }

                    case "man" -> {
                        System.out.println("Mango Juice - 100/-");
                        drinks_total_price += 100;
                    }

                    case "ora" -> {
                        System.out.println("Orange Juice - 90/-");
                        drinks_total_price += 90;
                    }

                    case "cof" -> {
                        System.out.println("Cold Coffee - 130/-");
                        drinks_total_price += 130;
                    }

                    case "mil" -> {
                        System.out.println("Milkshake - 150/-");
                        drinks_total_price += 150;
                    }

                    default -> System.out.println("Entered Drink is not available");
                    }

                    System.out.println("Do you want to continue with Drinks? Y/N");
                    dyn = sc.next();

                } while (dyn.equalsIgnoreCase("y"));

                System.out.println("Drinks Total Price is: " + drinks_total_price);

                total_price += drinks_total_price;
            }

            // ================= INVALID CATEGORY =================

            default -> System.out.println("Entered Category is not available!");

            }

            System.out.println("\nDo you want to continue with Categories? Y/N");
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
