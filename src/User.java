public class User {
    private String _name;
    String membership;
    private String _color;
    private String _location;

    void set_name(String name){
        _name = name;
    }


    String get_name(){
        return _name;
    }

    /**
     * Using Enums
     */
    void set_color(Favcolor color){
        _color = color.name();
    }

    public enum Favcolor{
        Blue, Red, Yellow, Green
    }

    String get_color(){
        return _color;
    }

    void set_location(Location location){
        _location = location.name();
    }

    public enum Location{
        Kigali, Nyarugenge,Gasabo
    }

    String get_location(){
        return _location;
    }

    //Using Constructors
    //school
    private String _schoolname;
    private String _schooladdress;

    void set_schoolname(String schoolname){
        _schoolname = schoolname;
    }

    String get_schoolname(){
        return _schoolname;
    }


    void set_schooladdress(String schoolname){
        _schoolname = schoolname;
    }

    String get_schooladdress(){
        return _schoolname;
    }
}
