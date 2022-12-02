package cart;

public class Item{

  // members
  private String name;
  private String code;
  // need to initialise the Float: because it is a wrapper classes and it needs to be instantiated
  // = 0f; is instantiating it, no need keyword 'new'
  // priimtive type float no need to initialise
  // if you see a slash through, it is deprecated, and somewhere in the future, they will not use this anymore
  private Float price = 0f;
  private Integer quantity;

  public Item(String name, String code){
    this.name = name;
    this.code = code;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public Float getPrice() {
    return price;
  }
  public void setPrice(Float price) {
    this.price = price;
  }
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Float totalPrice(){
    return this.price * (float)this.quantity;
  }

  
}