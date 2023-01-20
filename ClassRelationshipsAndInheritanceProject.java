package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        //creates a list
        ArrayList<Task> tasks = new ArrayList<Task>();
        Task t1 = new Task("Get out of bed", 1);
        t1.setComplexity(3);
        tasks.add(t1);
        Task t2 = new Task("Eat breakfast", 4);
        t2.setComplexity(2);
        tasks.add(t2);
        Task t3 = new Task("Get Dressed", 5);
        t3.setComplexity(10);
        tasks.add(t3);
        Task t4 = new Task("Brush Teeth", 5);
        t4.setComplexity(4);
        tasks.add(t4);
        Task t5 = new Task("Pack Backpack", 7);
        t5.setComplexity(1);
        tasks.add(t5);
        Task t6 = new Task("Drive to School", 3);
        t6.setComplexity(8);
        tasks.add(t6);
        Task t7 = new Task("Go to Class", 2);
        t7.setComplexity(5);
        tasks.add(t7);

        //prints the list before doing anything to it
        for (int i = 0; i < tasks.size(); i++) {
            Task temp = tasks.get(i);
            System.out.println(temp);
        }
        System.out.println();
        System.out.println("Sorted:");

        //sorts the list
        Collections.sort(tasks);

        //prints the list once it is sorted
        for (int i = 0; i < tasks.size(); i++) {
            Task temp = tasks.get(i);
            System.out.println(temp);
        }
    }
}

        //creates a class called task
        //uses the comparable interface which is needed for sorting
    class Task implements Comparable {

        String task = "";
        int priority = 0;
        int complexity = 0;

        public Task(String inName, int inPriority) {
            task = inName;
            priority = inPriority;
        }

        public void setComplexity(int inComplexity) {
            complexity = inComplexity;
        }

        public int getComplexity() {
            return complexity;
        }

        public void setPriority(int inPriority) {
            priority = inPriority;
        }

        public int getPriority() {
            return priority;
        }

        //sorts tasks using priority values and then if a tie emerges, uses complexity to further sort the tasks
        public int compareTo(Object o) {
            Task t2 = (Task) o;
            return Comparator.comparing(Task::getPriority).thenComparing(Task::getComplexity).compare(this, t2);
        }

        //prints out the list in a specific return format
        public String toString() {
            String result = "";
            result = task + "\n\tPriority: " + priority + "\n\tComplexity: " + complexity;
            return result;
        }
    }
