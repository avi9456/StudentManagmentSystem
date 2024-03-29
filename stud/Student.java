package stud;

import java.io.Serializable;

import stud.exception.StudentException;
import stud.helpler.Address;
import stud.helpler.Name;
import stud.helpler.Date;

public class Student implements Serializable{
    protected long  registerNo=-1;
    protected Name studName;
    protected Date birthDate;
    protected Address address;
    protected Name fatherName;
    protected Name motherName;
    protected String contact;
    protected String gender;
    protected String email;
    public Student(long registerNo, Name studName, Date birthDate ,String gender, Address address, Name fatherName, Name motherName, String contact, String email)throws StudentException {
        if(registerNo>-1 &&studName!=null &&gender!="" && birthDate!=null && address!=null){
        this.registerNo = registerNo;
        this.studName = studName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.address = address;
        }else{
            throw new StudentException ("resgister, name, date of birth and address should not be null");
        }
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.contact = contact;
        this.email = email;
    }
    public Student(long registerNo, Name studName, Date birthDate, String gender,Address address,Name fatherName,Name motherName,String contact)throws StudentException {
        this(registerNo, studName, birthDate, gender,address,fatherName,motherName,contact,null);
    }
    public Student(long registerNo, Name studName, Date birthDate, String gender,Address address,Name fatherName,Name motherName)throws StudentException {
        this(registerNo, studName, birthDate, gender,address,fatherName,motherName,null);
    }
    public Student(long registerNo, Name studName, Date birthDate, String gender,Address address,Name fatherName)throws StudentException {
        this(registerNo, studName, birthDate, gender,address,fatherName,new Name());
        // this.motherName = new Name("");
    }
    public Student(long registerNo, Name studName, Date birthDate, String gender,Address address) throws StudentException {
        this(registerNo, studName, birthDate, gender,address,new Name());
        // this.fatherName = new Name("");
    }

    public long getRegisterNo(){
        return this.registerNo;
    }
    public Name getStudName() {
        return this.studName;
    }
    public String getGender(){
        return this.gender;
    }
    public Address getAddress(){
        return this.address;
    }
    public Name getFatherName(){
        return this.fatherName;
    }
    public Name getMotherName(){
        return this.motherName;
    }
    public Date getBirDate() {
        return this.birthDate;
    }
    public String getContact(){
        return this.contact;
    }
    public String getEmail(){
        return this.email;
    }
    public boolean setAddress(Address address){
        try{
        this.address=address;
        return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean setContact(String contact){
        try{
            this.contact=contact;
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean setEmail(String email){
        try{
            this.email=email;
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public void showDetails(){
        System.out.println(this.registerNo+" "+this.studName.getName()+" "+this.gender+" "+this.birthDate.toString()+" "+ this.address.getAddress()+" "+this.fatherName.getName()+" "+this.motherName.getName()+" "+this.contact+" "+this.email);
    }
    
}