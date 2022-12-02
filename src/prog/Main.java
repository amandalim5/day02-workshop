package prog;

import cart.Apple;
import cart.Item;
import cart.Orange;

public class Main {
  public static void main(String[] args) {
    Item apple = new Item("appl", "Apple");
    Item orange = new Item("orange", "Orange");

    apple.setPrice(.5f);
    apple.setQuantity(10);

    orange.setPrice(.5f);
    orange.setQuantity(10);

    // Item appleTwo = new Apple();
    // Item orangeTwo = new Orange();

    Apple appleTwo = new Apple();
    appleTwo.setType("Washington");
    Orange orangeTwo = new Orange();
    System.out.printf("apple code: %s\n", appleTwo.getCode());
    System.out.printf("orange code: %s\n", orangeTwo.getCode());

    Item item = appleTwo;
    System.out.printf("item code: %s\n", item.getCode());

    Apple washington = (Apple) item;
    System.out.printf("Washington code: %s\n", washington.getCode());

    // orange = (Orange)item;
    // // the above is erroneous, but you can see it only after compiling

    System.out.printf("is item an Orange? %b\n", item instanceof Orange);
    if (item instanceof Orange){
      orange = (Orange)item;
    }

  }
}
