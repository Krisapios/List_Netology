import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int countGoods = 0;
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Добавить товар");
            System.out.println("2. ");
            System.out.println("");
            System.out.println("");
            String input = scanner.nextLine();
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Какую покупку хотите добавить?");
                    String addGoods = scanner.nextLine();
                    list.add(addGoods);
                    countGoods++;
                    System.out.println("Итого в списке покупок: " + countGoods);
                    break;
                case 2:
                    System.out.println("Список покупок:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(i + 1 + " " + list.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Список покупок:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(i + 1 + " " + list.get(i));
                    }
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    String deleteGood = scanner.nextLine();
                    try {
                        int deleteNum = Integer.parseInt(deleteGood) - 1;
                        list.remove(deleteNum);
                    } catch (NumberFormatException e) {
                        list.remove(deleteGood);
                    } finally {
                        System.out.println("Список покупок:");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println(i + 1 + " " + list.get(i));
                        }
                        countGoods--;
                        break;
                    }
                case 4:
                    System.out.println("Введите текст для поиска:");
                    String searchText = scanner.nextLine();
                    String lowerSearch = searchText.toLowerCase();
                    for (int i = 0; i < list.size(); i++) {
                        String getList = list.get(i);
                        String lowerList = getList.toLowerCase();
                        if (lowerList.contains(lowerSearch)) {
                            System.out.println("Найдено");
                            System.out.println(i+1 + " " + getList);
                        }
                    }
                    break;
            }
        }
    }
}