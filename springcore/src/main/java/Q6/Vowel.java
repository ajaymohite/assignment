package Q6;

public class Vowel {

	String st[];

	public String[] getSt() {
		return st;
	}

	public void setSt(String[] st) {
		this.st = st;
	}

	public void show() {
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
	}

	public void result()
	{
		for(String a:st)
		{
			String st1=a.replaceAll("[aeiouAEIOU]", "");
			if(a.equals(st1))
			{
				System.out.println(a);
				
			}
		}
	}

}
