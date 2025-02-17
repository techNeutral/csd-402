import java.util.ArrayList;
import java.util.Scanner;
public class FullerAssignment8Original {
    public static void main(String[] args) {
        FullerArrayListTest myListObject = new FullerArrayListTest();
        myListObject.AddIntToArrayList(myListObject.PromptUserForInteger());
        myListObject.AddIntToArrayList(myListObject.PromptUserForInteger());
        myListObject.AddIntToArrayList(myListObject.PromptUserForInteger());
         //FullerArrayListTest.PromptUserForIntegerToAddToList();
         //FullerArrayListTest.PromptUserForIntegerToAddToList();
        System.out.println(FullerArrayListTest.max(myListObject.getArrayList()));
        ArrayList<Integer> myArrayList = new ArrayList<>();
        System.out.println(FullerArrayListTest.max(myArrayList));
    }
}
class FullerArrayListTest{
    ArrayList<Integer> arrayList;
    Scanner input;

    FullerArrayListTest(){
        arrayList = new ArrayList<>();
        input = new Scanner(System.in);
    }

    public void AddIntToArrayList(int number){
        this.arrayList.add(number);
    }

    public int PromptUserForInteger() {
        int number = 0;
        boolean valid = false;
        boolean exceptionThrown = false;
        while (!valid) {
            System.out.println("Please enter an integer to add to the list!");
            try {
                Scanner input = new Scanner(System.in);
                number = input.nextInt();
            } catch (java.util.InputMismatchException e) {
                exceptionThrown = true;
            }
            if (!exceptionThrown) {
                valid = true;
            } else {
                System.out.println("Please enter a valid integer!");
            }
            exceptionThrown = false;
        }
        return number;
    }

    public static Integer max(ArrayList<Integer> list){
        Integer max = 0;
        if(list.size() > 0){
            for (Integer i : list){
                if (max < i){
                    max = i;
                }
            }
        }
        return max;
    }
    public ArrayList<Integer> getArrayList(){
        return arrayList;
    }

    public String toString(){
        String output = "";
        for (Integer i : arrayList) {
            output += i + " ";
        }
        return output;
    }

}