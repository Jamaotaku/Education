class CharDemo {
	public static void main(String args[]) {
		char sym;
		int i;
		sym = 'H';
		i = sym; //i=72
		i = i + 1; //i=73
		sym =(char) i; //sym=??
		sym = (char) 93;
		System.out.println("sym is " + sym);
		System.out.println("i is " + i);
	}
}