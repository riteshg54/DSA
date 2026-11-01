class Solution {
    public int thirdMax(int[] nums) {
        long gold = Long.MIN_VALUE;     // empty chairs
        long silver = Long.MIN_VALUE;
        long bronze = Long.MIN_VALUE;

        for (int x : nums) {
            if (x == gold || x == silver || x == bronze) {
                continue;               // already seated, ignore
            }
            if (x > gold) {
                bronze = silver;        // Silver slides down to Bronze
                silver = gold;          // Gold slides down to Silver
                gold = x;               // new champion
            } else if (x > silver) {
                bronze = silver;
                silver = x;
            } else if (x > bronze) {
                bronze = x;
            }
        }

        if (bronze == Long.MIN_VALUE) {
            return (int) gold;          // no third biggest, return the biggest
        }
        return (int) bronze;
    }
}