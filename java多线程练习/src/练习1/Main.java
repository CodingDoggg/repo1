package 练习1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpeakElephant speakElephant;
		SpeakCar speakCar;
		speakElephant=new SpeakElephant();
		speakCar=new SpeakCar();
		speakElephant.start();
		speakCar.start();
		Class class1=speakCar.getClass();
		Class class2=SpeakCar.class;
		String s=speakCar.getName();//得到包以及类名
		for(int i=1;i<=15;i++) {
			System.out.print("主人"+i+" ");
			
		}
	}

}
