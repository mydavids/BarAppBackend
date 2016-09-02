package mydavids.model;

import mydavids.domain.Staff;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Yusiry on 8/20/2016.
 */
public class StaffResource extends ResourceSupport {

    private Long resid;
    private String name;
    private String surname;
    private String idNumber;
    private String address;

    private StaffResource(){

    }

    public Long getResid() {
        return resid;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getAddress() {
        return address;
    }

    public StaffResource(Builder builder){

    }

    public static class Builder{
        private Long resid;
        private String name;
        private String surname;
        private String idNumber;
        private String address;

        public Builder(String name){
            this.name = name;
        }

        public Builder surname(String val){
            this.surname = val;
            return this;
        }

        public Builder idNumber(String val){
            this.idNumber = val;
            return this;
        }

        public Builder address(String val){
            this.address = val;
            return this;
        }

        public Builder copy(StaffResource value){
            this.name = value.name;
            this.resid = value.resid;
            this.surname = value.surname;
            this.address = value.address;
            this.idNumber = value.idNumber;
            return this;
        }

        public StaffResource build(){
            return new StaffResource(this);
        }
    }

}
