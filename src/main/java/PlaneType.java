public enum PlaneType {
    BOEING747(300),
    AIRBUS(400),
    BIPLANE(2),
    PRIVATE(40),
    SEAPLANE(8);


    public int capacity;
    PlaneType(int value){
        this.capacity = value;
    }

    public int getValue(){
        return this.capacity;
    }
}
