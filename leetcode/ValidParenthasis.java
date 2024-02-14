class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> x = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
        if(c == '(')
			x.push(')');
		else if(c == '{')
			x.push('}');
		else if(c == '[')
			x.push(']');
		else if(x.isEmpty() || x.pop() != c)
			return false;
        }
        return x.isEmpty();
    }
}
