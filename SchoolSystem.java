package ��Ŀ�汾����ʵ��;
import java.util.Scanner;
import java.util.ArrayList;
interface ISignUp{
  // ��ӡ������
  public void print();
  // ����Ƿ��� stuType��Ӧ�İ༶����
  // ���û��ʣ������뷵�� false ������ѧ������������ð༶������ true
  public boolean addStudent (int stuType);
  // ��������������Ĳ�������ʽ�������ĵ�����
public static IParams parse() throws Exception{
	...
};
}
interface IParams{
  public int getBig();
  public int getMedium();
  public int getSmall();
  // ��ȡ��ѧ���У����� [1 2 2 3] ��ʾ ���α�����ѧһ�����ѧ�����а�ѧ�����а�ѧ����С��ѧ��
  public ArrayList<Integer> getPlanSignUp ();
}

class kiderManagement implements IParams{
	Integer big;
	Integer medium;
	Integer small;
	Scanner in=new Scanner(System.in);
	public int getBig() {
		return big;
	}
	public int getMedium() {
		  return medium;
	  }
	public int getSmall() {
		  return small;
	  }
	public ArrayList<Integer> getPlanSignUp() {
		return null;
	}
}
public class SchoolSystem implements ISignUp{
	Integer big;
	Integer medium;
	Integer small;
	SchoolSystem (Integer big, Integer medium, Integer small){
		this.big=big;
		this.medium=medium;
		this.small=small;
	}
	public void print() {
    	  System.out.println();
      }
     public boolean addStudent (int stuType) {
    	  if(stuType=big) {
    		  if()
    	  }
      }
     String[] parse(String input) {
    	 
     }
public static void main(String[] args) throws Exception {
      IParams params = ISignUp.parse();//SchoolSystem.parse();
     
      SchoolSystem sc = new SchoolSystem (params.getBig(), params.getMedium(),params.getSmall());
      ArrayList<Integer> plan = params. getPlanSignUp ();
      for (int i = 0; i < plan.size(); i++) {
          sc. addStudent (plan.get(i));
      }
      sc.print();
}
