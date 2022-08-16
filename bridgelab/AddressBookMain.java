package bridgelab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to the address book system");
        List<AddressBookMain> array = new ArrayList<AddressBookMain>();
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int choice;
        do{
            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            choice = sc.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Enter Name: ");
                    String name = s.nextLine();
                    System.out.println("Enter Address: ");
                    String address = s.nextLine();
                    System.out.println("Enter city: ");
                    String city = s.nextLine();
                    System.out.println("Enter state: ");
                    String state = s.nextLine();
                    System.out.println("Enter Number: ");
                    String phoneNumber = s.nextLine();
                    array.add(new AddressBookMain name,address,city,state,phoneNumber));
                    break;

                case 2:
                    System.out.println("---------------------------------------");
                    Iterator<AddressBookMain> i = array.iterator();
                    while (i.hasNext()) {
                        AddressBookMain e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("------------------------------");
                    break;
            }
        }while (choice!=0);

    }
}

