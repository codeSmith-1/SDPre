public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    for (int i = 1; i <= 20; i++){
      if (counter % 2 == 0) {
        System.out.println(counter +" is even");
      }
      else {
        System.out.println(counter +" is odd");
      }
      counter++;
    }
  }
}
/* Why even use the counter?
We can achieve the same result by testing and printing i */

// public class Objective8Lab3 {
//   public static void main(String[] args) {
//
//     for (int i = 1; i <= 20; i++){
//       if (i % 2 == 0) {
//         System.out.println(i +" is even");
//       }
//       else {
//         System.out.println(i +" is odd");
//       }
//     }
//   }
// }
