class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(fast != slow);

        slow = nums[0];
        while(fast != slow){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}


/*
1. think of it as a Linked List
2. map the array node to next node via node's value
3. since no. of elements are n and size is n+1 adn range [1, n], there always a number at that pos.
4. find cycle (using "do while loop")
5. find starting of a loop and return that node
*/
