package desuev.ru.sberlesson7;

import desuev.ru.sberlesson7.API.BasicItem;

enum ItemTypes{
    FIRST(0),
    SECOND(1),
    THIRD(2),
    FOURTH(3);

    int type;

    ItemTypes(int type){
        this.type = type;
    }

    public int getType(){
        return type;
    }

}

public class Contact implements BasicItem {

    private String firstName;
    private String secondName;
    private String number;
    private int type;

    public Contact(String firstName, String secondName, String number, int type){
        this.firstName = firstName;
        this.secondName = secondName;
        this.number = number;
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public int getType() {
        return type;
    }
}
