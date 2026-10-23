 import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");

   // Today, I went to the park to take a walk with my annoying friend. It was a great day for the dog, we had a good time. We went to go get lunch at a chinese restaurant near my house. After, we went back home to play video games. We got bored after a while so we started watching Game of Thrones. After we finished the season, it was around 5am, we finally went to sleep. The next morning, we had breakfast, then I dropped him off back at his house, then I walked back home. It was a very fun hangout!

   String adjective1 = "annoying";
   String place1 = "park";
   String verb1 = "walk";
   String noun1 = "dog";
   String adjective2 = "fun";
   String place2 = "restaurant";
   String verb2 = "play";
   String noun2 = "friend";
   String place3 = "house";
   String noun3 = "games";

   String sentence1 = "Today, I went to the " + place1 + " to take a " + verb1 + " with my " + adjective1 + " " +  noun2 + ".";
   String sentence2 = "It was a great day for the " + noun1 + ", we had a good time.";
   String sentence3 = "We went to go get lunch at a chinese " + place2 + " near my " + place3 + "."; 
   String sentence4 = "After, we went back home to " + verb2 + " video " + noun3 + ".";
   String sentence5 = "We got bored after a while so we started watching Game of Thrones.";
   String sentence6 = "After we finished the season, it was around 5am, we finally went to sleep.";
   String sentence7 = "The next morning, we had breakfast, then I dropped him off back at his house, then I walked back home. It was a very " + adjective2 + " hangout!";

   System.out.println(sentence1);
   System.out.println(sentence2);
   System.out.println(sentence3);
   System.out.println(sentence4);
   System.out.println(sentence5);
   System.out.println(sentence6);
   System.out.println(sentence7);

   Scanner scan = new Scanner(System.in);
   
   System.out.println("provide the place");
   place1 = scan.nextLine();
   System.out.println("provide the verb");
   verb1 = scan.nextLine();
   System.out.println("provide the adjective");
   adjective1 = scan.nextLine();
   System.out.println("provide the noun");
   noun2 = scan.nextLine();
   System.out.println("provide the noun");
   noun1 = scan.nextLine();
   System.out.println("provide the place");
   place2 = scan.nextLine();
   System.out.println("provide the place");
   place3 = scan.nextLine();
   System.out.println("provide the verb");
   verb2 = scan.nextLine();
   System.out.println("provide the noun");
   noun3 = scan.nextLine();
   System.out.println("provide the adjective");
   adjective2 = scan.nextLine();

   sentence1 = "Today, I went to the " + place1 + " to take a " + verb1 + " with my " + adjective1 + " " +  noun2 + ".";
   sentence2 = "It was a great day for the " + noun1 + ", we had a good time.";
   sentence3 = "We went to go get lunch at a chinese " + place2 + " near my " + place3 + "."; 
   sentence4 = "After, we went back home to " + verb2 + " video " + noun3 + ".";
   sentence5 = "We got bored after a while so we started watching Game of Thrones.";
   sentence6 = "After we finished the season, it was around 5am, we finally went to sleep.";
   sentence7 = "The next morning, we had breakfast, then I dropped him off back at his house, then I walked back home. It was a very " + adjective2 + " hangout!";


   System.out.println(sentence1);
   System.out.println(sentence2);
   System.out.println(sentence3);
   System.out.println(sentence4);
   System.out.println(sentence5);
   System.out.println(sentence6);
   System.out.println(sentence7);

   scan.close();

   }
}
