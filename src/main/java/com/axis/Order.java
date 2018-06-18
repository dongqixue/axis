package com.axis;

import java.util.Date;
import java.util.Objects;

/**
 * The class represents the stock order.
 * @author Dongqi Xue
 * @since 3/28/18.
 */
public class Order {
  private Date date;
  private int quantity;
  private float price;
  private OrderType type;
  private float commission = 0.0f;
  private float netAmount = 0.0f;
  private String description;
  private Currency currency = Currency.USD;

  public Order(Date date, OrderType type, float price, int quantity) {
    this.date = date;
    this.type = type;
    this.price = price;
    this.quantity = quantity;
    netAmount = price * quantity;
  }

  public Date getDate() {
    return date;
  }

  public int getQuantity() {
    return quantity;
  }

  public float getPrice() {
    return price;
  }

  public OrderType getType() {
    return type;
  }

  public float getNetAmount() {
    return netAmount;
  }

  public float getCommission() {
    return commission;
  }

  public void setCommission(float commission) {
    this.commission = commission;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (!(object instanceof Order)) {
      return false;
    }
    Order other = (Order) object;
    return Objects.equals(date, other.date)
        && Objects.equals(quantity, other.quantity)
        && Objects.equals(price, other.price)
        && Objects.equals(type, other.type)
        && Objects.equals(commission, other.commission)
        && Objects.equals(netAmount, other.netAmount)
        && Objects.equals(description, other.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, quantity, price, type, commission, netAmount, description);
  }

  @Override
  public String toString() {
    return "{date=" + date + ","
        + "quantity=" + quantity + ","
        + "price=" + price + ","
        + "type=" + price + ","
        + "commission=" + commission + ","
        + "netAmount=" + netAmount + ","
        + "description=" + description
        + "}";

  }
}
