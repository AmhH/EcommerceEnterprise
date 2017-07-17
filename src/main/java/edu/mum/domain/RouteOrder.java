  package edu.mum.domain;


import java.io.Serializable;

public class RouteOrder  implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum RouteOrderType { DELIVERY, PICKUP }

    private final String name;
    private final int quantity;
    private final int orderNumber;
    private final RouteOrderType orderType;
    private String email;

  
	/**
     * Constructor
     */
    public RouteOrder(String name, int quantity, RouteOrderType orderType, int orderNumber, String email) {
        this.name = name;
        this.quantity = quantity;
        this.orderType = orderType;
        this.orderNumber = orderNumber;
        this.email = email;
    }

    /**
     * Gets name.
     */
 
    public String getName() {
        return name;
    }

    /**
     * Gets quantity.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Gets order type.
     */
    public RouteOrderType getRouteOrderType() {
        return orderType;
    }

	public int getOrderNumber() {
		return orderNumber;
	}

	public RouteOrderType getOrderType() {
		return orderType;
	}
	
	  public String getEmail() {
			return email;
		}


}
