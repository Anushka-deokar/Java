//Reverse words in a given string

import java.util.*;  // Import Scanner class

class reverse_words
{
    // Function to reverse the order of words
    static private String result(String s)
    {
        int left = 0;
        int right = s.length() - 1;

        String temp = ""; // To store each word
        String ans = "";  // To store final reversed sentence

        // Traverse the string
        while (left <= right)
        {
            char ch = s.charAt(left);

            if (ch != ' ')
            {
                // Build the current word
                temp += ch;
            }
            else if (ch == ' ')
            {
                // When space found, add word to the beginning of ans
                if (!ans.equals(""))
                {
                    ans = temp + " " + ans;
                }
                else
                {
                    ans = temp;
                }
                temp = ""; // Reset word
            }
            left++;
        }

        // Add the last word (after loop ends)
        if (!temp.equals(""))
        {
            if (!ans.equals(""))
            {
                ans = temp + " " + ans;
            }
            else
            {
                ans = temp;
            }
        }

        return ans;
    }

    // Main method to take user input and display output
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);  // Create Scanner object
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();  // Take full line as input

        String reversed = result(s);  // Call function
        System.out.println("After reversing words:");
        System.out.println(reversed);

        sc.close(); // Close scanner
    }
}
