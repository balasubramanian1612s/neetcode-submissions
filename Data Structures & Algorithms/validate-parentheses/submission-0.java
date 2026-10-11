class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stk.isEmpty() && isValidClose(stk.peek(), c)){
                stk.pop();
            }else{
                stk.push(c);
            }
        }

        if(!stk.isEmpty()) return false;

        return true;
    }

    public boolean isValidClose(char top, char curr){
        if(top=='{' && curr=='}') return true;
        if(top=='[' && curr==']') return true;
        if(top=='(' && curr==')') return true;

        return false;
    }
}
