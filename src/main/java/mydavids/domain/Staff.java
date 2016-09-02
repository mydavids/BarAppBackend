package mydavids.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Yusiry Davids on 4/17/2016.
 */
@Entity
public class Staff implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String surname;
    private String phone;
    private String IDnumber;
    private String address;


    public Staff() {
    }

    public Staff(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.phone = builder.phone;
        this.IDnumber = builder.IDnumber;
        this.address = builder.address;
    }

    public static class Builder{
        private int id;
        private String name;
        private String surname;
        private String phone;
        private String IDnumber;
        private String address;

        public Builder(String name){
            this.name = name;
        }

        public Builder id(int value){
            this.id = value;
            return this;
        }


        public Builder surname(String value){
            this.surname = value;
            return this;
        }

        public Builder phone(String value){
            this.phone = value;
            return this;
        }

        public Builder IDnumber(String value){
            this.IDnumber = value;
            return this;
        }

        public Builder address(String value){
            this.address = value;
            return this;
        }

        public Builder copy(Staff value){
            this.id = value.id;
            this.name = value.name;
            this.surname = value.surname;
            this.phone = value.phone;
            this.IDnumber = value.IDnumber;
            this.address = value.address;
            return this;
        }

        public Staff build(){
            return new Staff(this);
        }
    }


    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;

    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIDnumber() {
        return IDnumber;
    }

    public void setIDnumber(String IDnumber) {
        this.IDnumber = IDnumber;
    }


}
