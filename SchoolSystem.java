package 项目版本管理实践;
import java.util.Scanner;
import java.util.ArrayList;
interface ISignUp{
  // 打印输出结果
  public void print();
  // 检查是否有 stuType对应的班级名额
  // 如果没有剩余名额，请返回 false ，否则学生将报名进入该班级并返回 true
  public boolean addStudent (int stuType);
  // 解析命令行输入的参数（格式），如文档描述
public static IParams parse() throws Exception{
	...
};
}
interface IParams{
  public int getBig();
  public int getMedium();
  public int getSmall();
  // 获取入学序列，例如 [1 2 2 3] 表示 依次报名入学一名大班学生，中班学生，中班学生，小班学生
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
