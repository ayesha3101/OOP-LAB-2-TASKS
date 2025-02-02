package lab2tasks;
import java.util.ArrayList;
public class task2 {
    public static void main(String[] args){
        ArrayList<String> ToDoList = new ArrayList<>();
        ToDoList.add("do your homework");
        ToDoList.add("wash the dishes");
        ToDoList.add("go for groceries");
        ToDoList.add("sleep");
        ToDoList.add("cook food");
        for(String element : ToDoList){
            System.out.println(element);
        }
        System.out.println("array list after removing one element");
        ToDoList.remove("wash the dishes");
        for(String element: ToDoList){
            System.out.println(element);
        }
    }

}