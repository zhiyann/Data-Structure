public class ReverseString {
	
	private int maxSize;
	private char [] stackArr;
	private int top = -1;
	
	public ReverseString(String toBeConvertedString) {
		this.stackArr = convertToChar(toBeConvertedString);
		this.maxSize = stackArr.length;
	}
	
	public void push(char currentCharacter) {
		if(!isFull())
			this.stackArr[++top]=currentCharacter;
		else
			System.out.println("Stack is full");
	}
	
	public char pop() {
		if(!isEmpty())
			return this.stackArr[top--];
		else
			return '-';
	}
	
	public void peak() {
		System.out.println("Top of the Stack: "+this.stackArr[top]); 
	}
	
	public void printStack() {
		System.out.println("-----");
		for(int i = this.top; i>=0; i--) {
			if(i==this.top)
				System.out.println(this.stackArr[i]+"  <- SP");
			else
				System.out.println(this.stackArr[i]);
		}
		System.out.println("-----");
	}
	
	public char[] convertToChar(String toBeConvertedString) {
		char [] charArr = toBeConvertedString.toCharArray();
		return charArr;
	}
	
	private boolean isEmpty() {
		return (top == -1);
	}
	
	private boolean isFull() {
		return (maxSize-1 == top);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcdefg";
		ReverseString r = new ReverseString(a);
		for(int i = 0; i < r.maxSize; i++)
			r.push(r.stackArr[i]);
		r.peak();
		r.printStack();
		r.pop();
		r.printStack();
		r.push('z');
		r.printStack();
	}

}
