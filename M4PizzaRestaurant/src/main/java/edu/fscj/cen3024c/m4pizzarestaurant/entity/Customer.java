package edu.fscj.cen3024c.m4pizzarestaurant.entity;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "customerid", nullable = false)
    private int customerid;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer")
    private Set<PizzaOrder> pizzaOrder;

    @Column(name = "lastname", length = 255)
    private String lastName;

    @Column(name = "firstname", length = 255)
    private String firstName;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "phonenumber", length = 255)
    private String phoneNumber;

    @Column(name = "email", length = 255)
    private String eMail;

    @Column(name = "userid", length = 255)
    private String userId;

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (this == o)
            result = true;
        else if (o != null && getClass() == o.getClass()) {
            Customer customer = (Customer) o;
            result = customerid == customer.customerid &&
                    Objects.equals(lastName, customer.lastName) &&
                    Objects.equals(firstName, customer.firstName) &&
                    Objects.equals(address, customer.address) &&
                    Objects.equals(phoneNumber, customer.phoneNumber) &&
                    Objects.equals(eMail, customer.eMail) &&
                    Objects.equals(userId, customer.userId);
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerid, lastName, firstName);
    }

    @Override
    public String toString() {
        return "Customer {" +
                "customerid=" + customerid +
                ", pizzaOrder=" + pizzaOrder +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", eMail='" + eMail + '\'' +
                ", userId='" + userId + '\'' +
                " }";
    }
}
