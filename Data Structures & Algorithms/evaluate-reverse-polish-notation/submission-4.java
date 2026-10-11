class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();

        for(String str:tokens){
            if(str.equals("+")){
                stk.push(stk.pop() + stk.pop());
            } else if(str.equals("*")){
                stk.push(stk.pop() * stk.pop());
            } else if(str.equals("-")){
                int num2 = stk.pop();
                int num1 = stk.pop();
                stk.push(num1-num2);
            } else if(str.equals("/")){
                int num2 = stk.pop();
                int num1 = stk.pop();
                if(num1==0) stk.push(0);
                else stk.push(num1/num2);
            } else{
                stk.push(Integer.parseInt(str));
            }
        }

        return stk.pop();
    }
}
