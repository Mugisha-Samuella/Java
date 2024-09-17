package Basics1;

public class School {
    String _schoolname;
    String _schooladdress;

    public School(String schoolname, String schooladdress){
        set_schoolname(schoolname);
        set_schooladdress(schooladdress);
    }

    void set_schoolname(String schoolname){
        _schoolname = schoolname;
    }

    public String get_schoolname(){
        return _schoolname;
    }


    void set_schooladdress(String schooladdress){
        _schooladdress = schooladdress;
    }

    public String get_schooladdress(){
        return _schooladdress;
    }
}
