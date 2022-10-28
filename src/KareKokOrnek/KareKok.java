package KareKokOrnek;

public class KareKok {

	public static void main(String[] args) {
		int i;
		double x;
		for(i=1;i<=6;i++)
		{
			x=Math.sqrt(i);//Verilen bir sayinin karekokunu hesaplamakta kullanilan sqrt()
			//metodunun Math sinifinda bildirildiğini belirtmek için 
			System.out.println(i +"in/ün/nin kare kökü = " +x);
		}

	}

}
