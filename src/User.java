import java.util.ArrayList;

public class User {
    private String _name;
    private String _membership;
    private String _color;
    private String _location;
    private String _favouritefood;

    public User(String name) {
        set_name(name);
    }

    public String toString(){
        return get_name() + " " + get_membership();
    }

    public  boolean equals(User u2){
        return get_name().equals(u2.get_name()) && get_membership().equals(u2.get_membership());
    }

    public User(){

    }

    public User(String name, String membership) {
        set_name(name);
        set_membership(membership);
    }

    void set_name(String name) {
        _name = name;
    }


    String get_name() {
        return _name;
    }

    //membership
    void set_membership(String membership) {
        _membership = membership;
    }

    String get_membership() {
        return _membership;
    }

    /**
     * Using Enums
     */
    void set_color(Favcolor color) {
        _color = color.name();
    }

    public enum Favcolor {
        Blue, Red, Yellow, Green
    }

    String get_color() {
        return _color;
    }

    void set_location(Location location) {
        _location = location.name();
    }

    public enum Location {
        Kigali, Nyarugenge, Gasabo
    }

    String get_location() {
        return _location;
    }

    void set_favouritefood(Favouritefood favouritefood){
        _favouritefood = favouritefood.name();
    }

    public enum Favouritefood{
        Ibiraha, Rice, Isombe //again not true
    }

    String get_favouritefood() {
        return _favouritefood;
    }

}