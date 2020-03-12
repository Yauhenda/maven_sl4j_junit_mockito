package com.epam.untitled;

public class Second {
    
    private First first;

    public void check(){
        if("onetwo".equals(first.concatenateStrings("one", "two"))){
            first.concatenateStrings("two", "three");
        }
        else {
            first.concatenateStrings("one", "two");
        }
    }

    public void setFirst(First first) {
        this.first = first;
    }
}
