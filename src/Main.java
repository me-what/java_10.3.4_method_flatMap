// Плоское отображение. Метод flatMap

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        phoneStream
                .flatMap(p->Stream.of(
                        String.format("название: %s  цена без скидки: %d", p.getName(), p.getPrice()),
                        String.format("название: %s  цена со скидкой: %d", p.getName(), p.getPrice() - (int)(p.getPrice()*0.1))
                ))
                .forEach(s->System.out.println(s));
    }
}
// res:
// название: iPhone 6 S цена без скидки: 54000
//название: iPhone 6 S цена со скидкой: 48600
//название: Lumia 950 цена без скидки: 45000
//название: Lumia 950 цена со скидкой: 40500
//название: Samsung Galaxy S 6 цена без скидки: 40000
//название: Samsung Galaxy S 6 цена со скидкой: 36000
