/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.user;

/**
 *
 * @author Luong Thanh Ha
 */
public class UserDTO {
    String username;
    String firstname;
    String lastname;
    String password;
    boolean isAdmin;
    String phonenumber;
    String email;
    String address;

    public UserDTO(String username, String firstname, String lastname, String password, boolean isAdmin, String phonenumber, String email, String address) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.isAdmin = isAdmin;
        this.phonenumber = phonenumber;
        this.email = email;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

    public UserDTO(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO{" + "username=" + username + ", firstname=" + firstname + ", lastname=" + lastname + ", password=" + password + ", isAdmin=" + isAdmin + ", phonenumber=" + phonenumber + ", email=" + email + '}';
    }
    
    
}
