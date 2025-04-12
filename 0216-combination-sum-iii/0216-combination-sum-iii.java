class Solution {
     public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(k, n, 1, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int k, int target, int start, List<Integer> combination, List<List<Integer>> result) {
        if (k == 0 && target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }

        if (k == 0 || target <= 0)
            return;

        for (int i = start; i <= 9; i++) {
            combination.add(i);
            backtrack(k - 1, target - i, i + 1, combination, result);
            combination.remove(combination.size() - 1);
        }
    }

}