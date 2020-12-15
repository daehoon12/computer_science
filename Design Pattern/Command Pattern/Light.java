public class Light {

    private String location;

    public Light(String location){
        this.location=location;
    }

    public void on(){
        System.out.println(location + "전등 켜짐");
    }
    public void off(){
        System.out.println(location + "전등 꺼짐");
    }
}
