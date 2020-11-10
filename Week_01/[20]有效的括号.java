class Solution {
    public boolean isValid(String s) {
        Stack<Character> memo =new Stack<>();
        for(int i=0; i<s.length(); i++){
            char item = s.charAt(i);
            if (item == '('){
                memo.push(')');
            }else if(item == '['){
                memo.push(']');
            }else if(item == '{'){
                memo.push('}');
            }else{
                if (memo.isEmpty() || ((char) memo.pop())!=item){
                    return false;
                }
            }
        }
        if (memo.isEmpty()) return true;
        return false;
        
    }
}