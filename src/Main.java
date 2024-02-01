//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {

        //Given the array of integers and target value, return the indices
        // of the two numbers that add up to the target.
        // P1
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = Problems.twoSum(nums, target);
        System.out.println("The indices are: " + result[0] + " and " + result[1]);

        // P2
        int x = 121;
        int y = 123;
        boolean result2 = Problems.isPalindrome(x);
        boolean result3 = Problems.isPalindrome(y);
        System.out.println("The result is: " + result2);
        System.out.println("The result is: " + result3);

        // P3
        String[] strs = {"flower", "flow", "flight"};
        String result4 = Problems.longestCommonPrefix(strs);
        System.out.println("The result is: " + result4);

        // P4
        String roman = "MCMXCIV";
        int result5 = Problems.romanToInt(roman);
        System.out.println("The result is: " + result5);

        //P5
        String s = "()[]{}";
        boolean result9 = Problems.isValid(s);
        System.out.println("The result is: " + result9);

        // P6
        Problems.ListNode list1 = new Problems.ListNode(1);
        list1.next = new Problems.ListNode(2);
        list1.next.next = new Problems.ListNode(4);

        Problems.ListNode list2 = new Problems.ListNode(1);
        list2.next = new Problems.ListNode(3);
        list2.next.next = new Problems.ListNode(4);

        Problems.ListNode result6 = Problems.mergeTwoLists(list1, list2);
        while(result6 !=null)
        {
            System.out.print(result6.val + " ");
            result6 = result6.next;
        }

        System.out.println();

        // P7
        int[] digits = {1, 2, 3};
        int[] result7 = Problems.plusOne(digits);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

}