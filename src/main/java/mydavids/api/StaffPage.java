package mydavids.api;

import mydavids.domain.Staff;
import mydavids.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Created by Yusiry on 9/2/2016.
 */
@RestController
@RequestMapping("/api/")
public class StaffPage {
    @Autowired
    private StaffService service;

    //---------------------Retrieve All Staff -------------------------

    @RequestMapping(value = "/staff/", method = RequestMethod.GET)
    public ResponseEntity<List<Staff>> listAllStaff(){
        List<Staff> Staff = service.readAll();
        if(Staff.isEmpty()){
            return new ResponseEntity<List<Staff>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Staff>>(Staff, HttpStatus.OK);
    }

    //--------------------Retrieve Single Staff Member------------------------

    @RequestMapping(value = "/staff/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Staff> getStaff(@PathVariable("id") int id){
        System.out.println("Fetching staff with code: " + id);
        Staff Staff = service.readById(id);
        if(Staff == null){
            System.out.println("Staff with id " + id + " not found");
            return new ResponseEntity<Staff>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Staff>(Staff, HttpStatus.OK);
    }

    //---------------------Create a Staff Member ------------------------------------

    @RequestMapping(value = "/staff/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createStaff(@RequestBody Staff staff, UriComponentsBuilder uBuilder){
        System.out.println("Creating staff member " + staff.getName());

        service.Create(staff);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uBuilder.path("/staff/{id}").buildAndExpand(staff.getName()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    //-------------------Update a staff member---------------------------

    @RequestMapping(value = "/staff/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Staff> updateStaff(@PathVariable("id") int id, @RequestBody Staff staff){
        System.out.println("Updating Staff Member");

        Staff currentStaff = service.readById(id);

        if(currentStaff == null){
            System.out.println("Staff member with Staff code " + id + " not found");
            return new ResponseEntity<Staff>(HttpStatus.NOT_FOUND);
        }

        Staff updatedStaff = new Staff
                .Builder(staff.getName()).id(currentStaff.getId())
                .copy(staff)
                .build();

        service.Update(updatedStaff);

        return new ResponseEntity<Staff>(updatedStaff, HttpStatus.OK);
    }

    //--------------------Delete a Staff member ----------------------------

    @RequestMapping(value = "/staff/delete/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Staff> deleteStaff(@PathVariable("id")int id, @RequestBody Staff staff){
        System.out.println("Fetching and deleting a staff member with id " + id);

        staff = service.readById(id);
        if(staff == null){
            System.out.println("Unable to delete. Staff member with id + " + id + " not found");
            return new ResponseEntity<Staff>(HttpStatus.NOT_FOUND);
        }

        service.Delete(staff);
        return new ResponseEntity<Staff>(staff, HttpStatus.OK);
    }
}
