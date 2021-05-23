package Structural.FacadePattern;

public class Main {

    public static void main(String[] args) {
        VideoConverter videoConverter = new VideoConverter();
        String result = videoConverter.convert("home/user/Desktop/deneme.mp4", "mp4");
        System.out.println(result);
    }
}
