import models.Phone;
import models.Tablet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Task 1
        int[] numbers = {5, 12, 14, 17, 21, 8, 23, 6, 7, 10};
        Arrays.stream(numbers).filter(number -> number >= 10).sorted().forEach(System.out::println);

        // Task 2
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone(6.9, "black", "Apple"));
        phones.add(new Phone(8.4, "white", "Samsung"));
        phones.add(new Phone(7.8, "silver", "Xiaomi"));
        phones.add(new Phone(7.0, "gold", "Huawei"));
        phones.add(new Phone(7.5, "blue", "Lenova"));
        phones.add(new Phone(8.3, "red", "Apple"));
        phones.add(new Phone(5.9, "green", "Samsung"));
        phones.add(new Phone(6.5, "gray", "Huawei"));
        phones.add(new Phone(6.7, "red", "Nokia"));
        phones.add(new Phone(8.0, "yellow", "Xiaomi"));

        List<Tablet> tablets = phones.stream().
                filter(phone -> phone.getDisplay() > 7.0)
                .map(phone -> new Tablet(phone.getDisplay(), "Samsung"))
                .collect(Collectors.toList());

        tablets.forEach(System.out::println);
    }
}