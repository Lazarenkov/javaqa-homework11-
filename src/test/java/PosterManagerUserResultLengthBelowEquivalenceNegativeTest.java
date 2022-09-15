import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerUserResultLengthBelowEquivalenceNegativeTest {
    PosterManager item = new PosterManager(-1);

    PosterItem item1 = new PosterItem(1, "Бладшот");
    PosterItem item2 = new PosterItem(2, "Вперед");
    PosterItem item3 = new PosterItem(3, "Отель Белград");
    PosterItem item4 = new PosterItem(4, "Джентельмены");
    PosterItem item5 = new PosterItem(5, "Человек-невидимка");
    PosterItem item6 = new PosterItem(6, "Тролли. Мировой тур");
    PosterItem item7 = new PosterItem(7, "Номер один");
    PosterItem item8 = null;
    PosterItem item9 = null;
    PosterItem item10 = null;
    PosterItem item11 = null;


    @Test
    public void shouldSaveItems() {

        item.save(item1);
        item.save(item2);
        item.save(item3);

        PosterItem[] expexted = {item1, item2, item3};
        PosterItem[] actual = item.findAll();

        Assertions.assertArrayEquals(expexted, actual);

    }

    @Test
    public void shouldReturnAllItems() {

        item.save(item1);
        item.save(item2);
        item.save(item3);
        item.save(item4);
        item.save(item5);
        item.save(item6);
        item.save(item7);
        item.save(item8);
        item.save(item9);
        item.save(item10);
        item.save(item11);

        PosterItem[] expexted = {item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11};
        PosterItem[] actual = item.findAll();

        Assertions.assertArrayEquals(expexted, actual);

    }

    @Test
    public void shouldReturnLastItemsInReversedOrder() {

        item.save(item1);
        item.save(item2);
        item.save(item3);
        item.save(item4);
        item.save(item5);
        item.save(item6);
        item.save(item7);
        item.save(item8);
        item.save(item9);
        item.save(item10);
        item.save(item11);

        PosterItem[] expexted = {item11, item10, item9, item8, item7, item6, item5, item4, item3, item2};
        PosterItem[] actual = item.findLast();

        Assertions.assertArrayEquals(expexted, actual);

    }
}
