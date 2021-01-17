class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        genPar(list, "", 0, 0, n);
        return list;

    }

    private void genPar(List<String> list, String str, int open, int close, int max) {
        if (open == max && close == max) {
            list.add(str);
            return;
        }
        if (open < max) {
            genPar(list, str + "(", open + 1, close, max);
        }
        if (close < open) {
            genPar(list, str + ")", open, close + 1, max);
        }
    }
}
// difficulty: medium
// time: O(4^n/sqrt(n))
// space: O(4^n/sqrt(n)), bc arraylist
// backtracking solution