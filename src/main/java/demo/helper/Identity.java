package demo.helper;

//# hashcode-equals
// Why hash equal should be overriden when ever hash is implimented ?
public class Identity implements Cloneable{

    private String lastName;
    private String firstName ;
    private String ssn;
    private String dob;

    public Identity(String dob, String lastName, String firstName, String ssn) {
        this.dob = dob;
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    public Identity( ) {
        this.dob = "dummyDOB";
        this.lastName = "dummylastname";
        this.firstName = "dummyFirstName";
        this.ssn = "dummySSN";
    }


    public Identity clone()throws CloneNotSupportedException{
        return (Identity)super.clone();
    }
    @Override
    public int hashCode(){
        // criteria for uniqueness : ID
        return 556 * (lastName.hashCode()+firstName.hashCode()+ssn.hashCode()-dob.hashCode()) * lastName.length();
    }


    @Override
    public boolean equals(Object id2 ){
        // process of identification by comparision
        return this.hashCode() == id2.hashCode();
    }


    public boolean superEqual(Object id2){
        return super.equals(id2);
    }


    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }







}
