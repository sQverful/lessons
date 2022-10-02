package com.dorosh.lessons.exercises.set.codetimetask;

/*
    Завдання:
        Створити об’єкт Покупка , який має два поля :
        ім’я покупки та кількість .
        Користувач має ввести список того, що він має купити в магазині.
        Після того як він закінчив вводити вивести йому список покупок
        ● в алфавітному порядку за ім’ям -> TreeSet - task_2
        ● в такому порядку як він вводив -> LinkedHashSet - task_3
        ● в порядку зменшення кількості -> TreeSet
        ● за хеш значенням об’єкта -> HashSet - task_4

        Використовувати Set<>!
------------------------------------------------------------------------------------------
    Task:
        Create a ShopItem object that has two fields:
         shop item's name and quantity.
         The user has to enter a list of what he needs to buy in the store.
         After he has finished entering, display his shopping list
         ● in alphabetical order by name -> TreeSet - task_2
         ● in the order he entered -> LinkedHashSet - task_3
         ● in descending order -> TreeSet
         ● by the hash value of the object -> HashSet - task_4

         Use Set<>!

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeTimeDemo {
    public static void main(String[] args) throws Exception {
        while (true) {
            run();
            System.out.print("Do you want try again? y/n:");
            boolean shouldRepeat = new Scanner(System.in).nextLine().equalsIgnoreCase("y");
            if (!shouldRepeat)
                return;
        }
    }

    private static void run() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Hello dear User!!!");
        System.out.println("==================================");
        System.out.println("Please choose strategy of for processing your shop list:" + System.lineSeparator() +
                "1 - ordered by alphabetical names of shop item's (TreeSet)" + System.lineSeparator() +
                "2 - ordered by your input order (LinkedHashSet)" + System.lineSeparator() +
                "3 - ordered by quantity descending (TreeSet)" + System.lineSeparator() +
                "4 - ordered by hashCode (HashSet)");

        int strategyNumber = scanner.nextInt();
        ProcessOrderStrategy processOrderStrategy = chooseStrategy(strategyNumber);

        System.out.println("Great! Now fill in your shopping list!");
        List<ShopItem> shopItemList = collectShopItems();
        System.out.println("==================================");
        System.out.println("Thank you!!!!");
        System.out.println("==================================");
        System.out.println("Here is you shopping list " + processOrderStrategy.getStrategyDescription());
        processOrderStrategy.processOrder(shopItemList);
        System.out.println("==================================");
    }

    private static List<ShopItem> collectShopItems() {
        Scanner scanner = new Scanner(System.in);
        List<ShopItem> shopItemList = new ArrayList<>();
        while (true) {
            System.out.print("Please input the name of your shop item:");
            String inputItemName = scanner.nextLine();
            System.out.print("Great!" + System.lineSeparator() +
                    "Now please provide the quantity:");
            Integer inputQuantity = Integer.valueOf(scanner.nextLine());
            shopItemList.add(new ShopItem(inputItemName, inputQuantity));
            System.out.print("Do you wish to continue? y/n: ");
            boolean shouldProceed = scanner.nextLine().equalsIgnoreCase("y");
            if (!shouldProceed)
                return shopItemList;
        }
    }

    private static ProcessOrderStrategy chooseStrategy(int strategyNumber) throws Exception {
        if (strategyNumber != 0) {
            if (strategyNumber == 1)
                return new ProcessOrderByAlphabetical();
            if (strategyNumber == 2)
                return new ProcessOrderByUserInputOrder();
            if (strategyNumber == 3)
                return new ProcessOrderByQuantityDescending();
            if (strategyNumber == 4)
                return new ProcessOrderByHashCode();
        }
        throw new Exception("Your input: " + strategyNumber + " is wrong!!! Restart the application");
    }
}
