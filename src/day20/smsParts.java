package day20;

public class smsParts {
    public static void main(String[] args) {
        String sentence = "“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”";

            String sender = sentence.substring((sentence.indexOf("<")+1),sentence.indexOf(">"));
            String number = sentence.substring((sentence.indexOf("[")+1),sentence.indexOf("]"));
            String message = sentence.substring((sentence.indexOf("{")+1),sentence.indexOf("}"));

        System.out.println("Sender: " + sender + "\nNumber: " + number + "\nMessage: "+message);


        }
}