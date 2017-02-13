package id.web.frizky.tdd.pricing;

/**
 * Created by f.frizky
 * on 2/13/2017.
 * <p>
 * * Before you start:
 * -----------------
 * 1. Try not to read ahead.
 * 2. Do one task at a time. The trick is to learn to work incrementally.
 * 3. Make sure you only test for correct inputs. there is no need to test for invalid inputs for this kata
 * <p>
 * Supermarket
 * 1. buy 1 items, 6500 IDR
 * 2. three for a 10000 IDR (so what’s the price if I buy 4, or 5?)
 * 3. buy four, get one free (so does the third item have a price?)
 */
public class Supermarket {
    private Item theOnlyItem;

    public Supermarket() {
        theOnlyItem = new Item();
    }
}

class Item {
}
